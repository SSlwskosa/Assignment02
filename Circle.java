package com.sstack.lkosa.assignments.Assignment02;
/***
 * Implements a Circle shape
 * @author Lajos Kosa
 * Created on:  02/24/2021
 */
import java.text.DecimalFormat;

public class Circle implements Shape
{
    // Format decimal values to be easier to read,  ↓ 4 decimal precision
    DecimalFormat df = new DecimalFormat("0.####");
    // Radius of Circle
    private Double radius;

    /***
     * Constructor for Circle
     * @param r Radius of Circle
     */
    public Circle(double r)
    {
        radius = r;
    }
    /***
     * Calculate the area of Circle
     * @return (double) Area of Circle
     */
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius,2);
    }
    /***
     * Show shape
     */
    public void display()
    {
        System.out.println("⚫");
    }
    /***
     * Display information about Circle
     */
    public void printDetails()
    {
        System.out.printf("\tRad of Circle is:\t%s\n", df.format(radius));
    }
}
