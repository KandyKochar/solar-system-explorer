# Solar System Explorer

A Java OOP application modelling planets in our solar system using inheritance and polymorphism.

## Overview
Implements a class hierarchy for different planet types — gas giants, ice giants, and rocky planets with surface materials. Demonstrates abstract classes, interfaces, and polymorphic behaviour in Java.

## Features
- Planet class hierarchy with GasGiant and IceGiant subclasses
- SurfaceMaterial enum for rocky planet composition
- SolarSystem container managing a collection of planets
- Polymorphic display of planet properties

## Technologies Used
- **Language:** Java (JDK 8+)
- **Build:** Apache Maven

## Project Structure
```
src/main/java/com/mycompany/solarsystem/
+-- SolarSystem.java          # Collection and display of planets
+-- GasGiant.java             # Gas giant planet subclass
+-- IceGiant.java             # Ice giant planet subclass
+-- SurfaceMaterial.java      # Enum for surface compositions
+-- Assignment04Planets.java  # Main entry point
+-- Tester.java               # Test scenarios
```

## Usage
```bash
mvn compile exec:java
```

## Author
Kandy Kochar
