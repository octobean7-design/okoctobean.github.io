plugins {
    id("com.android.application")
}

android {
    namespace = "ru.bezpaniki.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "ru.bezpaniki.driver.pro"
        minSdk = 24
        targetSdk = 34
        versionCode = 27
        versionName = "2.7.0-PRO"
    }

    signingConfigs {
        create("releaseKey") {
            storeFile = file("bezpaniki-release.jks")
            storePassword = "BezPaniki2026"
            keyAlias = "bezpaniki_key"
            keyPassword = "BezPaniki2026"
            enableV1Signing = true
            enableV2Signing = true
        }
    }

    buildTypes {
        getByName("debug") {
            signingConfig = signingConfigs.getByName("releaseKey")
        }
        getByName("release") {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("releaseKey")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
}
