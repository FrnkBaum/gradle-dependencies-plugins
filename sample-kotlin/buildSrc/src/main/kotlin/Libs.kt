/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Update this file with
 *   `$ ./gradlew buildSrcVersions`
 */
object Libs {
    /**
     * https://github.com/square/okhttp
     */
    const val okhttp: String = "com.squareup.okhttp3:okhttp:" + Versions.com_squareup_okhttp3

    /**
     * https://github.com/square/okhttp
     */
    const val okhttp_urlconnection: String = "com.squareup.okhttp3:okhttp-urlconnection:" +
        Versions.com_squareup_okhttp3

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_scripting_compiler_embeddable: String =
        "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:" +
            Versions.org_jetbrains_kotlin

    /**
     * https://kotlinlang.org/
     */
    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:" +
        Versions.org_jetbrains_kotlin

    /**
     * http://www.mongodb.org
     */
    const val org_mongodb_mongo_java_driver: String = "org.mongodb:mongo-java-driver:" +
        Versions.org_mongodb_mongo_java_driver

    /**
     * http://code.google.com/p/google-guice/
     */
    const val com_google_inject_guice: String = "com.google.inject:guice:" +
        Versions.com_google_inject_guice

    const val org_jetbrains_kotlin_jvm_gradle_plugin: String =
        "org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:" +
            Versions.org_jetbrains_kotlin_jvm_gradle_plugin

    const val com_gradle_build_scan_gradle_plugin: String =
        "com.gradle.build-scan:com.gradle.build-scan.gradle.plugin:" +
            Versions.com_gradle_build_scan_gradle_plugin

    const val guava: String = "com.google.guava:guava:" + Versions.guava
}
