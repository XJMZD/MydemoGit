package webstudy.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import webstudy.bean.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentDao {
   public StudentDao(){}
    private ComboPooledDataSource ds=null;
    public void add(Student student){
        ds=new ComboPooledDataSource();
        QueryRunner qr=new QueryRunner(ds);

        String sql="insert into student values (?,?,?,?,?)  ";
        try {
            qr.update(sql,student.getSid(),student.getSname(),student.getSex(),student.getHobby(),student.getSchool());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ds.close();
    }
    public void delete(int id){
        ds=new ComboPooledDataSource();
        QueryRunner qr=new QueryRunner(ds);
        String sql="delete from student where sid=?;";
        try {
            qr.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Student> showAll(){
        ds=new ComboPooledDataSource();
        QueryRunner qr=new QueryRunner(ds);
        String sql="select * from student";
        try {
            List<Student> lists=qr.query(sql,new BeanListHandler<Student>(Student.class));
            return lists;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
