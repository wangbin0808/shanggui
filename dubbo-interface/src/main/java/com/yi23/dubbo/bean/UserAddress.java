package src.main.java.com.yi23.dubbo.bean;

import java.io.Serializable;

public class UserAddress implements Serializable {

    private Integer id;
    private String name;

    private String data;
    private Integer age;
    private String sex;
    //1、表示男，0表示女


    public UserAddress(Integer id, String name, String data, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.age = age;
        this.sex = sex;
    }

    public UserAddress() {
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
