package by.savitskaya.servlet;

import by.savitskaya.dao.ClientDao;
import by.savitskaya.model.Client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/","/mainPage.jsp"})
public class MainPanel extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        ClientDao.addClient(new Client(1,"Ivan", "Ivanov", "40", "BelTechStroy"));
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //System.out.println("Enter doGet on mainPage");
        String action = request.getParameter("name");
        //System.out.println("action =="+action);
        if ("add".equals(action)){
            request.getRequestDispatcher("/jsp/addClient.jsp").forward(request, response);
        }else {
            request.setAttribute("listClient", ClientDao.getClientList());
            request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
        }
        // request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //System.out.println("Enter doPost on mainPage");
        String action = request.getParameter("name");
        //System.out.println("action =="+action);
        if ("add".equals(action)){
            request.getRequestDispatcher("/jsp/addClient.jsp").forward(request, response);
        }else {
            request.setAttribute("listClient", ClientDao.getClientList());
            request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
        }
    }

//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setAttribute("listClient", ClientDao.getClientList());
//        request.getRequestDispatcher("/jsp/mainPage.jsp").forward(request, response);
//    }


}
