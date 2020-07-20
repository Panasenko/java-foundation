package Lesson5.Route;

/**
 * Маршрут следования автобуса
 */

public class Route {

    private final BusStation[] busStations;
    private int numberStation = 0;

    public int getNumberStation() {
        return numberStation;
    }

    public int getBusStationLength() {
        return busStations.length;
    }

    public Route(BusStation[] bs) {
        this.busStations = bs;
    }


    public BusStation getBusStations() {
        return busStations[numberStation];
    }

    public BusStation nextStation() {

        if (busStations.length <= numberStation) {
            return busStations[numberStation];
        }

        return busStations[numberStation++];

    }


}
