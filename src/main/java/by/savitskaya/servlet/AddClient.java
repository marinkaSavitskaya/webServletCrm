package by.savitskaya.servlet;

import by.savitskaya.dao.ClientDao;
import by.savitskaya.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/add"})
public class AddClient extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Enter doGet on addClient");
        request.getRequestDispatcher("/jsp/addClient.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Enter doPost on addClient");
        String action = request.getParameter("action");
        System.out.println("Enter action on addClient ="+action);
        if (action != null){
            try{
                Client newClient = new Client();
                String firstName = null;
                String lastName = null;
                Integer age = 0;
                String nameCompany = null;

                firstName = request.getParameter("firstName");
                if (firstName != null){
                    newClient.setFirstName(firstName);
                }
                lastName = request.getParameter("lastName");
                if (lastName != null){
                    newClient.setLastName(lastName);
                }
                age = Integer.valueOf(request.getParameter("age"));
                if (age != 0){
                    newClient.setAge(String.valueOf(age));
                }
                nameCompany = request.getParameter("nameCompany");
                if (nameCompany != null){
                    newClient.setNameCompany(nameCompany);
                }
                ClientDao.addClient(newClient);
            } catch (Exception e){

            }
        }
        request.setAttribute("listClient", ClientDao.getClientList());
        request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
    }

//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("listClient", ClientDao.getClientList());
//        request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
//    }


}
