# Travel Package Builder

## Overview

This project demonstrates the Builder Design Pattern in Java using a Travel Package as the product.

The same construction steps can produce two different representations:

* a `TravelPackage` object
* a text-based travel itinerary

## Project Structure

* `TravelPackage` — immutable Product.
* `TravelPackageBuilder` — Builder interface with a fluent API.
* `TravelPackageObjectBuilder` — concrete builder that creates a `TravelPackage` object.
* `ItineraryBuilder` — concrete builder that creates a text itinerary.
* `TravelDirector` — provides reusable travel package configurations.
* `Main` — client class that demonstrates the builders and validation.

## Builder Pattern

The `TravelPackageBuilder` interface defines the common construction steps:

* set destination
* set hotel
* set transport
* set meals
* set activities
* set duration

All builder methods return `this`, which provides a fluent API.

## Director Configurations

The `TravelDirector` provides two ready configurations:

* Luxury Trip — Switzerland, PARK HOTEL VITZNAU, Flight, Full Board, 7 days.
* Budget Trip — Prague, Central Hostel, Bus, Breakfast, 5 days.

The Director depends only on the `TravelPackageBuilder` interface, so the same construction process can be used by both concrete builders.

## Validation

The builders validate required fields before creating the result.

Invalid input causes an `IllegalStateException` with a clear error message.

## Technologies

* Java
* IntelliJ IDEA
* Git
* GitHub

## How to Run

Run the `Main` class.

The program demonstrates:

1. A luxury travel package object.
2. A luxury travel itinerary.
3. A budget travel package.
4. Validation of invalid input.
