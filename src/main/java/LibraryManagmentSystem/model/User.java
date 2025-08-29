package LibraryManagmentSystem.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    static int count=0;
    private int userid;
    private String name;
    private String email;
    private String phone;

    public User() {
    }

    public User(String name, String email, String phone) {
        this.userid = ++count;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
