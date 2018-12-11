package com.smic.springboot.domain;

/**
 * @Description User实体对象
 * @Date 2018/12/11 21:48
 * @Param
 * @return
 **/
public class User {
    private Long id;

    private String name;

    private String mail;


    public User() {
    }


    public User(Long id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}


/* Location:              E:\Springboot-Learning\thymeleaf-in-action\build\classes\java\main\!\com\smic\springboot\domain\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */