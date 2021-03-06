val kotlinVersion = "1.7.10"
val gradleToolsVersion = "7.2.0"

val retrofitVersion = "2.9.0"
val ktxCoreVersion = "1.6.0"
val appCompatVersion = "1.4.1"
val materialVersion = "1.5.0"
val junitVersion = "4.13.2"
val androidTestJunitVersion = "1.1.3"
val androidTestEspressoCoreVersion = "3.4.0"
val koinVersion = "3.1.5"
val viewmodelLifecycleVersion = "2.4.0"

extra["gradleTools"] = "com.android.tools.build:gradle:$gradleToolsVersion"
extra["kotlin"] = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
extra["retrofit"] = "com.squareup.retrofit2:retrofit:$retrofitVersion"
extra["appCompat"] = "androidx.appcompat:appcompat:$appCompatVersion"
extra["material"] = "com.google.android.material:material:$materialVersion"
extra["androidJunit"] = "androidx.test.ext:junit:$androidTestJunitVersion"
extra["androidEspresso"] = "androidx.test.espresso:espresso-core:$androidTestEspressoCoreVersion"
extra["koin"] = "io.insert-koin:koin-android:$koinVersion"
extra["viewmodelLifecycle"] = "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewmodelLifecycleVersion"
extra["junit"] = "junit:junit:$junitVersion"
extra["koin"] = "io.insert-koin:koin-core:$koinVersion"
extra["koinAndroid"] = "io.insert-koin:koin-android:$koinVersion"
extra["ktxCore"] = "androidx.core:core-ktx:$ktxCoreVersion"
