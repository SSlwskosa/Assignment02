package com.sstack.lkosa.assignments.Assignment02;
/***
 * Implements a Triangle shape
 * @author Lajos Kosa
 * Created on:  02/24/2021
 */
import java.text.DecimalFormat;

public class Triangle implements Shape
{
    private Double baseLength;
    private Double height;
    private Boolean isEquilateral;
    // Format decimal values to be easier to read,  ↓ 4 decimal precision
    DecimalFormat df = new DecimalFormat("0.####");

    /***
     * Constructor for Triangle
     * @param bl Base Length of Triangle
     * @param h Height of Triangle
     */
    public Triangle(double bl, double h)
    {
        baseLength = bl;
        // Is this Triangle Equilateral? (Equal Sides)
        isEquilateral = (h == 0 || bl == h) ? true : false;

        if (!isEquilateral)
        {
            height = h;
        }
    }
    /***
     * Calculate the area of Triangle
     * @return (double) Area of Triangle
     */
    public double calculateArea()
    {
        if (isEquilateral)
        {
            return (Math.cbrt(3)/4)*baseLength;
        }
        else
        {
            return 0.5d*baseLength*height;
        }
    }
    /***
     * Show shape
     */
    public void display()
    {
        if(isEquilateral)
        {
            System.out.println("▲");
        }
        else
        {
            System.out.println("◮");
        }
    }
    /***
     * Display information about Triangle
     */
    public void  printDetails()
    {
        System.out.printf("\tBase of triangle is:\t%s\n", df.format(baseLength));
        if(!isEquilateral)
        {
            System.out.printf("\tHeight of triangle is:\t%s\n", df.format(height));
        }
    }
}
