package com.electronic;

/**
 * JR: This is good work, but a few improvements could be made.
 * There are several good (and correct) elements here, but also some pretty obvious bugs
 * (one of which IntelliJ was clearly pointing out...).  See comments below, and in the other classes.
 *
 * There is some good creativity on your part, and many things are working correctly.
 * Perhaps a bit more attention to detail would have helped?
 *
 * Notes:
 *  - Incorrect package structure -> the Client and ClientArgs classes should be in package
 *    com.electronic.client.
 *  - The static variables for the constraint boundaries should also be marked 'final', i.e.,
 *    DEFAULT_FANSPEED and MIN_FANSPEED.
 */

/*
 * This is the business class from my whiteboard work in the breakout room (Lab 2.2)
 */
public class Computer
{
    // Class level "Shared" VARIABLES
    // these live in the class-level common storage area "above" all instances
    // and are shared by those instances
    // there is only ONE COPY of each of these. Up there in that common storage area
    public static int DEFAULT_FANSPEED = 1600;
    public static int MIN_FANSPEED = 0;
    // TODO

    // ATTRIBUTES, PROPERTIES, aka FIELDS  or INSTANCE VARIABLES
    private String brand;
    private String gpuModel;
    private String cpuModel;
    private int numOfFans;
    private int fanSpeed;
    private int temperature;
    private boolean isOn;
    private TemperatureType tempType;


    // CONSTRUCTORS - special methods that get called when client-side code says "new"

    //Default constructor that had to be placed because another one was created. side note - C# keeps it
    public Computer()
    {
    }

    public Computer(String brand)
    {
        setBrand(brand);
    }

    public Computer(String brand, String gpuModel)
    {
        this(brand);
        setGpuModel(gpuModel);
    }

    public Computer(String brand, String gpuModel, String cpuModel)
    {
        this(brand, gpuModel);
        setCpuModel(cpuModel);
    }

    public Computer(String brand, String gpuModel, String cpuModel, int numOfFans)
    {
        this(brand, gpuModel, cpuModel);
        setNumOfFans(numOfFans);
    }

    public Computer(String brand, String gpuModel, String cpuModel, int numOfFans, int fanSpeed)
    {
        this(brand, gpuModel, cpuModel, numOfFans);
        setFanSpeed(fanSpeed);
    }

    public Computer(String brand, String gpuModel, String cpuModel, int numOfFans, int fanSpeed, int temperature)
    {
        this(brand, gpuModel, cpuModel, numOfFans, fanSpeed);
        setTemperature(temperature);
    }

    public Computer(String brand, String gpuModel, String cpuModel, int numOfFans, int fanSpeed, int temperature, boolean isOn)
    {
        this(brand, gpuModel, cpuModel, numOfFans, fanSpeed, temperature);
        setOn(isOn);
    }
    public Computer(String brand, String gpuModel, String cpuModel, int numOfFans, int fanSpeed, int temperature, boolean isOn, TemperatureType tempType)
    {
        this(brand, gpuModel, cpuModel, numOfFans, fanSpeed, temperature, isOn);
        setTempType(tempType);
    }


    // Getter/Setters for Fields in this Class


    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getGpuModel()
    {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel)
    {
        this.gpuModel = gpuModel;
    }

    public String getCpuModel()
    {
        return cpuModel;
    }

    /*
     * JR: you are using the Java 14 new 'switch' syntax here.  Be aware that Amazon appears
     * to be running mostly Java 8 and some 11 (based on our student survey last week).
     *
     * Also, you could use another enum here for cpuModel instead of hard-coded strings.
     * (No magic numbers, or magic strings.)
     */
    public void setCpuModel(String cpuModel)
    {
        switch (cpuModel) {
            case "i7-7700k", "i9-10900k", "Ryzen 7 3700x", "Ryzen 5 3600x", "i7-8700k" -> this.cpuModel = cpuModel;
            // JR: incorrect error message, should be "is an invalid cpuModel"
            default -> System.out.println(brand + " is an invalid brand.");
        }
    }

    public int getNumOfFans()
    {
        return numOfFans;
    }

    public void setNumOfFans(int numOfFans)
    {
        if (numOfFans >= 0)
        {
            this.numOfFans = numOfFans;
        }
        else
        {
            System.out.println("Cannot have a negative amount of fans.");
        }
    }

    public int getFanSpeed()
    {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed)
    {
        // Check if user passed fanSpeed is in intervals of 100
        if (fanSpeed >= MIN_FANSPEED && fanSpeed%100 == 0)
        {
            this.fanSpeed = fanSpeed;
        }
        else
        {
            System.out.println("Fan speed must be in intervals of 100.");
        }
    }

    public int getTemperature()
    {
        return temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }

    public TemperatureType getTempType()
    {
        return tempType;
    }

    /**
     * JR: you don't need to validate TemperatureType (an enum).
     * There are only three possible values the client can pass in here:
     *  TemperatureType.CELSIUS, Temperature.FAHRENHEIT, and Temperature.KELVIN.
     */
    public void setTempType(TemperatureType tempType)
    {
        boolean isValid = isValidTemperatureType(tempType);
        if (isValid = true)
        {
            this.tempType = tempType;
            return;
        }
        System.out.println("Not a valid tempType");
    }

    // BEHAVIORS, aka METHODS or FUNCTION
    /**
     * JR: you don't need to validate TemperatureType (an enum).
     * There are only three possible values the client can pass in here:
     *  TemperatureType.CELSIUS, Temperature.FAHRENHEIT, and Temperature.KELVIN.
     */
    public boolean isValidTemperatureType(TemperatureType tempType)
    {
        boolean isValid = false;
        for (TemperatureType x : TemperatureType.values()) // Interates through com.electronic.TemperatureType
        {
            if(x.equals(tempType)) // checks to see if match
            {
                isValid = true; // Match found!
                return isValid; // Return is valid  JR: you can just 'break' here
            }
        }
        return isValid;  // JR: duplicate 'return' statements (see comment directly above)
    }
    public void boot()
    {
        if (isOn())
        {
            System.out.println("Your " + getBrand() + " is already running :)");
        }
        else
        {
            setOn(true);
            setFanSpeed(DEFAULT_FANSPEED);
            System.out.println("Starting your " + getBrand() + " computer");
        }
    }

    // Create toString() method
    public void listSpecs()
    {
        System.out.println("Your " + getBrand() + " computer specs are");
        System.out.println(getCpuModel());
        System.out.println(getGpuModel());
        System.out.println("with " + getNumOfFans() + " fans running at " + getFanSpeed() + "rpm.");
    }
    public void overheat()
    {
        setTemperature(110);
        System.out.println("Your " + getBrand() + " computer is overheating!" +
                "\n" + "current temperatures are " + getTemperature() + " celsius" + "\n" +
                "Shutting down to prevent damage...");
        shutDown();
    }

    /*
     * JR: LOTS of redundancy between your two shutDown() methods.
     * Better = the shutdown() method should call shutdown(false).
     */
    /*public void shutDown()
    {
        DEFAULT_FANSPEED = fanSpeed;
        setFanSpeed(0);
        setOn(false);
        System.out.println("Your " + getBrand() + " is now off.");
    }*/
    public void shutDown()
    {
        shutDown(false);
    }
    public void shutDown(Boolean restart)
    {
        DEFAULT_FANSPEED = fanSpeed;
        setFanSpeed(0);
        setOn(false);
        System.out.println("Your " + getBrand() + " is now off.");
        if (restart)
        {
            boot();
        }
    }

    // toString() method

    @Override
    public String toString()
    {
        return "com.electronic.Computer{" + "brand='" + getBrand() + '\'' + ", gpuModel='"
                + getGpuModel() + '\'' + ", cpuModel='" + getCpuModel() + '\''
                + ", numOfFans=" + getNumOfFans() + ", fanSpeed=" + getFanSpeed()
                + ", temperature=" + getTemperature() + ", tempType=" + getTempType() +  '\''
                + ", isOn" + isOn() + '}';
    }
}