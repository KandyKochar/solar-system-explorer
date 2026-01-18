/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment04.planets;

/**
 *
 * @author Kandy kochar
 */



/**
 * Superclass to represent general planet information
 * @author Kandy Kochar
 */


public class Assignment04Planets {
    protected String name;
    protected SurfaceMaterial surfaceMaterial;
    protected double daysToOrbitSun;
    protected double diameter;
    protected boolean globalMagneticField;
    protected boolean rings;
    protected int numberOfMoons;

    public Assignment04Planets(String name, SurfaceMaterial surfaceMaterial, double daysToOrbitSun, double diameter,
                                boolean globalMagneticField, boolean rings, int numberOfMoons) {
        this.name = name;
        this.surfaceMaterial = surfaceMaterial;
        this.daysToOrbitSun = daysToOrbitSun;
        this.diameter = diameter;
        this.globalMagneticField = globalMagneticField;
        this.rings = rings;
         this.numberOfMoons = numberOfMoons;
    }

    public double getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nSurface Material: " + surfaceMaterial +
                "\nDays to Orbit Sun: " + daysToOrbitSun +
                "\nDiameter: " + diameter +
                "\nGlobal Magnetic Field: " + (globalMagneticField ? "Yes" : "No") +
                "\nRings: " + (rings ? "Yes" : "No") +
                 "\nNumber of Moons: " + numberOfMoons ;
                       
}
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Assignment04Planets)) return false;
        Assignment04Planets other = (Assignment04Planets) obj;
        return this.name.equals(other.name);
    }
}
