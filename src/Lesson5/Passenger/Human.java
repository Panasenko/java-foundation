package Lesson5.Passenger;

/**
 * Класс описывающий поведение объекта человек
 */
public class Human implements Passenger {

    public String name;
    public String stationDestination;
    public Dog haveDog;

   public Human(String name, String stationDestination, Dog haveDog){
        this.name = name;
        this.stationDestination = stationDestination;
        this.haveDog = haveDog;
    }

    @Override
    public String getName() {
        return name;
    }

    public Dog getHaveDog() {
        return haveDog;
    }

    public String getStationDestination() {
        return stationDestination;
    }

}
