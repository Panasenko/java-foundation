package Lesson6.Animals;

public class Animals {

    String AnimalType;

    Animals(String AnimalType){
        this.AnimalType = AnimalType;
    }

    Animals(){}

    public void sleep() {
        System.out.println(this.AnimalType + " спит");
    }

    public void eat() {
        System.out.println(this.AnimalType + " ест");
    }

    public void awoke() {
        System.out.println(this.AnimalType + " проснулся");
    }

}
