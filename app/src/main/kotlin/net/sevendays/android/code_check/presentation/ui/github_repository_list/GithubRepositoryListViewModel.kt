package net.sevendays.android.code_check.presentation.ui.github_repository_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import net.sevendays.android.code_check.domain.model.GithubRepository
import net.sevendays.android.code_check.repository.GithubRepositoryRepo
import javax.inject.Inject

/**
 * Viewmodel for the GithubRepositoryListFragment, it holds the state for the
 * query search and launches the api call via coroutine.
 */

@HiltViewModel
class GithubRepositoryListViewModel
@Inject
constructor(
    private val repository: GithubRepositoryRepo
) : ViewModel() {

    val githubRepos: MutableState<List<GithubRepository>> = mutableStateOf(listOf())

    val query = mutableStateOf("")

    fun newSearch() {
        viewModelScope.launch {
            val result = repository.search(
                query = query.value
            )
            githubRepos.value = result
        }
    }

    fun onQueryChanged(query: String) {
        this.query.value = query
    }
}
