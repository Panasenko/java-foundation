package Lesson6.Animals;

public class Tiger extends Predator {

    public Boolean hunting;
    public String eat;

    public Tiger(String AnimalType, String eat){
        super(AnimalType);
        this.eat = eat;
    }

    public Tiger(){
        super("Тигр");
    }

    public void eatMeat() {
        System.out.println(AnimalType + " ест " + eat);
    }

}
