package webstudy.utils;

import java.util.LinkedList;

public class Test {
    @org.junit.Test
    public void test1(){
        LinkedList<String> online = new LinkedList<>();
        online.add("123");
        System.out.println(online.remove("123"));
    }
}
