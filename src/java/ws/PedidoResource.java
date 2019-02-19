/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import model.Pedido;

/**
 * REST Web Service
 *
 * @author marcelo
 */
@Path("/pedidos")
public class PedidoResource {

    @Inject
    service.PedidoService pedidoService;
    
    PedidoResource(){
        this.pedidoService = new service.PedidoService();
    }
    
    @Context
    private UriInfo context;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Pedido post(Pedido pedido){
        pedidoService.salvar(pedido);
        
        return pedido;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPessoas() {
        List<Pedido> pedidos;
        pedidos = pedidoService.listAll();
        return Response
            .ok()
            .entity(new GenericEntity<List<Pedido>>(pedidos){})
            .build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPessoa(@PathParam("id") String id) {
        Pedido pedido;
        pedido = pedidoService.findById(Integer.parseInt(id));
        return Response
            .ok()
            .entity(pedido)
            .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void put(String content) {
    }    
}
