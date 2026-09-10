package travelbuilder;
/**
 * Defines the steps for building a travel package.
 */

public interface TravelPackageBuilder {

    TravelPackageBuilder setDestination(String destination);

    TravelPackageBuilder setHotel(String hotel);

    TravelPackageBuilder setTransport(String transport);

    TravelPackageBuilder setMeals(String meals);

    TravelPackageBuilder setActivities(String activities);

    TravelPackageBuilder setDurationDays(int durationDays);
}