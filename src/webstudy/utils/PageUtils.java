package webstudy.utils;

import webstudy.bean.User;

import java.util.List;

public class PageUtils {
    private int pageCount;//每页数据
    private int currentPage;//当前页
    private int sumCount;
    private int sumPage;
    private int index;
    private int prePage;
    private int nextPage;
    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public PageUtils(int pageCount, int currentPage, int sumCount) {
        this.pageCount = pageCount;
        this.currentPage = currentPage;
        this.sumCount = sumCount;
        this.sumPage=sumCount/pageCount+(sumCount%pageCount==0?0:1);
        this.index=(currentPage-1)*pageCount;
        this.prePage=currentPage==1?1:currentPage-1;
        this.nextPage=currentPage==sumPage?sumPage:currentPage+1;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public void setSumCount(int sumCount) {
        this.sumCount = sumCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getSumCount() {
        return sumCount;
    }

    public int getSumPage() {
        return sumPage;
    }

    public int getIndex() {
        return index;
    }

    public int getPrePage() {
        return prePage;
    }

    public int getNextPage() {
        return nextPage;
    }
}
