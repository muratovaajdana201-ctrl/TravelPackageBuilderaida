package travelbuilder;

public final class TravelPackage {
    private final String destination;
    private final String hotel;
    private final String transport;
    private final String meals;
    private final String activities;
    private final int durationDays;

    TravelPackage(String destination,
                  String hotel,
                  String transport,
                  String meals,
                  String activities,
                  int durationDays) {
        this.destination = destination;
        this.hotel = hotel;
        this.transport = transport;
        this.meals = meals;
        this.activities = activities;
        this.durationDays = durationDays;
    }

    public String getDestination() {
        return destination;
    }

    public String getHotel() {
        return hotel;
    }

    public String getTransport() {
        return transport;
    }

    public String getMeals() {
        return meals;
    }

    public String getActivities() {
        return activities;
    }

    public int getDurationDays() {
        return durationDays;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "destination='" + destination + '\'' +
                ", hotel='" + hotel + '\'' +
                ", transport='" + transport + '\'' +
                ", meals='" + meals + '\'' +
                ", activities='" + activities + '\'' +
                ", durationDays=" + durationDays +
                '}';
    }
}