package webstudy.service;

import webstudy.bean.Student;
import webstudy.dao.StudentDao;

import java.util.List;

public class sqlAllStudent {
    public sqlAllStudent(){}
    public void sqlAll(){
        List< Student> lists= new StudentDao().showAll();
        for (Student list : lists) {
            System.out.println(list.toString());
        }
    }
}
