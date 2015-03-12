package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by RyomaArai on 15/03/12.
 */
@WebServlet("/DatabaseTest")
public class DatabaseTest extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>データベーステスト</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>");

        String msg = "";

        Connection conn = null;
        String url = "jdbc:mysql://localhost/jdbctestdb";
        String user = "dbuser";
        String password = "hogehoge";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            msg = "ドライバのロードに成功しました";
            out.println(msg);

            conn = DriverManager.getConnection(url, user, password);
            out.println("データベースの接続に成功しました");
        } catch (ClassNotFoundException e) {
            msg = "(ClassNotFoundException)ドライバのロードに失敗しました";
            out.println(msg);
        } catch (SQLException e) {
            msg = "(SQL)ドライバのロードに失敗しました";
            out.println(msg);
        } catch (Exception e) {
            msg = "(Exception)ドライバのロードに失敗しました";
            out.println(msg);
        } finally {
            try{

                if (conn != null){
                    conn.close();
                    out.println();
                }else {
                    out.println();
                }
            } catch (SQLException e) {
                out.println(e.getMessage());
            }
        }

        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
