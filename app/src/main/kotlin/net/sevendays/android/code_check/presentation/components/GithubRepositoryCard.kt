package net.sevendays.android.code_check.presentation.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import net.sevendays.android.code_check.R
import net.sevendays.android.code_check.domain.model.GithubRepository
import net.sevendays.android.code_check.loadPicture

@Composable
fun GithubRepositoryCard(
    githubRepository: GithubRepository,
    context: Context
) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(bottom = 6.dp, top = 6.dp)
            .fillMaxWidth(),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            githubRepository.ownerIconUrl?.avatarUrl?.let { url ->
                val image = loadPicture(url = url).value
                image?.let { img ->
                    Image(
                        bitmap = img.asImageBitmap(),
                        contentDescription = "Owner Avatar Icon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(225.dp),
                        contentScale = ContentScale.Crop
                    )
                }
            }
            githubRepository.name?.let { name ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
                ) {
                    Text(
                        text = name,
                        modifier = Modifier
                            .fillMaxWidth(.50f)
                            .wrapContentWidth(Alignment.Start),
                        style = MaterialTheme.typography.h6
                    )
                    Text(
                        text = context.getString(
                            R.string.written_language,
                            githubRepository.language.toString()
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentWidth(Alignment.End)
                            .align(Alignment.CenterVertically),
                        style = MaterialTheme.typography.h6
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = context.getString(
                        R.string.fork_count,
                        githubRepository.forksCount.toString()
                    ),
                    modifier = Modifier
                        .fillMaxWidth(.50f)
                        .wrapContentWidth(Alignment.Start),
                    style = MaterialTheme.typography.h6
                )
                Text(
                    text = context.getString(
                        R.string.star_count,
                        githubRepository.stargazersCount.toString()
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End)
                        .align(Alignment.CenterVertically),
                    style = MaterialTheme.typography.h6
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = context.getString(
                        R.string.watchers_count,
                        githubRepository.watchersCount.toString()
                    ),
                    modifier = Modifier
                        .fillMaxWidth(.50f)
                        .wrapContentWidth(Alignment.Start),
                    style = MaterialTheme.typography.h6
                )
                Text(
                    text = context.getString(
                        R.string.open_issues,
                        githubRepository.openIssuesCount.toString()
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End)
                        .align(Alignment.CenterVertically),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}