package webstudy.service;

import webstudy.bean.Student;
import webstudy.dao.StudentDao;

public class addStudent {
    public addStudent() {
    }
    public void add(int sid, String sname, int sex, String hobby, String school){
       Student student= new Student(sid,sname,sex,hobby,school);
        new StudentDao().add(student);

    }
}
