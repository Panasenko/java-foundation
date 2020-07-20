package Lesson6;

import Lesson6.Animals.Animals;
import Lesson6.Animals.Giraffe;
import Lesson6.Animals.Predator;
import Lesson6.Animals.Tiger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        new Main().start();
    }

    public void start() throws Exception {

        System.out.println("------------------- Пример полиморфизма при візове меодов -----------------");
        Animals[] animal = new Animals[]{
                new Tiger(),
                new Giraffe("Жираф","Трава")
        };

        for (Animals an : animal) {
            use(an);
        }


        Giraffe giraffe = new Giraffe("Жираф", "Трава");
        Tiger tiger = new Tiger("Тигр", "мясо");

        System.out.println("------------------- Переопределение методов -----------------");
        System.out.println("Вывод работы переопределенного метода toString()" + giraffe.toString());
        System.out.println("Вывод работы переопределенного метода equals()" + giraffe.equals(tiger));
        System.out.println("Вывод работы переопределенного метода hashCode()" + giraffe.hashCode());

        System.out.println("---------------- Создание объекта при помщи механизма рефлексии --------------------");

        Class clazz = Class.forName("Lesson6.Animals.Predator");
        Constructor constructor = clazz.getConstructor(new Class[]{String.class});

        Object predator = constructor.newInstance("Хищник");
        Predator pr = (Predator) predator;

        pr.hunting();
    }


   public void use(Animals animal){
        animal.sleep();
        animal.awoke();
        animal.eat();
    }

}
