plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.appclinica"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.appclinica"
        minSdk = 25
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // AndroidX AppCompat (ya tienes)
    implementation("androidx.appcompat:appcompat:1.6.1")

    // Core KTX (revisa que libs.androidx.core.ktx está bien)
    implementation(libs.androidx.core.ktx)

    // Lifecycle (revisar)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Material Components (UI tradicional)
    implementation ("com.google.android.material:material:1.9.0")

    // ConstraintLayout (UI tradicional)
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    // RecyclerView (UI tradicional)
    implementation ("androidx.recyclerview:recyclerview:1.3.0")

    // CardView (UI tradicional)
    implementation ("androidx.cardview:cardview:1.0.0")

    // Las demás que usas para Compose, mantenlas
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)

    // Test
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}