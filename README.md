# Builder Pattern - Car

## Description

This project demonstrates the Builder creational design pattern
using Java 17.

The project builds different types of cars using the Builder pattern.
It includes Luxury and Sports car builders.

## Design Pattern Structure

- Car - Product
- CarBuilder - Builder interface
- BaseCarBuilder - common builder implementation
- LuxuryCarBuilder - Concrete Builder
- SportsCarBuilder - Concrete Builder
- CarDirector - Director
- Main - Client

## Technologies

- Java 17
- IntelliJ IDEA

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java 17 is configured.
3. Run the `Main` class.
4. The program will create and display a luxury car and a sports car.

## Example Output

Luxury car:
Car{brand='BMW', model='X5', engine='3.0L', color='Black', sunroof=true}

Sports car:
Car{brand='Porsche', model='911', engine='4.0L', color='Red', sunroof=false}