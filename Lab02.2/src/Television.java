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
    public static int DEFAULT_VOLUME = 50;

    //FIELDS or INSTANCE VARIABLES ("attributes". "properties". "fields"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;




    // Business FUNCTIONS or METHODS
    public void turnOn()
    {
        System.out.println("Turning on your " + brand + " television to volume " + volume);
    }

    public void turnOff()
    {
        System.out.println("Shutting down, deuces.");
    }
    public void mute()
    {
        if (!this.isMuted())
        {
            DEFAULT_VOLUME = volume;
            oldVolume = volume;
            setVolume(MIN_VOLUME);
            System.out.println("Television muted");
            isMuted = true;
        }
        else
        {
            unmute();
        }
    }
    public void unmute()
    {
        setVolume(oldVolume);
        System.out.println("Television unmuted.");
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
        this(brand); //delegate to the constructor above me for brand
        setVolume(volume); // delegate to the setter for any validation/conversion
    }
    public Television(String brand, int volume, DisplayType display)
    {
        this(brand, volume);
        setDisplay(display);
    }


    // ACCESSOR METHODS - also known aas "getter/setter" methods


    public DisplayType getDisplay()
    {
        return display;
    }

    public void setDisplay(DisplayType display)
    {
        this.display = display;
    }

    public String getBrand()
    {
        return brand;
    }

    public boolean isMuted()
    {
        return isMuted;
    }

    public void setMuted(boolean muted)
    {
        isMuted = muted;
    }

    // Validate the incoming values so that only certain brands are accepted.
    public void setBrand(String brand)
    {
        switch (brand)
        {
            case "Samsung":
            case "Vizio":
            case "LG":
            case "Toshiba":
            case "Sony":
                this.brand = brand;
                break;
            default:
                System.out.println(brand + " is an invalid brand.");
        }
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
            System.out.println("Volume has been set to " + this.volume);
        }
        else
        {
            System.out.println("Volume " + volume + " is out of range."
                    + " Must be between " + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME);
        }
    }

    // Static getter and setter

    public static int getDefaultVolume()
    {
        return DEFAULT_VOLUME;
    }

    public static void setDefaultVolume(int defaultVolume)
    {
        DEFAULT_VOLUME = defaultVolume;
    }


    // toString() method

    @Override
    public String toString()
    {
        return "Television{" + "brand='" + getBrand()
                + '\'' + ", volume=" + getVolume() + ", default volume="
                + DEFAULT_VOLUME +  ", display type=" + getDisplay() + "}";
    }
}