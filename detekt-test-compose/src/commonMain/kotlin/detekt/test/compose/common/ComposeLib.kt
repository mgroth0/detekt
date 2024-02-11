package detekt.test.compose.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.FrameWindowScope

@Composable
fun MyWindow(
    content: @Composable FrameWindowScope.() -> Unit
) = Unit
