package com.monfamily.wow.user;

public class TestUser {
    private String id= "아이디";
    private String name = "홍길동";

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
