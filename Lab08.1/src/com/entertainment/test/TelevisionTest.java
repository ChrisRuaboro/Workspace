/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * Lab - Composition
 *
 * This class is the main class, i.e., where the application starts.
 *
 * It instantiates a Television and uses the new channel functionality.
 */

package com.entertainment.test;

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;


class TelevisionTest
{

    public static void main(String[] args)
    {
        Television tv = null;
        try
        {
            tv = new Television("Samsung", 65, DisplayType.LED);
            System.out.println(tv);
        }
        catch (InvalidBrandException e)
        {
            System.out.println(e);
        }

        // TODO: Change the channel
        tv.changeChannel("ESPN");
        System.out.println(tv.getCurrentChannel());
        System.out.println(tv);
    }
}