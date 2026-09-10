package travelbuilder;
/**
 * Builds a text-based travel itinerary representation.
 */

public class ItineraryBuilder implements TravelPackageBuilder {

    private String destination;
    private String hotel;
    private String transport;
    private String meals;
    private String activities;
    private int durationDays;

    @Override
    public ItineraryBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public ItineraryBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    public ItineraryBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public ItineraryBuilder setMeals(String meals) {
        this.meals = meals;
        return this;
    }

    @Override
    public ItineraryBuilder setActivities(String activities) {
        this.activities = activities;
        return this;
    }

    @Override
    public ItineraryBuilder setDurationDays(int durationDays) {
        this.durationDays = durationDays;
        return this;
    }

    public String getResult() {
        validate();

        return "TRAVEL ITINERARY\n" +
                "Destination: " + destination + "\n" +
                "Hotel: " + hotel + "\n" +
                "Transport: " + transport + "\n" +
                "Meals: " + meals + "\n" +
                "Activities: " + activities + "\n" +
                "Duration: " + durationDays + " days";
    }

    private void validate() {
        if (destination == null || destination.trim().isEmpty()) {
            throw new IllegalStateException("Destination is required.");
        }

        if (hotel == null || hotel.trim().isEmpty()) {
            throw new IllegalStateException("Hotel is required.");
        }

        if (transport == null || transport.trim().isEmpty()) {
            throw new IllegalStateException("Transport is required.");
        }

        if (durationDays <= 0) {
            throw new IllegalStateException("Duration must be greater than 0.");
        }
    }
}
