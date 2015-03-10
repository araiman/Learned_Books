package servlet;

import model.RegisterUserLogic;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by RyomaArai on 15/03/10.
 */

@WebServlet("/RegisterUser")

public class RegisterUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forwardPath = null;
        String action = request.getParameter("action");

        if (action == null) {
            forwardPath = "/WEB-INF/jsp/registerForm.jsp";
        } else if (action.equals("done")) {
            HttpSession session = request.getSession();
            /*
            User registerUser = (User)session.getAttribute("registerUser");
            RegisterUserLogic registerUserLogic = new RegisterUserLogic();
            registerUserLogic.register(registerUser);
            */
            session.removeAttribute("registerUser");
            forwardPath = "/WEB-INF/jsp/registerDone.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
        dispatcher.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String id = request.getParameter("id");

        User registerUser = new User(id, password, name);

        HttpSession session = request.getSession();
        session.setAttribute("registerUser", registerUser);

        // フォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
        dispatcher.forward(request, response);
    }
}
