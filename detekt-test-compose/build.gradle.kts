plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version("1.6.0-beta02")
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

kotlin {
    jvm()
    sourceSets {
        jvmMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.material)
        }
    }
}

compose {
    kotlinCompilerPlugin.set("1.5.6-dev2-kt2.0.0-Beta3")
}
