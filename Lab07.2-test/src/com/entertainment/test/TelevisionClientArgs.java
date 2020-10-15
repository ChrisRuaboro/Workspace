package com.entertainment.test;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * This main-class accepts arguments from the user for brand, volume, and display/
 * It then creates an instance of television from those inputs
 */
class TelevisionClientArgs
{
    public static void main(String[] args)
    {
        //System.out.println("You provided " + args.length + " arguments");
        int numArgs = args.length;
        if (numArgs != 3)
        {
            //Print usage banner and the exit.
            System.out.println("Usage : java com.entertainment.test.TelevisionClientArgs <brand> <volume> <display>");
            System.exit(0);  // or just return
        }
        else
        {
            // Instantiates a new object of television
            Television tv1 = new Television();
            //Sets first argument to brand of the object
            tv1.setBrand(args[0]);
            //Converts second argument to integer and sets tv1 volume to parsed int value
            tv1.setVolume(Integer.parseInt(args[1]));
            System.out.println(tv1);
            //Checks to see if arg[2] equals anything in com.entertainment.DisplayType enum.
            boolean valid = false;
            for (DisplayType x : DisplayType.values())
            {
                //If match is found then set com.entertainment.DisplayType to args[2]
                if (x.equals(DisplayType.valueOf(args[2]))) {
                    tv1.setDisplay(DisplayType.valueOf(args[2]));
                    System.out.println("Display type set!");
                    break;
                }
            }
            if (!valid)
            {
                System.out.println("not a valid com.entertainment.DisplayType");
            }

            System.out.println(tv1);
        }
        // at this point proceed. Knowing you have 3 arguments
    }
}