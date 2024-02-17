package webstudy.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import webstudy.service.UserService;
import webstudy.utils.PageUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private UserService userService=new UserService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String currentPage = req.getParameter("currentPage");
        String pageSize = req.getParameter("pageSize");

        PageUtils pageUtils=userService.pageQueryUser(currentPage,pageSize);
        String json = new ObjectMapper().writeValueAsString(pageUtils);
        System.out.println(json);
        resp.getWriter().print(json);
    }
}
