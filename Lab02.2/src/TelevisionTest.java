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
        tv1.setVolume(99);

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

    }
}