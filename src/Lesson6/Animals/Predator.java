package Lesson6.Animals;

public class Predator  extends Animals {

    public Predator(String AnimalType) {
        super(AnimalType);
    }

    public Predator() {
        super();
    }

    public void hunting(){
        System.out.println(AnimalType + " охотится");
    }

    @Override
    public void eat(){
        System.out.println(AnimalType + " ест добычу");
    }
}
