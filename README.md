# ReesesPieces
Reeses Pieces is a collaborative Compose UI library made by myself and other developers. It consists of various custom composables to help make your UI standout and give you more options for premade composables. This library is free for anyone to use or contribute their own composables!

[![](https://jitpack.io/v/Mr-Pieces/ReesesPieces.svg)](https://jitpack.io/#Mr-Pieces/ReesesPieces)

## Custom Composables
### GradientProgressBar
Progress bar that allows you to provide in a color gradient for the progress bar. Just set a height, background color, foreground color, and a percentage (0-100):

```Kotlin
        Card(
            modifier = Modifier
                .height(30.dp),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(1.dp, color = Color(0xFFE1E1E1))
        ) {
            GradientProgressBar(
                Modifier.fillMaxHeight(),
                backgroundColor = Color.White,
                foregroundColor = Brush.horizontalGradient(
                    listOf(
                        Color(0xFF34BBDB),
                        Color(0xFF3DDAFF)
                    )
                ),
                percent = percentage
            )
        }
```

https://github.com/Mr-Pieces/ReesesPieces/assets/107214415/6f979be6-cd7a-4cd8-ae09-c6a38d43900d

## Gradle
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
