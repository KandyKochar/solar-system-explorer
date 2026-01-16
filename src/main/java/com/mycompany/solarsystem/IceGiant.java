/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment04.planets;

/**
 *
 * @author Kandy kochar
 */


public class IceGiant extends Assignment04Planets {
    private int numberOfMoons;
    private boolean hasSlushyIce;

    public IceGiant(String name, SurfaceMaterial surfaceMaterial, double daysToOrbitSun, double diameter,
                    boolean globalMagneticField, boolean rings, int numberOfMoons, boolean hasSlushyIce) {
        super(name, surfaceMaterial, daysToOrbitSun, diameter, globalMagneticField, rings,numberOfMoons);
        this.numberOfMoons = numberOfMoons;
        this.hasSlushyIce = hasSlushyIce;
    }

    @Override
    public String toString() {
        return super.toString() +
               
                "\nHas slushy Ice: " + (hasSlushyIce ? "Yes" : "No");
    }
}
