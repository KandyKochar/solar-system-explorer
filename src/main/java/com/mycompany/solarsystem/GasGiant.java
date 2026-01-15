/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment04.planets;

/**
 *
 * @author Kandy kochar
 */

public class GasGiant extends Assignment04Planets {
    private int numberOfMoons;
    private boolean storms;


  public GasGiant(String name, SurfaceMaterial surfaceMaterial, double daysToOrbitSun, double diameter,
                boolean globalMagneticField, boolean rings, int numberOfMoons, boolean storms) {
    super(name, surfaceMaterial, daysToOrbitSun, diameter, globalMagneticField, rings, numberOfMoons);
    this.storms = storms;
}

  @Override
public String toString() {
    return super.toString() +
           "\nStorms: " + (storms ? "Yes" : "No");
}
}