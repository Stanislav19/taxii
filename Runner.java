package oop.homeWork3_4.taxiTariffCalculator;

public class Runner {

    public static void main(String[] args) {

        TaxiTariff standard = new StandardTariff();
        FamilyTariff familyRate = new FamilyTariff();

        TaxiRide taxiRide1 = new TaxiRide(2, 1, 1, standard);
        TaxiRide taxiRide12 = new TaxiRide(2, 4, 1, standard);
        TaxiRide taxiRide13 = new TaxiRide(2, 1, 1, familyRate);


        TaxiRides taxiRides = new TaxiRides();
        taxiRides.add(taxiRide1);
        taxiRides.add(taxiRide12);
        taxiRides.add(taxiRide13);

        System.out.println(taxiRides.getSumPrice());
    }
}