package webstudy.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req= (HttpServletRequest) servletRequest;
        HttpServletResponse resp= (HttpServletResponse) servletResponse;
        //获取url
        String url = req.getRequestURI();
        url=url.substring(url.lastIndexOf("/")+1);
        if(url.equals("login.jsp")||url.equals("register.jsp")
                ||url.equals("register")||url.equals("login")){
            filterChain.doFilter(req,resp);
        }else {
            String name = (String) req.getSession().getAttribute("name");
            String psw = (String) req.getSession().getAttribute("psw");
            if(name==null||psw==null){
                resp.sendRedirect("login.jsp");
            }else {
                filterChain.doFilter(req,resp);
            }

        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
