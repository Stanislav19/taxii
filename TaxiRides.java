package oop.homeWork3_4.taxiTariffCalculator;

import java.util.ArrayList;
import java.util.List;

public class TaxiRides {
    private List<TaxiRide> taxiRides = new ArrayList<>();

    public void add(TaxiRide taxiRide) {
        taxiRides.add(taxiRide);
    }

    TaxiRide ride = null;

    public long getSumPrice() {
        long price = 0;
        TaxiRide ride = null;
        for (int i = 0; i < taxiRides.size(); i++) {
            ride = taxiRides.get(i);
            price +=  ride.getPrice();
        }
        return price;
    }

    public TaxiRide getRide() {
        return ride;
    }
}