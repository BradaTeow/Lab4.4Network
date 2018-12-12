package my.edu.tarc.lab44network;

public class Course {
    private String code;
    private String title;
    private String credit;

    //An empty constructor
    public Course() {
    }

    //A constructor with param
    public Course(String code, String title, String credit) {
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getCredit() {
        return credit;
    }


    public void setCode(String s) {
    }

    public void setTitle(String s) {
    }

    public void setCredit(String s) {
    }
}
