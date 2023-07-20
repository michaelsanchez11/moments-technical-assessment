package net.sevendays.android.code_check.domain.util

/**
 * This interface is a generic interface mapper we are creating to map from and entity to a Domain
 * and vice versa from Domain to Entity.
 */

interface DomainMapper<T, DomainModel> {

    /**
     * We are mapping FROM a MODEL(DTO/ENTITIES) TO a DOMAINMODEL
     */
    fun mapToDomainModel(model: T): DomainModel

    /**
     * We are mapping FROM a DOMAINMODEL TO a MODEL(DTO/ENTITIES)
     */
    fun mapFromDomainModel(domainModel: DomainModel): T
}