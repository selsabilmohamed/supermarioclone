package com.packag3;

<project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

<groupId>testiamgui</groupId>
<artifactId>testiamgui</artifactId>
<version>0.0.1-SNAPSHOT</version>
<packaging>jar</packaging>

<name>testiamgui</name>
<url>http://maven.apache.org</url>

<properties>
	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	<maven.compiler.target>12</maven.compiler.target>
	<maven.compiler.source>12</maven.compiler.source>
	<lwjgl.version>3.2.3</lwjgl.version>
	<joml.version>1.9.24</joml.version>
	<lwjgl.natives>natives-windows</lwjgl.natives>
</properties>

<dependencyManagement>
	<dependencies>
		<dependency>
			<groupId>org.lwjgl</groupId>
			<artifactId>lwjgl-bom</artifactId>
			<version>${lwjgl.version}</version>
			<scope>import</scope>
			<type>pom</type>
		</dependency>
	</dependencies>
</dependencyManagement>

<dependencies>

	<dependency>
		<groupId>io.imgui.java</groupId>
		<artifactId>binding</artifactId>
		<version>1.76-0.9</version>
	</dependency>
	<dependency>
		<groupId>io.imgui.java</groupId>
		<artifactId>lwjgl3</artifactId>
		<version>1.76-0.9</version>
	</dependency>
	<dependency>
		<groupId>io.imgui.java</groupId>
		<artifactId>natives-windows</artifactId>
		<version>1.76-0.9</version>
	</dependency>

	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-nfd</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-assimp</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-glfw</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-openal</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-opengl</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-stb</artifactId>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-assimp</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-glfw</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-openal</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-opengl</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-stb</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.lwjgl</groupId>
		<artifactId>lwjgl-nfd</artifactId>
		<classifier>${lwjgl.natives}</classifier>
	</dependency>
	<dependency>
		<groupId>org.joml</groupId>
		<artifactId>joml</artifactId>
		<version>${joml.version}</version>
	</dependency>
</dependencies>

<repositories>
	<repository>
		<id>central</id>
		<name>bintray-plugins</name>
		<url>https://jcenter.bintray.com</url>
	</repository>

</repositories>
</project>