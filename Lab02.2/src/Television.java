import java.sql.SQLOutput;

/*
 A business class that models the workings of a television.
 */
class Television
{
    //FIELDS or INSTANCE VARIABLES ("attributes". "properties". "fields"
    String brand;
    int volume;


    // Business FUNCTIONS or METHODS
    void turnOn()
    {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    void turnOff()
    {
        System.out.println("Shutting down, deuces.");
    }
}