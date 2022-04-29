package com.sunglowsys.domain;

public class Employee {
    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String address;

    public Employee() {}

    public Employee(Long id, String name, String email, String mobile, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public void getId() {
        System.out.println("id:"+id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getName() {
        System.out.println("name:"+name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getEmail() {
        System.out.println("email:"+email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getMobile() {
        System.out.println("mobile:"+mobile);
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void getAddress() {
        System.out.println("address:"+address);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
