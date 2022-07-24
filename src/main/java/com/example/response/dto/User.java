package com.example.response.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
//널값을 포한하지 않겠다.

public class User
{
    private  String name;
    private  int age;
   // @JsonProperty("phone_number") 1개만 하는방법
    private String phoeNumber;
    private String Address;

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

    public String getPhoeNumber() {
        return phoeNumber;
    }

    public void setPhoeNumber(String phoeNumber) {
        this.phoeNumber = phoeNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoeNumber='" + phoeNumber + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
