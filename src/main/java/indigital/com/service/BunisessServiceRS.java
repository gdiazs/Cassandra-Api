package indigital.com.service;

import indigital.com.domain.Empresa;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/business")
@Stateless
public class BunisessServiceRS {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Empresa> listBusiness() {
//        BusinessDataJDBC bdj = new BusinessDataJDBC();
//        List<Empresa> emp = bdj.listBusiness();
        List<Empresa> empre = new ArrayList<>();
        Empresa empresa = new Empresa("UUIDA", "data", "dasddasdasd");
        empre.add(empresa);
        return empre;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}") //hace referencia a /personas/{id}
    public Empresa encontrarEmpresaPorId(@PathParam("id") int id) {
        return null;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response agregarEmpresa(Empresa persona) {
        return null;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response modificarEmpresa(@PathParam("id") int id, Empresa personaModificada) {
        return null;
    }

    @DELETE
    @Path("{id}")
    public Response eliminarEmpresaPorId(@PathParam("id") int id) {
        return null;
    }
}
