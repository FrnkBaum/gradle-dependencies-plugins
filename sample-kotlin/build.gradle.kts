import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("de.fayard.refreshVersions")
    id("de.fayard.dependencies")
    kotlin("jvm")
    `build-scan`
}

group = "de.fayard"

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
}

repositories {
    mavenCentral()
    google()
    jcenter()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap/")
}

fun DependencyHandler.implementations(deps: List<String>) =
    deps.forEach { implementation(it) }

fun DependencyHandler.testImplementations(deps: List<String>) =
    deps.forEach { testImplementation(it) }

dependencies {
    implementations(listOf(AndroidX.browser, AndroidX.cardView))
    testImplementations(listOf(KotlinX.coroutines.core, KotlinX.coroutines.coreCommon))
    testImplementations(listOf(Testing.kotlinTest.runner.jvm, Testing.kotlinTest.extensions.extensions))
    implementation("com.google.guava:guava:_")
    implementation("com.google.inject:guice:2.0")
    implementation("com.squareup.okhttp3:okhttp:3.10.0")
    implementation("com.squareup.okhttp3:okhttp-urlconnection:3.10.0")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.mongodb:mongo-java-driver:3.11.0")

}

tasks.register("run", JavaExec::class.java) {
    this.main = "de.fayard.GuavaTest"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType(JavaExec::class.java) {
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<DefaultTask>("hello") {
    group = "Custom"
    description = "Minimal task that do nothing. Useful to debug a failing build"
}
