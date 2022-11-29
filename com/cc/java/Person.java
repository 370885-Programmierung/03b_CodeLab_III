package com.cc.java;

public class Person {

private String name;
private String firstName;
private int birthYear;

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public int getBirthYear() {
    return birthYear;
}
public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
}

public String tellAboutYou() {
    return "I am ok.";
}

}
