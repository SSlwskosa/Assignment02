package com.sstack.lkosa.assignments.Assignment02;
/***
 * Implements a Rectangle shape
 * @author Lajos Kosa
 * Created on:  02/24/2021
 */
import java.text.DecimalFormat;

public class Rectangle implements Shape
{
    private Double width;
    private Double length;
    private Boolean isSquare;
    // Format decimal values to be easier to read,  ↓ 4 decimal precision
    DecimalFormat df = new DecimalFormat("0.####");

    /***
     * Constructor for Rectangle
     * @param w Width of Rectangle
     * @param l Length of Rectangle
     */
    public Rectangle(double w, double l)
    {
        width = w;
        // Is this a Square? (Equal sides)
        isSquare = (l == 0 || w == l) ? true : false;
        if(!isSquare)
        {
            length = l;
        }
    }
    /***
     * Calculate the area of Rectangle
     * @return (double) Area of Rectangle
     */
    public double calculateArea()
    {
        if (isSquare)
        {
            // Return Area of Square
            return Math.pow(width,2);
        }
        else
        {
            // Return Area of Rectangle
            return width * length;
        }
    }
    /***
     * Show shape
     */
    public void display()
    {
        if(isSquare)
        {
            System.out.println("■");
        }
        else
        {
            System.out.println("█");
        }
    }
    /***
     * Display information about Rectangle
     */
    public void printDetails()
    {
        if(isSquare)
        {
            System.out.printf("\tAll sides of Rectangle:\t%s\n", df.format(width));
        }
        else
        {
            System.out.printf("\tWidth of Rectangle is:\ts\n", df.format(width));
            System.out.printf("\tLength of Rectangle is:\t%s\n", df.format(length));
        }
    }
}
