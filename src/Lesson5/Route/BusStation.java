package Lesson5.Route;

import Lesson5.Passenger.Passenger;

/**
 * Класс описывающий поведение обьеекта автобусная остановка
 */

public class BusStation implements Station{

    private final String stationName;
    private Passenger[] passengers;

    /**
     *
     * @param stationName - Название текущей станции
     * @param passengers - массив пассажиров, которые находятся на станции
     */
    public BusStation(String stationName, Passenger[] passengers){
        this.stationName = stationName;
        this.passengers = passengers;
    }

    public String getStationName() {
        return stationName;
    }

    public Passenger[] getPassengers() {
        return this.passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

}
