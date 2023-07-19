package net.sevendays.android.code_check.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import net.sevendays.android.code_check.network.model.OwnerIconUrlDto

/**
 * Model class, handling the business side of the network operation we make to the API.
 */
@Parcelize
data class GithubRepository(
    val name: String? = null,
    val ownerIconUrl: OwnerIconUrl? = null,
    val language: String? = null,
    val stargazersCount: Long? = 0,
    val watchersCount: Long? = 0,
    val forksCount: Long? = 0,
    val openIssuesCount: Long? = 0,
) : Parcelable