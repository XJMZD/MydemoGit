package webstudy.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Student implements HttpSessionBindingListener {

    private String name;
    public Student(String name) {this.name = name;}
    public Student() {}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();
        System.out.println("session中绑定了student对象...." + name + "..." + value );
    }
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();
        System.out.println("session中解绑了student对象...." + name + "..." + value );
    }
}
