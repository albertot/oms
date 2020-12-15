package org.iw.domain.port

import org.iw.domain.entity.SalesOrder

interface Repository {
    fun getSalesOrder(): Set<SalesOrder>

    fun createSalesOrder(order: SalesOrder)
}
