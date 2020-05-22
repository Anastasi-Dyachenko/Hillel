package Lesson2;


public class Cat {
    public String name;
    public int weight = 6;
    public int age=3;
    public String adres = "Свободный и независисмый";
    public String color = "Необычайный";


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String adres) {

        this.weight = weight;
        this.adres = adres;
        this.color = color;
    }

}

