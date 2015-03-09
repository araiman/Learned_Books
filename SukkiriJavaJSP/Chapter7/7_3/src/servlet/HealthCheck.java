package servlet;

import model.Health;
import model.HealthCheckLogic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/HealthCheck")
/**
 * Created by RyomaArai on 15/03/10.
 */
public class HealthCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        // フォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // リクエストパラメータを取得
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");

        // 入力値をプロパティに設定
        Health health = new Health();
        health.setWeight(Double.parseDouble(weight));
        health.setHeight(Double.parseDouble(height));

        // 健康診断を実行し、結果を設定
        HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
        healthCheckLogic.execute(health);

        // リクエストスコープに保存
        request.setAttribute("health", health);

        // フォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
        dispatcher.forward(request, response);
    }
}
