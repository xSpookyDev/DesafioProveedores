package cl.praxis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.model.dao.ProveedoresDAO;
import cl.praxis.model.dto.Proveedores;

@WebServlet("/")
public class ProveedoresController extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    public ProveedoresController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProveedoresDAO pDAO = new ProveedoresDAO();
        List<Proveedores> proveedores = null;
        
        try {
            proveedores = pDAO.read();
            request.setAttribute("proveedores", proveedores);
            getServletContext().getRequestDispatcher("/views/proveedores.jsp").forward(request, response);
            
            System.out.println("Lista de proveedores obtenida correctamente:");
            proveedores.forEach(p -> System.out.println(p.toString()));
        } catch (Exception e) {
            System.out.println("Error al obtener la lista de proveedores: " + e.getMessage());
            e.printStackTrace();
         
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error al obtener la lista de proveedores");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
