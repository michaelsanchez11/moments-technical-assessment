package net.sevendays.android.code_check.presentation.ui.github_repository_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.sevendays.android.code_check.R
import net.sevendays.android.code_check.domain.model.GithubRepository
import net.sevendays.android.code_check.presentation.components.GithubRepositoryItem
import net.sevendays.android.code_check.presentation.components.SearchBar
import net.sevendays.android.code_check.presentation.ui.github_repository.GithubRepositoryFragment

private const val bundleKey = "githubRepo"

@AndroidEntryPoint
class GithubRepositoryListFragment : Fragment() {

    val viewModel: GithubRepositoryListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                val githubRepos = viewModel.githubRepos.value

                Column {
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth(),
                        color = Color.White,
                        elevation = 8.dp
                    ) {
                       SearchBar(viewModel = viewModel)
                    }
                    LazyColumn {
                        itemsIndexed(
                            items = githubRepos
                        ) { index, githubRepo ->
                            Surface(modifier = Modifier.clickable {
                                sendGithubRepositoryDataToDestination(githubRepo)
                            }) {
                                GithubRepositoryItem(githubRepositoryName = githubRepo.name.toString())
                            }
                        }
                    }
                }
            }
        }
    }

    private fun sendGithubRepositoryDataToDestination(githubRepositoryData: GithubRepository) {
        val bundle = Bundle().apply {
            putParcelable(bundleKey, githubRepositoryData)
        }

        val githubRepoFragment = GithubRepositoryFragment()
        githubRepoFragment.arguments = bundle
        findNavController().navigate(R.id.githubRepositoryFragment, bundle)
    }
}