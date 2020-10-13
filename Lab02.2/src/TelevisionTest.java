/*
    This is client-side code that test drives instances of television.
 */
class TelevisionTest
{
    public static void main(String[] args)
    {
        //Create and instance of Television, set it properties/fields, and invoke its functions/methods
        Television tv1 = new Television();
        tv1.setBrand("Vizio");
        tv1.setVolume(62);

        //call turnOn() and turnOff()
        tv1.turnOn();
        tv1.turnOff();

        //create another instance of Television, but DO NOT set its properties, then call its functions
        Television tv2 = new Television();
        tv2.turnOn();
        tv2.turnOff();

        // Call setter on tv2
        tv2.setVolume(69);
        tv2.setBrand("Samsung");

        // Call toString() method implemented in Television business class
        System.out.println(tv1);
        System.out.println(tv2);

        // Create new Television using new ctors

        Television tv3 = new Television("TCL");
        Television tv4 = new Television("Emerson", 43);

        System.out.println(tv3);
        System.out.println(tv4);

        tv3.setVolume(Television.MAX_VOLUME); // CRANK IT UP
        tv4.setVolume(Television.MIN_VOLUME); // turn it down
        tv1.setVolume(Television.DEFAULT_VOLUME); // Set default

        Television tv5 = new Television();
        tv5.DEFAULT_VOLUME = 10;
        System.out.println(tv5);

        // Do some brand validation
        tv1.setBrand("Vizio");
        System.out.println(tv1);
        tv1.setBrand("Random tv");

        tv1.mute();
        System.out.println(tv1);
        tv1.mute();
        System.out.println(tv1);


    }
}