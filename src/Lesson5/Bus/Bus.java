package Lesson5.Bus;

import Lesson5.Passenger.Passenger;
import Lesson5.Route.BusStation;
import Lesson5.Route.Route;
import java.util.ArrayList;

/**
 * Класс описывающий поведение автобуса.
 */

public class Bus {

    Route route;
    BusStation station;
    ArrayList<Passenger> busPassenger = new ArrayList();

    /**
     * @param route - Обект маршрута автобуса
     */

    public Bus(Route route) {
        this.route = route;
        this.station = route.getBusStations();
    }

    public ArrayList<Passenger> getBusPassenger() {
        return busPassenger;
    }

    /**
     * Метод осуществляющий движение автобуса по маршруту
     */
    public void dispatch() {
        System.out.println("Автобус отправился с станции: " + route.getBusStations().getStationName());
        station = route.nextStation();
    }

    /**
     * Метод выводящий информацию о станциях на которые прибыл автобус
     */
    public void arrival() {

        if (route.getNumberStation() < (route.getBusStationLength() - 1)) {
            System.out.println("Автобус прибыл на станцию : " + route.getBusStations().getStationName());
        } else {
            System.out.println("Автобус прибыл на конечную станцию: " + route.getBusStations().getStationName());
        }
    }

    /**
     *
     * @param passenger - объект пассажира, который входит в автобус. Осуществляется проверка на наличие собаки
     */
    public void passengersInput(Passenger passenger) {

        String text = "В автобус зашел пассажир ";

        busPassenger.add(passenger);

        text += passenger.getName();

        if (passenger.getHaveDog() != null) {
            text += " с собакой по кличке " + passenger.getHaveDog().getName();
        }

        System.out.println(text);

    }

    /**
     *
     * @param passenger - объект пассажира, который выходит из автобуса. Осуществляется проверка на наличие собаки
     */
    public void passengersOutput(Passenger passenger) {
        String text = "Из автобуса вышел пассажир ";

        text += passenger.getName();

        if (passenger.getHaveDog() != null) {
            text += " с собакой по кличке " + passenger.getHaveDog().getName();
        }

        System.out.println(text);
    }

}
