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
    }
}