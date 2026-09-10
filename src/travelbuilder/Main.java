package travelbuilder;

public class Main {

    public static void main(String[] args) {

        TravelDirector director = new TravelDirector();

        TravelPackageObjectBuilder objectBuilder =
                new TravelPackageObjectBuilder();

        director.makeLuxuryTrip(objectBuilder);

        TravelPackage luxuryTrip = objectBuilder.getResult();

        System.out.println("LUXURY TRIP");
        System.out.println(luxuryTrip);

        ItineraryBuilder itineraryBuilder =
                new ItineraryBuilder();

        director.makeLuxuryTrip(itineraryBuilder);

        String itinerary = itineraryBuilder.getResult();

        System.out.println();
        System.out.println(itinerary);

        TravelPackageObjectBuilder budgetBuilder =
                new TravelPackageObjectBuilder();

        director.makeBudgetTrip(budgetBuilder);

        TravelPackage budgetTrip = budgetBuilder.getResult();

        System.out.println();
        System.out.println("BUDGET TRIP");
        System.out.println(budgetTrip);
        System.out.println();
        System.out.println("VALIDATION TEST");

        try {
            TravelPackageObjectBuilder invalidBuilder =
                    new TravelPackageObjectBuilder();

            invalidBuilder
                    .setDestination("")
                    .setHotel("Test Hotel")
                    .setTransport("Bus")
                    .setDurationDays(5);

            invalidBuilder.getResult();

        } catch (IllegalStateException e) {
            System.out.println("Validation works: " + e.getMessage());
        }
    }
}