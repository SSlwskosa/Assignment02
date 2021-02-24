package com.sstack.lkosa.assignments.Assignment02;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

/***
 * Simple console program to add numbers together and get total value
 * @author Lajos Kosa
 * Created on:  02/23/2021
 */
public class NumberAddition
{

    public static void main(String[] args)
    {
        // Initialize Scanner for user input
        Scanner scr = new Scanner(System.in);
        // Initialize Array list for (OPTIONAL) ArrayList - More feedback to User
        ArrayList<Double> numberList = new ArrayList<>();
        // Format decimal values to be easier to read,  ↓ 4 decimal precision
        DecimalFormat df = new DecimalFormat("0.####");

        // Ask user how many numbers they want to add - Alternatively, other methods can be used for this
        Integer amount = 0;
        do
        {
            System.out.println("How many numbers do you want to add?");
            // Alternative to Try/Catch. Code will not proceed until user entered valid data
            while   (!scr.hasNextInt())
            {
                System.out.println("Error. Please only enter whole numbers greater than 1");
                scr.next();
            }
            amount = scr.nextInt();
        } while (amount <= 1);

        // One way of showing SUM of numbers.

        Double numberTotal = 0d;
        for (int i = 0; i < amount; i++)
        {
            System.out.printf("Number %d: ", i+1);
            // Set temporary variable for user input
            Double value = scr.nextDouble();
            // Increase current number with user's last input
            numberTotal += value;
            // Add user's value to number pool
            numberList.add(value);
        }

        // OPTIONAL - Iterate through numbers to provide summary about their entered numbers
        for(int i = 0; i< numberList.size(); i++)
        {
            System.out.print(df.format(numberList.get(i)));
            if (i < numberList.size() - 1)
            {
                System.out.print(" + ");
            }
            else
            {
                // Insert new lone once all numbers were listed
                System.out.println();
            }
        }
        // Print end results
        System.out.printf("Total value of your entered values: %s\n", df.format(numberTotal));

        // Alternatively: ArrayList/ "numbersList" could be used to iterate through elements to achieve same result

        Double tempValue = 0d;

        for(Double number: numberList)
        {
            tempValue += number;
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("Sum of items in ArrayList: %s\n", df.format(tempValue));

    }
}
