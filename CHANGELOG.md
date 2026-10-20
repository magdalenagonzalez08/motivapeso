# Changelog

Todos los cambios importantes de MotivaPeso. El formato sigue [Keep a Changelog](https://keepachangelog.com/es-ES/1.1.0/) y la app usa [versionado semántico](https://semver.org/lang/es/).

## [2.2] - 2026-10-20

Versión enfocada en arreglar el historial. La instalación va encima de la 2.1 sin perder datos: mismo paquete (`com.motivapeso.app`) y misma firma.

### Corregido

- **El botón "Registrar peso de hoy" inventaba un peso.** Sumaba entre 0,1 y 0,4 kg al azar y lo guardaba como si fuera una medición real. Ahora abre una hoja donde escribes el peso y eliges la fecha.
- **El historial de peso mostraba el orden equivocado.** Los registros se guardaban desordenados y la app tomaba como "último" el que se había insertado al final, no el más reciente. Ahora se ordenan por fecha al cargar y al guardar.
- **Registros duplicados y fechas corruptas.** Dos pesos del mismo día o una fecha inválida mostraban filas repetidas y `NaN/NaN`. Ahora se fusionan por fecha y se descartan los datos que no se pueden leer.
- **El delta del historial era incorrecto** cuando los registros no estaban ordenados: comparaba con el siguiente de la lista, no con la medición anterior en el tiempo.
- **El historial de agua se llenaba de días vacíos.** Con solo abrir la app ya se creaba una fila con 0 vasos. Ahora solo se guarda cuando registras o quitas un vaso.
- **Historial de agua desordenado y duplicado.** Se ordena por fecha, se fusionan duplicados, se limita a 60 días y los vasos se recortan al rango 0–8.
- **Cambio de día con la app abierta.** Si dejabas la app abierta pasada la medianoche, los vasos de ayer se guardaban con la fecha de hoy. Ahora se detecta el cambio de día y se reinicia el contador.
- **"Restablecer todo" no borraba el historial de agua.** Quedaban días fantasma. Ahora limpia peso, agua, comidas, baño y preferencias.
- **Exportar no funcionaba en el APK.** El puente nativo para guardar archivos existía, pero el HTML nunca lo llamaba: el `.txt` no llegaba a Descargas. Ya funciona.
- **El historial de peso no se podía corregir.** Se agregó borrar un registro con doble toque.

### Agregado

- Sección **Actualizaciones** en Ajustes: consulta la última release de GitHub, compara versiones y ofrece el botón de descarga del APK.
- Versión visible en Ajustes (`v2.2 · build 4`).
- Aviso de "Estás al día" y opción de abrir las releases si no hay conexión.

### Cambiado

- El HTML de la app ahora tiene **una sola fuente de verdad**: `prototipo/index.html`. Antes existía una copia en `android/app/src/main/assets/` que se quedó vieja y hacía que las compilaciones locales mostraran una interfaz distinta a la del APK.
- El workflow de GitHub Actions verifica que el tag coincida con `versionName`, publica el APK como artefacto en cada push y genera la release con notas.

### Notas técnicas

- `versionCode` pasa de 3 a 4.
- Migración automática de datos anteriores: se conserva `motivapeso_v1` en `localStorage`, sin borrar nada.

## [2.1] - 2026-10-14

- Gráficas de historial de agua y comidas.
- Historial persistente por fecha para agua, baño y comidas.
- Escrituras de `localStorage` agrupadas y volcado al ocultar la página.
- Release firmada.

## [2.0] - 2026-10-11

- Arranque vacío, sin datos de ejemplo.
- Onboarding con peso actual, peso inicial y meta.
- Edición de peso propio y registro de última vez de agua y entrenamiento.

## [1.0] - 2026-10-11

- Primera versión: prototipo web, WebView Android y workflow de APK.
