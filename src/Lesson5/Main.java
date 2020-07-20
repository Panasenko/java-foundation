package Lesson5;

import Lesson5.Bus.Bus;
import Lesson5.Passenger.Dog;
import Lesson5.Passenger.Human;
import Lesson5.Passenger.Passenger;
import Lesson5.Route.BusStation;
import Lesson5.Route.Route;

import java.util.ArrayList;

public class Main {

    Route route = new Route(initStation());
    Bus bus = new Bus(route);

    /**
     *
     * Поочередный вызов метода обеспечивающего перемещение между станциями
     */

    public static void main(String[] args) {

        Main mn = new Main();

        mn.bus.dispatch();

        routeNext(mn);
        routeNext(mn);
        routeNext(mn);
        routeNext(mn);
    }

    /**
     *
     * @param mn
     */
    private static void routeNext(Main mn) {
        System.out.println("_______________________________________________________________________");
        Passenger[] passangers = mn.route.getBusStations().getPassengers();
        ArrayList<Passenger> busPassenger = mn.bus.getBusPassenger();

        /**
         * Автобус приыл на станцию
         */
        mn.bus.arrival();

        /**
         * Осуществляется высадка пассажиров из автобуса
         */
        if (busPassenger.size() > 0) {
            for (int i = 0; i < busPassenger.size(); i++) {

                Passenger bp = busPassenger.get(i);

                if (bp.getStationDestination().equals(mn.route.getBusStations().getStationName())) {
                    mn.bus.passengersOutput(bp);
                }
            }
        }

        /**
         * Осуществляется посадка пассажиров в автобус
         */
        if (passangers.length > 0) {
            for (Passenger passenger : passangers) {
                mn.bus.passengersInput(passenger);
            }
        }

        /**
         * Проверка станции прибытия автобуса и сопоставление с конечной остановкой маршрута
         */
        if (mn.route.getNumberStation() < (mn.route.getBusStationLength() - 1)) {
            mn.bus.dispatch();
        }
    }

    /**
     *
     * @return возвращает инициализированный объект с маршрутом, станциями и пассажирами, которые находятся на данных станциях
     */
    private BusStation[] initStation() {

        BusStation[] bs = new BusStation[5];

        bs[0] = new BusStation("Финтазия.", new Passenger[]{});
        bs[1] = new BusStation("бул. Славы", new Passenger[]{new Human("Коля", "Победа 50", new Dog("Rex"))});
        bs[2] = new BusStation("Кодак", new Passenger[]{});
        bs[3] = new BusStation("Победа 50",
                new Passenger[]{
                        new Human("Марго", "ПриватБанк", null),
                        new Human("Валентин", "ПриватБанк", null),
                        new Human("Лена", "ПриватБанк", null),
                        new Human("Петр", "ПриватБанк", null),
                });
        bs[4] = new BusStation("ПриватБанк", new Passenger[]{});

        return bs;

    }

}
