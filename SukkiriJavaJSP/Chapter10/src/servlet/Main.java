package servlet;

import model.Mutter;
import model.PostMutterLogic;
import model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RyomaArai on 15/03/11.
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = this.getServletContext();
        List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");

        // 取得できなかった場合、mutterListを作成
        if (mutterList == null) {
            mutterList = new ArrayList<Mutter>();
            application.setAttribute("mutterList", mutterList);
        }

        // ログインしているか確認するため、セッションスコープからユーザー情報を取得
        HttpSession session = request.getSession();
        User loginUser = (User) session.getAttribute("user");

        if (loginUser == null) {
            response.sendRedirect("/WEB-iNF/jsp/index.jsp");
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String content = request.getParameter("mutter");

        // 入力チェック
        if ((content != null) && (content.length() != 0)) {
            ServletContext application = this.getServletContext();
            List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");

            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");

            Mutter mutter = new Mutter(user.getName(), content);

            PostMutterLogic postMutterLogic = new PostMutterLogic();
            postMutterLogic.execute(mutter, mutterList);
            application.setAttribute("mutterList", mutterList);
        } else {
            request.setAttribute("errorMsg", "つぶやきが入力されていません");
        }

        // メイン画面にフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
        dispatcher.forward(request, reponse);
    }
}
