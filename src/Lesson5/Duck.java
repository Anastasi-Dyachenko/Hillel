package Lesson5;

public class Duck implements Runnable, Swimmable, Flyable {
    public void swim (){
        System.out.println("Она плывёт, ура");
    }
    public void fly (){
        System.out.println("Она летит или...");
    }
    public void run (){
        System.out.println("О как побежала");
    }
}
