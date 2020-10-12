import java.sql.SQLOutput;

/*
 A business class that models the workings of a television.
 */
class Television
{
    // Class level "Shared" VARIABLES
    // these live in the class-level common storage area "above" all instances
    // and are shared by those instances
    // there is only ONE COPY of each of these. Up there in that common storage area

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final int DEFAULT_VOLUME = 50;

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
        if (volume >= Television.MIN_VOLUME && volume <= Television.MAX_VOLUME)
        {
            this.volume = volume;
        }
        else
        {
            System.out.println("Volume " + volume + " is out of range."
                    + " Must be between " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME);
        }
    }

    // toString() method

    @Override
    public String toString()
    {
        return "Television{" + "brand='" + getBrand() + '\'' + ", volume=" + getVolume() + '}';
    }
}