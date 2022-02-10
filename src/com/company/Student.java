package com.company;

public class Student {
    String id;
    String salutation;
    String fullName;
    String gender;
    int birthYear;

    @Override
    public String toString() {
        return  id + " " + salutation + " " + fullName + " " + gender + " " + birthYear;
    }

    public Student(String id, String salutation, String fullName, String gender, int birthYear) {
        this.id = id;
        this.salutation = salutation;
        this.fullName = fullName;
        this.gender = gender;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
}
