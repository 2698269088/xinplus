pluginManagement {
    repositories {
        maven {
            name = "AliyunFabric"
            url = uri("https://maven.aliyun.com/repository/fabricmc")
        }
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "AliyunPublic"
            url = uri("https://maven.aliyun.com/repository/public")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
