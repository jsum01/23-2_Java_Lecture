package miniSungdong;

import java.time.LocalDateTime;
import java.util.ArrayList;
/*
* 프로그램 개요
* [ 회원 관리 시스템 ]
* 컬럼 : 고유 아이디, 고객명, 고객 나이, 고객 유형, 가입일
* */
public class Users {
    private int id; // 고유 아이디
    private String name; // 고객명
    private int age; // 고객 나이
    private LocalDateTime joined; // 가입일
    private int userType;
    private int discount_rate; // 할인률



    public Users(int id, String name, int age, LocalDateTime joined, int userType, int discount_rate) {
        id = id;
        name = name;
        age = age;
        joined = joined;
        userType = userType;
        discount_rate = discount_rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = LocalDateTime.parse(joined);
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getDiscount_rate() {
        return discount_rate;
    }

    public void setDiscount_rate(int discount_rate) {
        this.discount_rate = discount_rate;
    }
}
