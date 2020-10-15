package com.entertainment.test;

import com.entertainment.Television;

public class TelevisionValidationTest
{
    public static void main(String[] args)
    {
        Television tv1 = new Television("Vizio");
        tv1.setVolume(Television.MIN_VOLUME);
        System.out.println(tv1);
        tv1.setVolume(Television.MAX_VOLUME);
        System.out.println(tv1);
        tv1.setVolume(101);
        System.out.println(tv1);
        tv1.setVolume(-1);
        System.out.println(tv1);
    }
}
