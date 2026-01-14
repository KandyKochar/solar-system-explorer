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
 * Class that holds the array of planets and sorting logic
 */


public class SolarSystem {
    private Assignment04Planets[] planets;

    public SolarSystem() {
        planets = new Assignment04Planets[] {
            new Assignment04Planets("Mercury", SurfaceMaterial.TERRESTRIAL, 88, 4879, true, false,0),
            new Assignment04Planets("Venus", SurfaceMaterial.TERRESTRIAL, 2247, 12104, false, false,0),
            new Assignment04Planets("Earth", SurfaceMaterial.TERRESTRIAL, 365.2, 12756, true, false,1),
            new Assignment04Planets("Mars", SurfaceMaterial.TERRESTRIAL, 687, 6792, false, false,2),
            new GasGiant("Jupiter", SurfaceMaterial.GASEOUS, 4333, 142984, true, true, 95,true),
            new GasGiant("Saturn", SurfaceMaterial.GASEOUS, 10747, 120536, true, true, 146,true),
            new IceGiant("Uranus", SurfaceMaterial.ICY, 30660, 51118, true, true, 28, true),
            new IceGiant("Neptune", SurfaceMaterial.ICY, 59800, 49528, true, true,16,true)
        };
    }

    public void sortPlanetsByDiameter() {
        for (int i = 0; i < planets.length - 1; i++) {
            for (int j = 0; j < planets.length - 1 - i; j++) {
                if (planets[j].getDiameter() > planets[j + 1].getDiameter()) {
                    Assignment04Planets temp = planets[j];
                    planets[j] = planets[j + 1];
                    planets[j + 1] = temp;
                }
            }
        }
    }

    public void displaySortedPlanets() {
        System.out.println("Planets sorted by diameter:");
        for (Assignment04Planets planet : planets) {
            System.out.println();
            System.out.println(planet.toString());
        }
        System.out.println(); // <-- Blank line at the end as required
    }
}
