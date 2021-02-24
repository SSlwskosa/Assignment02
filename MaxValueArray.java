package com.sstack.lkosa.assignments.Assignment02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MaxValueArray
{
    public static void main(String[] args)
    {
        final Integer arrayDepth = 5;
        final Integer arrayWidth = 5;
        ArrayList<Integer[][]> arrayLedger = new ArrayList<>();
        arrayLedger.add(getRandomValueArray(10,25));
        arrayLedger.add(getRandomValueArray(1, 50));
        arrayLedger.add(getRandomValueArray(1, 5));
        arrayLedger.add(getRandomValueArray(500,750));
        arrayLedger.add(getRandomValueArray(100,999));
        arrayLedger.add(getRandomValueArray(100,999));


        Integer[][] importantNumbers =
                {
                        {1,6,3,5,9},
                        {1,4,9,3,4},
                        {2,1,4,1,2}
                };

        Integer[][] randomArray = getRandomValueArray(1000,9999);


        findMaxValues(importantNumbers,"importantNumbers");

        findMaxValues(randomArray, "randomArray");

        for(int i=0; i< arrayLedger.size(); i++)
        {
            findMaxValues(arrayLedger.get(i),String.format("Array%d",i));
        }
    }

    private static Integer[][] getRandomValueArray(int min, int max)
    {
        return new Integer[][] {
                {getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max)},
                {getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max)},
                {getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max)},
                {getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max)},
                {getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max),getRandomNumber(min,max)}
        };
    }

    private static int getRandomNumber(int min, int max)
    {
        Random rnd = new Random();
        return rnd.nextInt(max + 1 - min) + min;
    }

    private static void findMaxValues(Integer[][] array, String arrayName)
    {
        Integer maxValue  = Integer.MIN_VALUE;
        Integer locationX = 0;
        Integer locationY = 0;
        Integer temp = 0;

        for(int x = 0; x < array.length; x++)
        {
            for(int y = 0; y < array[x].length; y++)
            {
//                System.out.printf("%d ",array[x][y]);
                if (array[x][y] > maxValue)
                {
                    maxValue = array[x][y];
                    locationX = x;
                    locationY = y;
//                    System.out.printf("==== UPDATE %d ====\n", ++temp);
//                    System.out.printf("Value: %d\n",maxValue);
//                    System.out.printf("Location:\n\t%s[%d][%d]\n\n",arrayName, locationX, locationY);
                }
            }
        }
        System.out.println("============ RESULTS ============");
        System.out.printf("\tLargest number in array: %d\n", maxValue);
        System.out.printf("\tFirst instance found at location:" +
                              "\n\t\t%s[%d][%d]\n\n",arrayName, locationX, locationY);
        listArrayElements(array,locationX,locationY);
    }

    private static void listArrayElements(Integer[][] array, int highlightX, int highlightY)
    {
        for(int x = 0; x < array.length; x++)
        {
            System.out.printf("array[%d] -> ",x);
            for(int y = 0; y < array[x].length; y++)
            {
                if (x == highlightX && y == highlightY)
                {
                    System.out.printf("[\033[1;93m%d\033[0m]",array[x][y]);
                }
                else
                {
                    System.out.printf("[%d]",array[x][y]);
                }
                if (y < array[x].length - 1)
                {
                    System.out.print("-");
                }
                else
                {
                    // Insert new lone once all numbers were listed
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
