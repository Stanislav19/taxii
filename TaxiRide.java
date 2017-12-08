package oop.homeWork3_4.taxiTariffCalculator;
/*      Taxi Tariff Calculator. Сложность: **. Приоритет: ***.
        Написать программу, которая подсчитывает стоимость поездок в такси в соответствии с различными тарифами.
        Поездка в такси (TaxiRide) включает количество пассажиров (passengers),
        расстояние в километрах (distance), длительность в минутах (duration).
        Есть несколько типов тарифов:
        1. StandardTariff Tariff: 30 + 5 * distance + 2 * duration.
        2. FamilyTariff Tariff: 50 + 20 * distance / passengers.
        Система должна быть гибкой для добавления новых типов тарифов.
        Необходимо реализовать TaxiRides, содержащий множество поездок и умеющий подсчитывать
        суммарную стоимость всех поездок в соответствии с заданным тарифом.
        Подсказка: Необходимо создать интерфейс TaxiTariff с методом long calculatePrice(TaxiRide ride).
        Каждый конкретный тариф - это реализация данного интерфейса. TaxiRides может содержать метод long getPrice(TaxiTariff tariff).
*/

public class TaxiRide {
    private int passengers;
    private long distance;
    private long duration;
    private TaxiTariff typeOfRide;

    public TaxiRide(int passengers, long distance, long duration, TaxiTariff typeOfRide) {
        this.passengers = passengers;
        this.distance = distance;
        this.duration = duration;
        this.typeOfRide = typeOfRide;
    }

    public int getPassengers() {
        return passengers;
    }

    public long getDistance() {
        return distance;
    }

    public long getDuration() {
        return duration;
    }

    public TaxiTariff getTaxiTariff()
    {
        return  typeOfRide;
    }

    public long getPrice() {
        return typeOfRide.calculatePrice(this);
    }
}
