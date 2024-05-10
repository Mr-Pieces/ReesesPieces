# ReesesPieces
Reeses Pieces is a collaborative Compose UI library made by myself and other developers while working on various android projects. It consists of various custom composables to help make your UI standout and give you more options for premade composables. This library is free for anyone to use or contribute their own composables to!

## Importing ReesesPieces
Include Jitpack as a repo in your settings.gradle:

```Kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://jitpack.io")
        }
    }
}
```

Then in your app build gradle, include the implementation:

```Kotlin
dependencies {
	        implementation("com.github.Mr-Pieces:ReesesPieces:Tag")
	}
```
