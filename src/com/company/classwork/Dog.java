package com.company.classwork;

public class Dog {
    private String name;
    private String breed;
    private Integer age;
    private String color;

    public Dog(String name, String breed, Integer age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }


    public Integer getAge() {
        return age;
    }


    public String getColor() {
        return color;
    }


    public String toString(){
        return("Howdy! My name is "+this.name+"! I am a "+this.color+" "+this.breed+" "+this.age+" in Human years.");
    }

}
