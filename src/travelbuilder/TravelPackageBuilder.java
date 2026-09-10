package travelbuilder;

public interface TravelPackageBuilder {

    TravelPackageBuilder setDestination(String destination);

    TravelPackageBuilder setHotel(String hotel);

    TravelPackageBuilder setTransport(String transport);

    TravelPackageBuilder setMeals(String meals);

    TravelPackageBuilder setActivities(String activities);

    TravelPackageBuilder setDurationDays(int durationDays);
}