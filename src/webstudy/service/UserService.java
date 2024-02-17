package webstudy.service;

import webstudy.bean.User;
import webstudy.dao.UserDao;
import webstudy.utils.PageUtils;

import java.util.List;

public class UserService {
    private UserDao userDao=new UserDao();
    public PageUtils pageQueryUser(String currentPage, String pageSize) {
        int cp=1;
        if(currentPage!=null||!currentPage.equals("")){
            cp=Integer.parseInt(currentPage);
        }

        int ps = 3;
        if(pageSize!=null||!pageSize.equals("")){
            ps=Integer.parseInt(pageSize);
        }
        int sumCount=userDao.queryCount();
        PageUtils pageUtils=new PageUtils(ps,cp,sumCount);
        List<User> list=userDao.pageQueryUsers(pageUtils);
        pageUtils.setList(list);
        return pageUtils;
    }
}
