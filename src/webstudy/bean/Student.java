package webstudy.bean;

public class Student {
    private int sid;
    private   String sname;
    private int sex;
    private   String hobby;
    private   String school;
    public Student(){}
    public Student(int sid, String sname, int sex, String hobby, String school) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.hobby = hobby;
        this.school = school;
    }

    public Student(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex=" + sex +
                ", hobby='" + hobby + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
