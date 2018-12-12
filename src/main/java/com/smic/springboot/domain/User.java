package com.smic.springboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Description User实体对象
 * @Date 2018/12/11 21:48
 * @Param
 * @return
 **/
@Entity
public class User {
    @Id //表示这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //数据库自增策略
    private Long id;

    private String name;

    private String mail;


    protected User() {//无参构造函数，设置为protected是为防止直接使用
    }


    public User(Long id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return String.format("User[id=%d, name=%s, mail=%s",id,name,mail);
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