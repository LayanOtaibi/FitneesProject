/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinformation;

/**
 *
 * @author layan
 */
public class UserInformation {
    
     private String name;
    private int age;
    private double height;
    private double weight;
    private String gender;

    public UserInformation(String name, int age, double height, double weight, String gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + "\nGender: " + gender;
}
}
