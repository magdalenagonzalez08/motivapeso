plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.motivapeso.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.motivapeso.app"
        minSdk = 29
        targetSdk = 34
        versionCode = 5
        versionName = "2.3"
    }

    sourceSets {
        getByName("main") {
            // Una sola fuente de verdad: el HTML vive en prototipo/ y se empaqueta tal cual
            assets.srcDir(file("../../prototipo"))
        }
    }

    signingConfigs {
        create("release") {
            storeFile = file("../motivapeso.keystore")
            storePassword = "mp2026key"
            keyAlias = "motivapeso"
            keyPassword = "mp2026key"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            signingConfig = signingConfigs.getByName("release")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
