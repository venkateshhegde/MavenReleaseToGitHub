# MavenReleaseToGitHub

Artifacts MUST be LOWER CASE!!!  Else  :( 422 Unprocessable Entity


This projects tests deploy for snapshots and release


Maven Wrapper:
mvn -N io.takari:maven:wrapper

BOM needs this section:
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>test</groupId>
                <artifactId>a</artifactId>
                <version>1.2</version>
            </dependency>
            <dependency>
                <groupId>test</groupId>
                <artifactId>b</artifactId>
                <version>1.0</version>
                <scope>compile</scope>
            </dependency>
            <dependency>
                <groupId>test</groupId>
                <artifactId>c</artifactId>
                <version>1.0</version>
                <scope>compile</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

Inherit BOM:
<parent>
<groupId>baeldung</groupId>
<artifactId>Baeldung-BOM</artifactId>
<version>0.0.1-SNAPSHOT</version>
</parent>


Import BOM:
<dependencyManagement>
<dependencies>
<dependency>
<groupId>baeldung</groupId>
<artifactId>Baeldung-BOM</artifactId>
<version>0.0.1-SNAPSHOT</version>
<type>pom</type>
<scope>import</scope>
</dependency>
</dependencies>
</dependencyManagement>

