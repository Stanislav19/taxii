package oop.homeWork3_4.taxiTariffCalculator;

public class StandardTariff implements TaxiTariff {

    public long calculatePrice(TaxiRide ride) {

        return 30 + 5 * ride.getDistance() + 2 * ride.getDuration();
    }
}
