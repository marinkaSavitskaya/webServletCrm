package by.savitskaya.servlet;

import by.savitskaya.dao.ClientDao;
import by.savitskaya.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/edit"})
public class EditClient extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int idClient;
        System.out.println("Enter doGet on edit");
        idClient = Integer.parseInt(request.getParameter("id"));
        System.out.println("idClient = "+idClient);
        if (!"0".equals(idClient)){
            Client editClient = ClientDao.getClientById(idClient);
            System.out.println(editClient.toString());
            request.setAttribute("editClient", editClient);
            request.getRequestDispatcher("/jsp/editClient.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Enter doPost on editClient");
        Integer id  = Integer.parseInt(request.getParameter("id"));
        Client client = new Client(id, request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("age"), request.getParameter("nameCompany"));
        ClientDao.updateClient(client);
        System.out.println("Enter doPost edit "+client);
        request.setAttribute("listClient", ClientDao.getClientList());
        request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
    }




}



