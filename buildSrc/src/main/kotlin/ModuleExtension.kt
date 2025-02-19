object ModuleExtension {
    const val compileSdkVersion = 33
    const val jvmTarget = "1.8"

    object DefaultConfigs {
        const val minSdkVersion = 21
        const val targetSdkVersion = 33
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val defaultConsumerProguardFiles = "consumer-rules.pro"
        const val proGuardRules = "proguard-rules.pro"
        const val defaultProguardOptimizeFileName = "proguard-android-optimize.txt"
    }

    object App {
        const val applicationId = "com.himanshoe.sample"
    }

    object FilePath {
        const val gitHooks = "gradle/scripts/git-hooks.gradle.kts"
    }
}
