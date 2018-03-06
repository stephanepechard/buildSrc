// Kotlin + buildSrc for Better Gradle Dependency Management
// see: https://handstandsam.com/2018/02/11/kotlin-buildsrc-for-better-gradle-dependency-management/

object Version {
    const val archComponents = "1.1.0"
    const val anko = "0.10.4"
    const val buildTools = "26.0.2"
    const val dokka = "0.9.15"
    const val constraint = "1.0.2"
    const val junit = "4.12"
    const val kluent = "1.35"
    const val kotlin = "1.2.30"
    const val moshi = "1.5.0"
    const val okHttp = "3.10.0"
    const val picasso = "2.5.2"
    const val playServices = "11.8.0"
    const val retrofit = "2.3.0"
    const val room = "1.1.0-alpha3"
    const val rxJava = "2.1.9"
    const val sdk = 27
    const val sdkMin = 16
    const val supportLib = "27.0.2"
}

object Dependencies {
    // Android
    private const val support = "com.android.support"
    const val supportAnnotations = "$support:support-annotations:${Version.supportLib}"
    const val supportAppcompatV7 = "$support:appcompat-v7:${Version.supportLib}"
    const val supportCardview = "$support:cardview-v7:${Version.supportLib}"
    const val supportConstraint = "$support.constraint:constraint-layout:${Version.constraint}"
    const val supportDesign = "$support:design:${Version.supportLib}"
    const val supportExif = "$support:exifinterface:${Version.supportLib}"
    const val supportGridLayout = "$support:gridlayout-v7:${Version.supportLib}"
    const val supportRecyclerView = "$support:recyclerview-v7:${Version.supportLib}"

    // Play Services
    const val playServicesGCM = "com.google.android.gms:play-services-gcm:${Version.playServices}"
    const val playServicesLoc = "com.google.android.gms:play-services-location:${Version.playServices}"
    const val playServicesMaps = "com.google.android.gms:play-services-maps:${Version.playServices}"

    // Arch components
    const val archLifecycleRuntime = "android.arch.lifecycle:runtime:${Version.archComponents}"
    const val archLifecycleExtensions = "android.arch.lifecycle:extensions:${Version.archComponents}"
    const val archLifecycleCompiler = "android.arch.lifecycle:common-java8:${Version.archComponents}"
    const val archRoomRuntime = "android.arch.persistence.room:runtime:${Version.room}"
    const val archRoomCompiler = "android.arch.persistence.room:compiler:${Version.room}"
    const val archRoomRxjava = "android.arch.persistence.room:rxjava2:${Version.room}"

    // junit
    const val junit = "junit:junit:${Version.junit}"

    // Kotlin
    const val anko = "org.jetbrains.anko:anko:${Version.anko}"
    const val dokkaGradlePlugin = "org.jetbrains.dokka:dokka-gradle-plugin:${Version.dokka}"
    const val kluent = "org.amshove.kluent:kluent:${Version.kluent}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    const val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
    const val kotlinJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Version.kotlin}"

    // Square++ stuff
    const val moshi = "com.squareup.moshi:moshi:${Version.moshi}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"

    const val picasso = "com.squareup.picasso:picasso:${Version.picasso}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
    const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:${Version.retrofit}"

    // RxJava
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Version.rxJava}"
}
