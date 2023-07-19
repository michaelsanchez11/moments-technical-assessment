package net.sevendays.android.code_check.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun GithubRepositoryItem(githubRepositoryName: String) {
    Text(
        text = githubRepositoryName,
        modifier = Modifier.padding(8.dp)
    )
    Divider(color = Color.Gray, thickness = 1.dp)
}