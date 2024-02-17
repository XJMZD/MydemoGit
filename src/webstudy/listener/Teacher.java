package webstudy.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class Teacher implements Serializable,HttpSessionActivationListener {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("session钝化到本地了..." +  se.getSession().getId());
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("session活化到项目中了..." + se.getSession().getId());
    }
    private String name;
    public Teacher(String name) {this.name = name;}
    public Teacher() {}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}
