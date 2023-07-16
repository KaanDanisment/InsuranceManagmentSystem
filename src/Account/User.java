package Account;

import Address.IAddress;

import java.util.ArrayList;
import java.util.Date;

public class User {
    ArrayList<IAddress> addresses = new ArrayList<>();

    private String name;
    private String surname;
    private String email;
    private int password;
    private int age;
    private String job;
    private Date lastLoginDate;

    public User(String name, String surname, String email, int password, int age,String job) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.job = job;
    }

    public ArrayList<IAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<IAddress> addresses) {
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
