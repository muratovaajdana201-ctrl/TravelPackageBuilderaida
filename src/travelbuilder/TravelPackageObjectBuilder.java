package travelbuilder;
/**
 * Builds a TravelPackage object representation.
 */

public class TravelPackageObjectBuilder implements TravelPackageBuilder {

    private String destination;
    private String hotel;
    private String transport;
    private String meals;
    private String activities;
    private int durationDays;

    @Override
    public TravelPackageObjectBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setHotel(String hotel) {
        this.hotel = hotel;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setMeals(String meals) {
        this.meals = meals;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setActivities(String activities) {
        this.activities = activities;
        return this;
    }

    @Override
    public TravelPackageObjectBuilder setDurationDays(int durationDays) {
        this.durationDays = durationDays;
        return this;
    }

    public TravelPackage getResult() {
        validate();
        return new TravelPackage(
                destination,
                hotel,
                transport,
                meals,
                activities,
                durationDays
        );
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
