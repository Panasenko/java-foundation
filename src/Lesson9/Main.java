package Lesson9;

public class Main {
    public static void main(String[] args) {

        System.out.println("_____________ Все методы отработают ________________");

        Car car1 = new Car();
        Auto<Car> c1 = new Auto<>(car1);
        methodSuper(c1);
        methodExtends(c1);

        Honda honda1 = new Honda();
        Auto<Honda> a1 = new Auto<Honda>(honda1);
        methodSuper(a1);
        methodExtends(a1);

        Accord accord1 = new Accord();
        Auto<Accord> ac1 = new Auto<Accord>(accord1);
        methodSuper(ac1);
        methodExtends(ac1);


        System.out.println("_____________Демонстрация ограничений аргументов________________");

        Car car = new Car();
        Auto<Car> c2 = new Auto<>(car);
        methodSuperLimited(c2);
        //methodExtendsLimited(c2); //- Ошибка на этапе компиляции так-как объект Car не является наследником объекта Honda

        Honda honda = new Honda();
        Auto<Honda> h2 = new Auto<>(honda);
        methodSuperLimited(h2);
        methodExtendsLimited(h2); //- Компиляция будет проведена успешно

        Accord accord = new Accord();
        Auto<Accord> a2 = new Auto<>(accord);
        //methodSuperLimited(a2); // - Ошибка компиляции, так-как Accord не является родительским классом для Honda
        methodExtendsLimited(a2);

    }

    public static void methodExtends(Auto<? extends Car> auto) {
        auto.getAuto().get();
    }

    public static void methodSuper(Auto<? super Accord> auto) {
        auto.setAuto();
    }

    public static void methodSuperLimited(Auto<? super Honda> auto) {
        auto.setAuto();
    }

    public static void methodExtendsLimited(Auto<? extends Honda> auto) {
        auto.getAuto().get();
    }
}

class Car<C> {
    public void get() {
        System.out.println("This is Car");
    }
}

class Honda<H> extends Car {
    public void get() {
        System.out.println("This is Honda");
    }
}

class Accord<A> extends Honda {
    public void get() {
        System.out.println("This is Accord " + Class.class.getName());
    }
}


class Auto<T> {

    T auto;

    public Auto(T auto) {
        this.auto = auto;
    }

    public Auto() {
    }

    public T getAuto() {
        return auto;
    }

    public void setAuto() {
        System.out.println("Метод добавления авто");
    }

}
