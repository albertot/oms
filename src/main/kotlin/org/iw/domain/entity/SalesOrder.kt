package org.iw.domain.entity

import javax.persistence.*

@Entity
@Table(name = "SALES_ORDER")
data class SalesOrder(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        @Column(nullable = false)
        var name: String,
        @OneToMany(mappedBy = "salesOrder")
        var items: Set<SalesOrderItem>?
)
