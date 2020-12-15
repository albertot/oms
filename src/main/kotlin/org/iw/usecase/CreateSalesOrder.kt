package org.iw.usecase

import org.iw.domain.entity.SalesOrder
import org.iw.domain.port.Repository
import org.jboss.logging.Logger
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional
import javax.persistence.EntityManager


@ApplicationScoped
class CreateSalesOrder {
    private val LOGGER = Logger.getLogger(CreateSalesOrder::class.java)

    @Inject
    internal lateinit var repository: Repository

    @Inject
    internal lateinit var em: EntityManager

    @Transactional
    fun createSalesOrder(salesOrder: SalesOrder) {
        repository.createSalesOrder(salesOrder)
    }
}
