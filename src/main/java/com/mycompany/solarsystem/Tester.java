/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment04.planets;

/**
 *
 * @author Kandy kochar
 */
/**


/**
 * Tester class to run the SolarSystem simulation
 * @author Kandy Kochar
 */


public class Tester {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem(); // Create SolarSystem object
        solarSystem.sortPlanetsByDiameter();         // Sort planets by diameter
        solarSystem.displaySortedPlanets();          // Display sorted planets

        Assignment04Planets p1 = new Assignment04Planets("Mars", SurfaceMaterial.TERRESTRIAL, 687, 6792, false, false,2);
        Assignment04Planets p2 = new Assignment04Planets("Earth", SurfaceMaterial.TERRESTRIAL, 365.2, 12756, true, false,1);
        Assignment04Planets p3 = new Assignment04Planets("Neptune", SurfaceMaterial.ICY, 59800, 49528, true, true,16);
        Assignment04Planets p4 = new Assignment04Planets("Mercury", SurfaceMaterial.TERRESTRIAL, 88, 4879, true, false,0);

        System.out.println("\nIs planet Mars equal to planet Earth? " + p1.equals(p2));
        System.out.println("Is planet Neptune equal to planet Mercury? " + p3.equals(p4));
    }
}
