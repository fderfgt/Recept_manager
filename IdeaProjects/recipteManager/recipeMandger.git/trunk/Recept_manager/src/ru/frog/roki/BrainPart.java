package ru.frog.roki;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;


@WebServlet(urlPatterns = "/Brainpart")
public class BrainPart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("firstname");
        String sername = req.getParameter("sertname");
        String d = "Vasya";
        if (Objects.equals(name, d)){
            resp.getWriter().write("go Supreme,  "+ name+"");
        }
        else{
            resp.getWriter().write("go,  " + name + " " + sername + "  ");
        }
    }
}
