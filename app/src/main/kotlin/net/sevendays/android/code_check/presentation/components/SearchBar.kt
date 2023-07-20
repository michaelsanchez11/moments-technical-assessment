package net.sevendays.android.code_check.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import net.sevendays.android.code_check.presentation.ui.github_repository_list.GithubRepositoryListViewModel

/**
 * Composable displaying the Search bar in the GithubRepositoryListFragment.
 */

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun SearchBar(viewModel: GithubRepositoryListViewModel) {
    val query = viewModel.query.value
    val controller = LocalSoftwareKeyboardController.current

    Column {
        Row(modifier = Modifier.fillMaxWidth()) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(8.dp),
                value = query,
                onValueChange = { newValue ->
                    viewModel.onQueryChanged(newValue)
                },
                label = {
                    Text(text = "Search")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Search
                ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = "Icon search"
                    )
                },
                keyboardActions = KeyboardActions(onSearch = {
                    viewModel.newSearch()
                    controller?.hide()
                }),
                textStyle = TextStyle(color = MaterialTheme.colors.onSurface),
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = MaterialTheme.colors.surface
                )
            )
        }
    }
}