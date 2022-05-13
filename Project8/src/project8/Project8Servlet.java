package project8;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Servlet implementation class Servlet
 * @author 刘杰
 */

@WebServlet(name = "Project8Servlet", value = "/Project8Servlet")
public class Project8Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username=request.getParameter("name");
        String password=request.getParameter("password");
        ArrayList<User> users= new ArrayList<User>();
        User user=new User();
        user.setName(username);
        user.setPassword(password);
        users.add(user);
        HttpSession session=request.getSession();
        session.setAttribute("users",users);
        //简化代码，一样就成功。
        if (username.equals(password)){
            request.getRequestDispatcher("/project8/successful.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("/project8/fail.jsp").forward(request, response);
        }
    }
}


