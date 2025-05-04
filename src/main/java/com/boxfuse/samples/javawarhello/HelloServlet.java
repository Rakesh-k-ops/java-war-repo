package com.mysite.samples.javawarhello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("HelloServlet: You should see this in the Instance Logs :-)");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Hello this Page</title></head><body>");
        out.println("<h1>Hello from MySite Servlet!</h1>");
        out.println("<p>This is a response from the servlet.</p>");
        out.println("<img src='images/custom-logo.png' alt='MySite Logo' width='200' />");
        out.println("</body></html>");
    }
}
