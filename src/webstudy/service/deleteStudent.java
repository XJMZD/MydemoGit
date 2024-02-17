package webstudy.service;

import webstudy.dao.StudentDao;

public class deleteStudent {
    public deleteStudent(){
    }
    public void delete(int id){
        new StudentDao().delete(id);
    }
}
