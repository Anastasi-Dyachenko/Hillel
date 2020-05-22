package Lesson8;

public class Dog {
    Boolean hasCollar;
    Boolean hasMuzzle;
    public Dog (Boolean hasCollar, Boolean hasMuzzle){
        this.hasCollar = hasCollar;
        this.hasMuzzle = hasMuzzle;
    }
    public void walk() throws DogIsNotReady {
        if (!hasCollar || !hasMuzzle) {
            throw new DogIsNotReady("Намордник!");
        }
        System.out.println("walk");
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(true, true);
        Dog dog2 = new Dog(true, false);


    }
    }

