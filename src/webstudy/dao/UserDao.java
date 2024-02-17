package webstudy.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.PoolBackedDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import webstudy.bean.User;
import webstudy.utils.PageUtils;

import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
    private String sql="";
    public int queryCount() {
        sql="select count(*) from user_money";
        try {
            return (int)(long) qr.query(sql, new ScalarHandler());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<User> pageQueryUsers(PageUtils pageUtils) {
        sql="select * from user_money limit ?,?";
        try {
            return qr.query(sql,new BeanListHandler<>(User.class),pageUtils.getIndex(),pageUtils.getPageCount());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
