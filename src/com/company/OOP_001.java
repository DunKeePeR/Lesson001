package com.company;

public class OOP_001 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Тузик", 22); // Собака по кличке Тузик, возраст 2 года
        dog1.getAge();
        dog1.vozrast();
        dog1.setAge(20);
        dog1.vozrast();
    }
}
class	Dog {
    private int age;// возраст
    private String name; // кличка

    public Dog(String n, int a) {
        name = n;
        age = setAge(a);
    }
    public void vozrast () {
        System.out.println(age);
    }
    public void setAge (int newAge) {
        if (newAge < 0) System.out.println("Как это понимать? Собака еще не родилась?");
        else if (newAge > 20) System.out.println("Они столько не живут");
        else age = newAge;
    }
    public int getAge() {
        return age;
    }
}