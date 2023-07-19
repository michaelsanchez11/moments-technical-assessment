package net.sevendays.android.code_check.domain.util

/**
 * This interface is a generic interface mapper we are creating to map from and entity to a Domain
 * and vice versa from Domain to Entity.
 * Generic mapper we can use anywhere based on the params we are providing.
 */

interface DomainMapper<T, DomainModel> {

    /**
     * We are mapping FROM a MODEL(DTO, ENTITIES) TO a DOMAINMODEL
     */
    fun mapToDomainModel(model: T): DomainModel

    /**
     * We are mapping FROM a DOMAINMODEL TO an MODEL(DTO, ENTITIES)
     */
    fun mapFromDomainModel(domainModel: DomainModel): T
}