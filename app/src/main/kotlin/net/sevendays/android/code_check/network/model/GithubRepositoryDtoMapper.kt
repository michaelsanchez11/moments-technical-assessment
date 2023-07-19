package net.sevendays.android.code_check.network.model

import net.sevendays.android.code_check.domain.model.GithubRepository
import net.sevendays.android.code_check.domain.model.OwnerIconUrl
import net.sevendays.android.code_check.domain.util.DomainMapper

class GithubRepositoryDtoMapper : DomainMapper<GithubRepositoryDto, GithubRepository> {

    /**
     * Mapping from API objects(DTO) into Serialized Business Object(GithubRepository).
     *
     * This is used to READ from the API.
     */
    override fun mapToDomainModel(model: GithubRepositoryDto): GithubRepository {
        return GithubRepository(
            name = model.name,
            ownerIconUrl = model.ownerIconUrlDto?.let { OwnerIconUrl(it.avatarUrl) },
            language = model.language,
            stargazersCount = model.stargazersCount,
            watchersCount = model.watchersCount,
            forksCount = model.forksCount,
            openIssuesCount = model.openIssuesCount
        )
    }


    /**
     * Mapping from real Business Model Object(GithubRepository) into an API object.
     *
     * This is Used to WRITE to the API.
     */
    override fun mapFromDomainModel(domainModel: GithubRepository): GithubRepositoryDto {
        TODO("Not yet implemented")
    }

    /**
     * Returns a list of GithubRepository Objects from a list of GithubRepositoryDto objects.
     *
     * You feed it the API Object list and it returns a list of Real Business Objects(GithubRepository)
     */
    fun toDomainList(initial: List<GithubRepositoryDto>): List<GithubRepository> {
        return initial.map { mapToDomainModel(it) }
    }
}