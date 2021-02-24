package com.sstack.lkosa.assignments.Assignment02;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class WhiteBoard
{
    // Format decimal values to be easier to read,  ↓ 4 decimal precision
    static DecimalFormat df = new DecimalFormat("0.####");
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(getRandomNumber(1,10),0));
        shapes.add(new Triangle (getRandomNumber(3,6),getRandomNumber(5,10)));
        shapes.add(new Rectangle(getRandomNumber(115,999)/100,0));
        shapes.add(new Rectangle(getRandomNumber(2,5),getRandomNumber(4,16)));
        shapes.add(new Circle(getRandomNumber(6,20)));

        for(Shape shape: shapes)
        {
            listShapeDetails(shape);
        }
    }

    public static void listShapeDetails(Shape sh)
    {

        System.out.printf("=== Creating %s ===\n", sh.getClass().getSimpleName());
        sh.display();
        sh.printDetails();
        System.out.printf("\tArea of the %s:\t%s\n\n", sh.getClass().getSimpleName(), df.format(sh.calculateArea()) );
    }

    private static int getRandomNumber(int min, int max)
    {
        Random rnd = new Random();
        return rnd.nextInt(max + 1 - min) + min;
    }
}
