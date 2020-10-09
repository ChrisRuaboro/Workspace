import java.sql.SQLOutput;

/*
 * This is the business class from my whiteboard work in the breakout room (Lab 2.2)
 */
class Computer
{
    // ATTRIBUTES, PROPERTIES, aka FIELDS  or INSTANCE VARIABLES
    String brand;
    String gpuModel;
    String cpuModel;
    int numOfFans;
    int fanSpeed;
    int temperature;

    // BEHAVIORS, aka METHODS or FUNCTION
    void boot()
    {
        System.out.println("Starting your " + brand + " computer");
    }

    void listSpecs()
    {
        System.out.println("Your " + brand + " computer specs are");
        System.out.println(cpuModel);
        System.out.println(gpuModel);
        System.out.println("with " + numOfFans + " fans running at " + fanSpeed + "rpms.");
    }
    void overheat()
    {
        temperature = 110;
        System.out.println("Your " + brand + " computer is overheating!" +
                "\n" + "current temperatures are " + temperature + " celsius" + "\n" +
                "Shutting down to prevent damage...");
        powerOff();
    }
    void powerOff()
    {
        fanSpeed = 0;
        System.out.println("Computer is now off.");
    }
}