package oop.homeWork3_4.taxiTariffCalculator;

public class FamilyTariff implements TaxiTariff {

    public long calculatePrice(TaxiRide ride) {

        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}