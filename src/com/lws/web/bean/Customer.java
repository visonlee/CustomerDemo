package com.lws.web.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by slpay on 17/09/2017.
 */
public class Customer implements Serializable {
    private String id;
    private String name;
    private String gender;
    private Date birthday;
    private String cellphone;
    private String email;
    private String hobby;
    private String type;
    private String description;

    public Customer(){}

    public Customer(String id, String name, String gender, Date birthday,
                    String cellphone, String email, String hobby, String type,
                    String description) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.cellphone = cellphone;
        this.email = email;
        this.hobby = hobby;
        this.type = type;
        this.description = description;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getCellphone() {
        return cellphone;
    }
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
