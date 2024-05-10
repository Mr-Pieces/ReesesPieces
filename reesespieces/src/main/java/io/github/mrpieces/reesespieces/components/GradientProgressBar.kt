package io.github.mrpieces.reesespieces.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

@Composable
fun GradientProgressBar(
    modifier: Modifier = Modifier, backgroundColor: Color, foregroundColor: Brush, percent: Int
) {
    var width by remember { mutableStateOf(IntSize.Zero) }
    Box(
        modifier = modifier
            .background(backgroundColor)
            .fillMaxWidth()
            .onSizeChanged {
                width = it
            }
    ) {
        Box(
            modifier = modifier
                .animateContentSize()
                .then(
                    with(LocalDensity.current) {
                        Modifier.width(width.width.toDp() * percent / 100)
                    }
                )
                .background(foregroundColor)
        )
    }
}

@Preview
@Composable
fun GradientProgressBarPreview() {
    Surface(modifier = Modifier.height(40.dp)) {
        GradientProgressBar(backgroundColor = Color.White, foregroundColor = Brush.horizontalGradient(
            listOf(
                Color.Blue,
                Color.Cyan
            )
        ), percent = 30)
    }
}