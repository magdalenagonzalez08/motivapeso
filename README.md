# MotivaPeso

[![Descargar APK](https://img.shields.io/badge/Descargar-APK%20v1.0-FF7A45?style=for-the-badge&logo=android)](https://github.com/magdalenagonzalez08/motivapeso/releases/latest)
![Android 10+](https://img.shields.io/badge/Android-10%2B-3DDC84?style=flat-square&logo=android)
![Tamaño](https://img.shields.io/badge/tamaño-~3%20MB-lightgrey?style=flat-square)
![Acción](https://img.shields.io/github/actions/workflow/status/magdalenagonzalez08/motivapeso/build-apk.yml?branch=main&style=flat-square)
![Licencia](https://img.shields.io/badge/licencia-MIT-blue?style=flat-square)

Esto lo hice para mí, la verdad. Es una app para no perderle el seguimiento al peso cuando andas tratando de ganar masa: el peso, el agua, lo que comes, el entrenamiento y esas cosas que se te olvidan a mitad de semana.

La interfaz es una página HTML que metí dentro de una app Android bien liviana, ocupa menos de 3 MB. Funciona en celulares viejos, tiene modo oscuro y también un modo ligero por si tu teléfono va lento.

## Así se ve

![Pantalla de inicio](docs/inicio.png)

## Bajarla

**[Descargar MotivaPeso v1.0](https://github.com/magdalenagonzalez08/motivapeso/releases/latest)**

Ábrela en el celular y dale a instalar. Si el teléfono avisa que es una app de fuente desconocida, es normal: no está en Play Store. Dale a "instalar de todos modos" y listo.

## Qué tiene

- Primera vez que la abres: te pregunta tu peso actual, tu peso inicial y tu meta (todo editable después en Ajustes → Mis datos)
- Frases motivacionales para cuando se cae la constancia
- Gráfica del peso con anillo de progreso hacia tu meta
- Mis rutinas de fuerza (A los miércoles, B los viernes) con los ejercicios, series y pesos que uso
- Vasos de agua con meta de 2 litros y registro de la última vez que bebiste
- Registro de baño con gráfica de la semana (sí, también quería ver cuántas veces orinaba al día, sin culpa)
- Botón de "Hoy corrí o entrené" con cuánto tiempo ha pasado desde el último
- Notas de comida con hora
- Mi horario de las dos carreras, con las clases del día y tabla semanal
- Todo en español, tema claro y oscuro, y se puede cambiar el color de la app
- Exportar la bitácora del día o el historial a un .txt en Descargas

## Si quieres compilarla

Cada vez que subo cambios a la rama `main`, GitHub Actions genera el APK nuevo solo (pestaña Actions). O abre la carpeta `android` con Android Studio y dale Run.

## Lo que todavía le falta

- Recordatorios de agua y comida
- Que funcione sin internet y sincronice entre dispositivos
- Hacerla 100% nativa en Kotlin, algún día

## Licencia

MIT. Úsala, cópiala, cámbiala. Si te sirve, úsala.

Hecha por Magdalena.
