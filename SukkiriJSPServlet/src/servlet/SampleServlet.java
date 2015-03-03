package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SampleServlet")

/**
 * Created by RyomaArai on 15/03/02.
 */
public class SampleServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String test = "ふにゃ";

        // HTMLを出力
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>スッキリうらない</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(test);
        out.println("</body>");
        out.println("</html>");
    }
}
