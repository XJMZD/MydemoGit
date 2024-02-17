package webstudy.bean;

public class User {
   private int uid;
   private String uname;
   private double money;

    public User() {
    }

    public User(int uid, String uname, double money) {
        this.uid = uid;
        this.uname = uname;
        this.money = money;
    }

    public User(String uname, double money) {
        this.uname = uname;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", money=" + money +
                '}';
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
