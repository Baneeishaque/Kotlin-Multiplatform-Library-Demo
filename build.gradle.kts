plugins {
    kotlin("multiplatform") version "1.7.20-RC"
    // id("com.android.library") version "7.2.0"
}

group = "account.ledger"
version = "1.0-SNAPSHOT"

repositories {
    // google()
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
//        withJava()
        // testRuns["test"].executionTask.configure {
        //     useJUnitPlatform()
        // }
    }
    // android()
    // js(BOTH) {
    //     browser {
    //         commonWebpackConfig {
    //             cssSupport {
    //                 enabled = true
    //                 mode = org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackCssMode.INLINE
    //             }
    //         }
    //     }
    //     nodejs()
    // }
    // iosX64()
    // iosArm64()
    // iosSimulatorArm64()
    // tvosX64()
    // tvosArm64()
    // tvosSimulatorArm64()
    // watchosX64()
    // watchosArm64()
    // watchosSimulatorArm64()
    // linuxX64()
    // macosX64()
    // macosArm64()
    // mingwX64()

    sourceSets {

        val commonMain by getting
        // val nativeMain by creating
        val jvmMain by getting
        // val androidMain by getting
        // val jsMain by getting
        // val iosMain by creating
        // val iosX64Main by getting
        // val iosArm64Main by getting
        // val iosSimulatorArm64Main by getting
        // val tvosMain by creating
        // val tvosX64Main by getting
        // val tvosArm64Main by getting
        // val tvosSimulatorArm64Main by getting
        // val watchosMain by creating
        // val watchosX64Main by getting
        // val watchosArm64Main by getting
        // val watchosSimulatorArm64Main by getting
        // val linuxMain by creating
        // val linuxX64Main by getting
        // val macosMain by creating
        // val macosX64Main by getting
        // val macosArm64Main by getting
        // val windowsMain by creating
        // val mingwX64Main by getting

        // nativeMain.dependsOn(commonMain)
        // iosMain.dependsOn(nativeMain)
        // iosX64Main.dependsOn(iosMain)
        // iosArm64Main.dependsOn(iosMain)
        // iosSimulatorArm64Main.dependsOn(iosMain)
        // tvosMain.dependsOn(nativeMain)
        // tvosX64Main.dependsOn(tvosMain)
        // tvosArm64Main.dependsOn(tvosMain)
        // tvosSimulatorArm64Main.dependsOn(tvosMain)
        // watchosMain.dependsOn(nativeMain)
        // watchosX64Main.dependsOn(watchosMain)
        // watchosArm64Main.dependsOn(watchosMain)
        // watchosSimulatorArm64Main.dependsOn(watchosMain)
        // linuxMain.dependsOn(nativeMain)
        // linuxX64Main.dependsOn(linuxMain)
        // macosMain.dependsOn(nativeMain)
        // macosX64Main.dependsOn(macosMain)
        // macosArm64Main.dependsOn(macosMain)
        // windowsMain.dependsOn(nativeMain)
        // mingwX64Main.dependsOn(windowsMain)

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        // val nativeTest by creating
        val jvmTest by getting
        // val androidTest by getting
        // val jsTest by getting
        // val iosTest by creating
        // val tvosTest by creating
        // val watchosTest by creating
        // val linuxTest by creating
        // val macosTest by creating
        // val windowsTest by creating
        // val iosX64Test by getting
        // val iosArm64Test by getting
        // val iosSimulatorArm64Test by getting
        // val tvosX64Test by getting
        // val tvosArm64Test by getting
        // val tvosSimulatorArm64Test by getting
        // val watchosX64Test by getting
        // val watchosArm64Test by getting
        // val watchosSimulatorArm64Test by getting
        // val linuxX64Test by getting
        // val macosX64Test by getting
        // val macosArm64Test by getting
        // val mingwX64Test by getting
    }
}

// android {
//     compileSdk = 32
//     sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
//     defaultConfig {
//         minSdk = 14
//         targetSdk = 32
//     }
// }