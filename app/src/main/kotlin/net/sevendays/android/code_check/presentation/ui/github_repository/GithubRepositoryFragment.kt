package net.sevendays.android.code_check.presentation.ui.github_repository

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import net.sevendays.android.code_check.domain.model.GithubRepository
import net.sevendays.android.code_check.presentation.components.GithubRepositoryCard

private const val BUNDLE_KEY = "githubRepo"

/**
 * Fragment that receives the GithubRepository items and displays it.
 */

@AndroidEntryPoint
class GithubRepositoryFragment : Fragment() {

    private var githubRepository: GithubRepository? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                githubRepository?.let { GithubRepositoryCard(githubRepository = it, context) }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        githubRepository = arguments?.getParcelable<GithubRepository>(BUNDLE_KEY)
    }
}