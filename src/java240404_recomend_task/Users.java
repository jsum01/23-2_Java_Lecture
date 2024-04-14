package java240404_recomend_task;

import java.time.LocalDateTime;

/*
* 프로그램 개요
* [ 회원 관리 시스템 ]
* 컬럼 : 고유 아이디, 고객명, 고객 나이, 고객 유형, 가입일
* */
public class Users {
    int id; // 고유 아이디
    String name; // 고객명
    int age; // 고객 나이
    LocalDateTime joined; // 가입일
    int userType;
    int discount_rate; // 할인률



    public Users(int id, String name, int age, LocalDateTime joined, int userType, int discount_rate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.joined = joined;
        this.userType = userType;
        this.discount_rate = discount_rate;
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
