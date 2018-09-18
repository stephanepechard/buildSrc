// Kotlin + buildSrc for Better Gradle Dependency Management
// see: https://handstandsam.com/2018/02/11/kotlin-buildsrc-for-better-gradle-dependency-management/

object Version {
    const val androidSdk = 28
    const val androidSdkMin = 16
    const val androidX = "2.0.0-alpha1"
    const val anko = "0.10.5"
    const val archComponents = "1.1.1"
    const val archNavigation = "1.0.0-alpha03"
    const val archPaging = "1.0.0"
    const val archRoom = "1.1.1"
    const val archWorkManager = "1.0.0-alpha08"
    const val buildTools = "28.0.2"
    const val constraint = "1.1.2"
    const val dokka = "0.9.17"
    const val junit = "4.12"
    const val gradle = "3.0.1"
    const val kluent = "1.39"
    const val kotlin = "1.2.60"
    const val kotlinXCoroutines = "0.22.5"
    const val moshi = "1.6.0"
    const val multidex = "1.0.3"
    const val okHttp = "3.10.0"
    const val picasso = "2.5.2"
    const val playServices = "15.0.1"
    const val retrofit = "2.4.0"
    const val rxAndroid = "2.0.2"
    const val rxJava = "2.1.16"
    const val supportLib = "27.1.1"
    const val timber = "4.7.1"
    const val threetenabp = "1.1.0"
}


object Dependencies {
    // Android
    const val gradleTools = "com.android.tools.build:gradle:${Version.gradle}"
    private const val support = "com.android.support"
    const val supportV4Compat = "$support:support-compat:${Version.supportLib}"
    const val supportV4CoreUtils = "$support:support-core-utils:${Version.supportLib}"
    const val supportV4CoreUi = "$support:support-core-ui:${Version.supportLib}"
    const val supportV4MediaCompat = "$support:support-media-compat:${Version.supportLib}"
    const val supportV4Fragment = "$support:support-fragment:${Version.supportLib}"
    const val supportV7Appcompat = "$support:appcompat-v7:${Version.supportLib}"
    const val supportV7Cardview = "$support:cardview-v7:${Version.supportLib}"
    const val supportV7GridLayout = "$support:gridlayout-v7:${Version.supportLib}"
    const val supportV7Palette = "$support:palette-v7:${Version.supportLib}"
    const val supportV7Preference = "$support:preference-v7:${Version.supportLib}"
    const val supportV7RecyclerView = "$support:recyclerview-v7:${Version.supportLib}"
    const val supportV13 = "$support:support-v13:${Version.supportLib}"
    const val supportV14Preference = "$support:preference-v14:${Version.supportLib}"
    const val supportV17LeanBack = "$support:leanback-v17:${Version.supportLib}"
    const val supportV17PreferenceLeanBack = "$support:preference-leanback-v17:${Version.supportLib}"

    const val supportAnnotations = "$support:support-annotations:${Version.supportLib}"
    const val supportCustomTabs = "$support:customtabs:${Version.supportLib}"
    const val supportDesign = "$support:design:${Version.supportLib}"
    const val supportExif = "$support:exifinterface:${Version.supportLib}"
    const val supportRecommendation = "$support:recommendation:${Version.supportLib}"
    const val supportVectorDrawable = "$support:support-vector-drawable:${Version.supportLib}"
    const val supportAnimatedVectorDrawable = "$support:animated-vector-drawable:${Version.supportLib}"
    const val supportWear = "$support:wear:${Version.supportLib}"

    // those have specific version number
    const val supportConstraint = "$support.constraint:constraint-layout:${Version.constraint}"
    const val supportMultidex = "$support:multidex:${Version.multidex}"

    // Play Services
    const val playServicesAds = "com.google.android.gms:play-services-ads:${Version.playServices}"
    const val playServicesAnalytics = "com.google.android.gms:play-services-analytics:${Version.playServices}"
    const val playServicesAwareness = "com.google.android.gms:play-services-awareness:${Version.playServices}"
    const val playServicesBase = "com.google.android.gms:play-services-base:${Version.playServices}"
    const val playServicesCast = "com.google.android.gms:play-services-cast:${Version.playServices}"
    const val playServicesDrive = "com.google.android.gms:play-services-drive:${Version.playServices}"
    const val playServicesFit = "com.google.android.gms:play-services-fitness:${Version.playServices}"
    const val playServicesGames = "com.google.android.gms:play-services-games:${Version.playServices}"
    const val playServicesGCM = "com.google.android.gms:play-services-gcm:${Version.playServices}"
    const val playServicesLocation = "com.google.android.gms:play-services-location:${Version.playServices}"
    const val playServicesLogin = "com.google.android.gms:play-services-auth:${Version.playServices}"
    const val playServicesMaps = "com.google.android.gms:play-services-maps:${Version.playServices}"
    const val playServicesNearby = "com.google.android.gms:play-services-nearby:${Version.playServices}"
    const val playServicesPanorama = "com.google.android.gms:play-services-panorama:${Version.playServices}"
    const val playServicesPay = "com.google.android.gms:play-services-wallet:${Version.playServices}"
    const val playServicesPlaces = "com.google.android.gms:play-services-places:${Version.playServices}"
    const val playServicesPlus = "com.google.android.gms:play-services-plus:${Version.playServices}"
    const val playServicesSafetyNet = "com.google.android.gms:play-services-safetynet:${Version.playServices}"
    const val playServicesSignIn = "com.google.android.gms:play-services-identity:${Version.playServices}"
    const val playServicesVision = "com.google.android.gms:play-services-vision:${Version.playServices}"
    const val playServicesWearable = "com.google.android.gms:play-services-wearable:${Version.playServices}"

    // Arch components, see: https://developer.android.com/topic/libraries/architecture/adding-components.html
    private const val arch = "android.arch"
    const val archLifecycleRuntime = "$arch.lifecycle:runtime:${Version.archComponents}"
    const val archLifecycleExtensions = "$arch.lifecycle:extensions:${Version.archComponents}"
    const val archLifecycleCompiler = "$arch.lifecycle:compiler:${Version.archComponents}"
    const val archLifecycleCompilerJ8 = "$arch.lifecycle:common-java8:${Version.archComponents}"
    const val archCoreTest = "$arch.core:core-testing:${Version.archComponents}"
    const val archNavigationFrag = "$arch.navigation:navigation-fragment-ktx:${Version.archNavigation}"
    const val archNavigationUi = "$arch.navigation:navigation-ui-ktx:${Version.archNavigation}"
    const val archNavigationSafeArgs = "$arch.navigation:navigation-safe-args-gradle-plugin:${Version.archNavigation}"
    const val archRoomRuntime = "$arch.persistence.room:runtime:${Version.archRoom}"
    const val archRoomCompiler = "$arch.persistence.room:compiler:${Version.archRoom}"
    const val archRoomRxjava = "$arch.persistence.room:rxjava2:${Version.archRoom}"
    const val archWorkManager = "$arch.work:work-runtime:${Version.archWorkManager}"

    // junit
    const val junit = "junit:junit:${Version.junit}"

    // Kotlin
    const val anko = "org.jetbrains.anko:anko:${Version.anko}"
    const val dokkaGradlePlugin = "org.jetbrains.dokka:dokka-gradle-plugin:${Version.dokka}"
    const val kluent = "org.amshove.kluent:kluent-android:${Version.kluent}"
    const val kotlinAndroidExtensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Version.kotlin}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinXCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.kotlinXCoroutines}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Version.kotlin}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"

    // Square++ stuff
    const val moshi = "com.squareup.moshi:moshi:${Version.moshi}"
    const val moshiKotlin = "com.squareup.moshi:moshi-kotlin:${Version.moshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"
    const val picasso = "com.squareup.picasso:picasso:${Version.picasso}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"
    const val timber = "com.jakewharton.timber:timber:${Version.timber}"
    const val threetenabp = "com.jakewharton.threetenabp:threetenabp:${Version.threetenabp}"

    // RxJava
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Version.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Version.rxAndroid}"
}
