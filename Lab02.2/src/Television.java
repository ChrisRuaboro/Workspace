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
    public void turnOn()
    {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    public void turnOff()
    {
        System.out.println("Shutting down, deuces.");
    }

    // CONSTRUCTORS = special client code when the client says new
    public Television()
    {

    }
    public Television(String brand)
    {
        setBrand(brand);
    }
    public Television(String brand, int volume)
    {
        this(brand);
        setVolume(volume);
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

    @Override
    public String toString()
    {
        return "Television{" + "brand='" + getBrand() + '\'' + ", volume=" + getBrand() + '}';
    }
}