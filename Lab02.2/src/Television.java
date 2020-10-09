import java.sql.SQLOutput;

/*
 A business class that models the workings of a television.
 */
class Television
{
    //FIELDS or INSTANCE VARIABLES ("attributes". "properties". "fields"
    private String brand;
    private int volume;


    // Business FUNCTIONS or METHODS
    void turnOn()
    {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    void turnOff()
    {
        System.out.println("Shutting down, deuces.");
    }

    // ACCESSOR METHODS - also known aas "getter/setter" methods

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    // toString() method
}