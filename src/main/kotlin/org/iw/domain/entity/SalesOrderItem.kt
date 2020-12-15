package org.iw.domain.entity

import javax.persistence.*

@Entity
@Table(name = "SALES_ORDER_ITEM")
data class SalesOrderItem(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(insertable = false,updatable = false)
        var id: Long,
        @ManyToOne
        @JoinColumn(name = "order_id", nullable = false)
        var salesOrder: SalesOrder
)
