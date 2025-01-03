package com.StarkIndustries.SpringOrmMark1.Model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Component
public class Student {

    @Id
    @Column(name="StudentId")
    private int sid;

    @Column(name = "StudentName")
    private String name;

    @Column(name = "StudentDepartment")
    private String department;

    @Column(name = "StudentEmail")
    private String email;

    @Column(name = "StudentPhoneNo")
    private String phoneNo;

    public Student(int sid, String name, String department, String email, String phoneNo) {
        this.sid = sid;
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public Student(String name, String department, String email, String phoneNo) {
        this.name = name;
        this.department = department;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public Student(){

    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
