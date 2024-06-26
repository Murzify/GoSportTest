plugins {
    id("foodies.android-lib")
    id("foodies.hilt")
    alias(libs.plugins.serialization)
}

android.namespace = "com.murzify.foodies.core.network"

dependencies {
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.ktor.client.negotiation)
    implementation(libs.ktor.serialization.json)

    implementation(libs.kotlinx.serialization)

    testImplementation(libs.junit)
}