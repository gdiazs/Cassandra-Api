package indigital.com.web;

import indigital.com.domain.Empresa;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import indigital.com.service.BusinessService;

@WebServlet("/DeleteSend")
public class DeleteSend extends HttpServlet {

    @Inject
    private BusinessService empresaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empresa> personas = empresaService.listBusiness();
        request.setAttribute("personas", personas);

        request.getRequestDispatcher("/listarPersonas.jsp").forward(request, response);
    }
}
