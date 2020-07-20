package Lesson9;

public class Main {
    public static void main(String[] args) {

/*

        Car car1 = new Car();
        Auto<Car> c1 = new Auto<Car>(car1);
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
*/


        System.out.println("_____________Параметризация аргумента метода extends________________");


//        Auto<Car> c2 = new Auto<>();
//        methodSuperLimited(c2, new Car());
//        // methodExtendsLimited(c2); - Ошибка на этапе компиляции так-как объект Car не является наследником объекта Honda
//
//
//        // Код скомпилируется из-за того, что объекты попадают в диапазон ограничения Honda
//        Auto<Honda> a2 = new Auto<>();
//       // methodSuperLimited(a2, new Car<Honda>());
//       // methodExtendsLimited(a2);
//
//        Auto<Car> ac1 = new Auto<>();
//        methodSuperLimited(ac1, new Accord());
//        //methodExtends(ac1);
//    }
//
////    public static void methodExtends(Auto<? extends Car> auto) {
////        auto.getAuto().get();
////    }
////
////    public static void methodSuper (Auto<? super Accord> auto) {
////        auto.setAuto();
////    }

        Car car = new Car();
        Auto<Car> c2 = new Auto<>(car);
        methodSuperLimited(c2);
        //methodExtendsLimited(c2); //- Ошибка на этапе компиляции так-как объект Car не является наследником объекта Honda

        Honda honda = new Honda();
        Auto<Honda> h2= new Auto<>(honda);
        methodSuperLimited(h2);
        methodExtendsLimited(h2); //- Компиляция будет проведена успешно

        Accord accord = new Accord();
        Auto<Accord> a2= new Auto<>(accord);
        //methodSuperLimited(a2);
        methodExtendsLimited(a2); 
    }

    public static void methodSuperLimited(Auto<? super Honda> auto) {
       // auto.setAuto();
    }

    public static void methodExtendsLimited (Auto<? extends Honda> auto) {
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

//    public void setAuto(T auto) {
//        System.out.println("В обекте передан обект " + auto.getClass().getName());
//        this.auto = auto;
//    }

}
