/*
 * This is the business class from my whiteboard work in the breakout room (Lab 2.2)
 */
class Computer
{
    // ATTRIBUTES, PROPERTIES, aka FIELDS  or INSTANCE VARIABLES
    private String brand;
    private String gpuModel;
    private String cpuModel;
    private int numOfFans;
    private int fanSpeed = 1600;
    private int temperature;
    private boolean isOn;


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

    public void setCpuModel(String cpuModel)
    {
        switch (cpuModel)
        {
            case "i7-7700k":
            case "i9-10900k":
            case "Ryzen 7 3700x":
            case "Ryzen 5 3600x":
            case "i7-8700k":
                this.cpuModel = cpuModel;
                break;
            default:
                System.out.println(brand + " is an invalid brand.");
        }
    }

    public int getNumOfFans()
    {
        return numOfFans;
    }

    public void setNumOfFans(int numOfFans)
    {
        this.numOfFans = numOfFans;
    }

    public int getFanSpeed()
    {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed)
    {
        // Check if user passed fanSpeed is in intervals of 100
        if (fanSpeed%100 == 0)
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

    // BEHAVIORS, aka METHODS or FUNCTION
    public void boot()
    {
        if (isOn() == true)
        {
            System.out.println("Your " + getBrand() + " is already running :)");
        }
        else
        {
            setOn(true);
            setFanSpeed(fanSpeed);
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
    public void shutDown()
    {
        setOn(false);
        setFanSpeed(0);
        System.out.println("Your " + getBrand() + " is now off.");
    }
    public void shutDown(Boolean restart)
    {
        setOn(false);
        setFanSpeed(0);
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
        return "Computer{" + "brand='" + getBrand() + '\'' + ", gpuModel='"
                + getGpuModel() + '\'' + ", cpuModel='" + getCpuModel() + '\''
                + ", numOfFans=" + getNumOfFans() + ", fanSpeed=" + getFanSpeed()
                + ", temperature=" + getTemperature() + ", isOn=" + isOn() + '}';
    }
}