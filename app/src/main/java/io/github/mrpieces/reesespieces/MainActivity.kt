package io.github.mrpieces.reesespieces

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.mrpieces.reesespieces.components.GradientProgressBar
import io.github.mrpieces.reesespieces.ui.theme.ReesesPiecesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReesesPiecesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GradientProgressBar(modifier = Modifier.height(40.dp),backgroundColor = Color.White, foregroundColor = Brush.horizontalGradient(
                        listOf(
                            Color.Blue,
                            Color.Cyan
                        )
                    ), percent = 60)
                }
            }
        }
    }
}
