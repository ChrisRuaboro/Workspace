package com.entertainment.test;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

public class TelevisionValidationTest
{
    public static void main(String[] args)
    {
        // instantiate a Television with a good volume => no exception thrown
        Television tv1 = new Television();
        tv1.setVolume(32);
        System.out.println(tv1);
        // instantiate a Television object with a bad volume => exception thrown
        try
        {
            Television tv2 = new Television("Samsung", 1, DisplayType.PLASMA);
            // tv2.setVolume(-1);
            tv2.setBrand("Samsung");
            System.out.println(tv2);
        }
        catch (InvalidBrandException e)
        {
            System.out.println(e);
        }

        try
        {
            Television tv3 = new Television();
            tv3.setVolume(69);
            System.out.println(tv3);
        }
        catch (IllegalArgumentException e)
        {
            //handle any exception thrown back at me, the client caller
            System.out.println("There was something wrong with your input :(");
        }
    }
}
