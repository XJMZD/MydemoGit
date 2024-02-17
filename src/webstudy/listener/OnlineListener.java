package webstudy.listener;
import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//@WebListener
public class OnlineListener implements ServletContextListener , HttpSessionAttributeListener , HttpSessionListener {
    ServletContext sc;
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        String value = (String) se.getSession().getAttribute("username");
        ArrayList<String> online = (ArrayList<String>) sc.getAttribute("online");
        online.remove(value);
        //sc.setAttribute("online",online);
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<String> online = new ArrayList<>();
        sc = sce.getServletContext();
        sc.setAttribute("online",online);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String name = se.getName();
        if(name.equals("username")){
            String value = (String) se.getValue();
            ArrayList<String> online = (ArrayList<String>) sc.getAttribute("online");
            online.add(value);
            sc.setAttribute("online",online);
        }
    }
    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        String name = se.getName();
        if(name.equals("username")){
            String value = (String) se.getSession().getAttribute("username");
            ArrayList<String> online = (ArrayList<String>) sc.getAttribute("online");
            online.add(value);
            sc.setAttribute("online",online);
        }
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        HttpSessionAttributeListener.super.attributeRemoved(se);
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        HttpSessionListener.super.sessionCreated(se);
    }

}
