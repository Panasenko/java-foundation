package Lesson6.Animals;

import java.util.Objects;

public class Giraffe extends Animals{

    public String eatGrass;

    public Giraffe(String AnimalType, String eatGrass){
        super(AnimalType);
        this.eatGrass = eatGrass;
    }

    protected void eatGrass() {
        System.out.println(AnimalType + "ест траву");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Giraffe giraffe = (Giraffe) o;
        return Objects.equals(eatGrass, giraffe.eatGrass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eatGrass);
    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "eatGrass='" + eatGrass + '\'' +
                ", AnimalType='" + AnimalType + '\'' +
                '}';
    }
}
