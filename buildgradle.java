package com.packag3;

public class buildgradle {

	plugins {
	    id 'java'
	}

	version '1.0-SNAPSHOT'

	repositories {
	    flatDir {
	        dirs 'libs'
	    }
	    mavenCentral()
	}

	dependencies {
	    testCompile group: 'junit', name: 'junit', version: '4.12'
	}

	project.ext.lwjglVersion = "3.2.3"
	project.ext.jomlVersion = "1.9.23"
	project.ext.lwjglNatives = "natives-windows"
	project.ext.imguiVersion = '1.81.0'

	dependencies {
	    // Box2D
	    implementation name: 'jbox2d-library'

	    // JUnit
	    testImplementation('junit:junit:4.13')

	    // GSON
	    implementation 'com.google.code.gson:gson:2.8.6'

	    // ImGUI stuff
	    implementation "io.github.spair:imgui-java-app:$imguiVersion"

	     // LWJGL stuff
	    implementation platform("org.lwjgl:lwjgl-bom:$lwjglVersion")

	    implementation "org.lwjgl:lwjgl"
	    implementation "org.lwjgl:lwjgl-assimp"
	    implementation "org.lwjgl:lwjgl-glfw"
	    implementation "org.lwjgl:lwjgl-nfd"
	    implementation "org.lwjgl:lwjgl-openal"
	    implementation "org.lwjgl:lwjgl-opengl"
	    implementation "org.lwjgl:lwjgl-stb"
	    runtimeOnly "org.lwjgl:lwjgl::$lwjglNatives"
	    runtimeOnly "org.lwjgl:lwjgl-assimp::$lwjglNatives"
	    runtimeOnly "org.lwjgl:lwjgl-glfw::$lwjglNatives"
	    runtimeOnly "org.lwjgl:lwjgl-nfd::$lwjglNatives"
	    runtimeOnly "org.lwjgl:lwjgl-openal::$lwjglNatives"
	    runtimeOnly "org.lwjgl:lwjgl-opengl::$lwjglNatives"
	    runtimeOnly "org.lwjgl:lwjgl-stb::$lwjglNatives"
	    implementation "org.joml:joml:${jomlVersion}"
	}

	jar {
	    manifest {
	        attributes (
	            'Class-Path': configurations.compile.collect { it.getName() }.join(' '),
	            'Main-Class': 'Main'
	        )
	    }

	    from {
	        configurations.compile.collect { it.isDirectory() ? it : zipTree(it) }
	    }
	}

	task copyAssets(type: Copy) {
	    copy {
	        from "assets"
	        into "${buildDir}/libs/assets"
	    }

	    copy {
	        from "level.txt"
	        into "${buildDir}/libs"
	    }
	}

	task fatJar(type: Jar) {
	  manifest.from jar.manifest
	  from {
	    configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
	  } {
	    exclude "META-INF/*.SF"
	    exclude "META-INF/*.DSA"
	    exclude "META-INF/*.RSA"
	  }
	  with jar
	}

	fatJar.dependsOn(copyAssets)

	artifacts {
	    archives fatJar
	}
}
