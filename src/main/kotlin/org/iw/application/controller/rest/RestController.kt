package org.iw.application.controller.rest

import org.eclipse.microprofile.openapi.annotations.tags.Tag
import org.iw.domain.entity.SalesOrder
import org.iw.usecase.SearchSalesOrder
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/oms")
@Tag(name = "Hour", description = "Api to access hour")
@Produces(MediaType.APPLICATION_JSON)
class RestController {

    @Inject
    internal lateinit var searchSalesOrderUseCase: SearchSalesOrder

    @GET
    @Path("/orders")
    @Produces(MediaType.APPLICATION_JSON)
    fun getOrders(): Set<SalesOrder> {
        return searchSalesOrderUseCase.getAllSalesOrder()
    }
}
