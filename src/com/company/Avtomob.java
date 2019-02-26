package com.company;

public class Avtomob {
    public static void main(String[] args) {

        Car avto01 = new Car("Toyota", 2000, 150);
        Lorry gruzovik01 = new Lorry("Audi", 3000, 130, 1000);
        avto01.displayInfo();
        avto01.setPower(1000);
        avto01.displayInfo();
        gruzovik01.displayInfo();
        gruzovik01.setBrand("Volvo");
        gruzovik01.setCarrying(2500);
        gruzovik01.displayInfo();
    }
}
class Car{
    String brand;    // марка автомобиля
    int weight;      // вес автомобиля
    int power;       // мощность двигателя

      public Car (String b, int w, int p)
    {
        brand = b;
        weight = w;
        power = p;
    }

    void setPower (int newPower) {
        if (newPower < 0) System.out.println("Отрицательной мощности быть не может");
        else if (newPower > 2000) System.out.println("Да у танка меньше л/с");
        else power = newPower;
    }
    void displayInfo(){
        System.out.printf("Марка автомобиля: %s \nВес автомобиля: %d кг\nМощность двигателя: %d л/с\n", brand, weight, power);
    }
}
class Lorry extends Car {
    int carrying;      // грузоподъемность
    public Lorry (String b, int w, int p, int c) {
        super(b, w, p);
        carrying = c;
    }
    void setBrand (String newBrand){
        brand = newBrand;
    }
    void setCarrying (int newCarrying) {
        if (newCarrying < 0) System.out.println("Отрицательной грузоподъемности быть не может");
        else if (newCarrying > 3000) System.out.println("Столько не потянет");
        else carrying = newCarrying;}
    void displayInfo(){
        System.out.printf("Марка грузовика: %s \nВес грузовика: %d кг\nМощность двигателя: %d л/с\nГрузоподъемность: %d\n", brand, weight, power, carrying);
    }
}