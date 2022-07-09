package com.example.dalycodeapp.DtoApps;

public class UserDto {

    private Integer id;
    private String name;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
