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
    private int fanSpeed;
    private int temperature;
    private boolean isOn;

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
        this.cpuModel = cpuModel;
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
        this.fanSpeed = fanSpeed;
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

    // CONSTRUCTORS

    //Default constructor that had to be placed because another one was created
    public Computer()
    {
    }

    public Computer(String brand, String gpuModel, String cpuModel, int numOfFans, int fanSpeed, int temperature, boolean isOn)
    {
        setBrand(brand);
        setGpuModel(gpuModel);
        setCpuModel(cpuModel);
        setNumOfFans(numOfFans);
        setFanSpeed(fanSpeed);
        setTemperature(temperature);
        setOn(isOn);
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
        powerOff();
    }
    public void powerOff()
    {
        setOn(false);
        setFanSpeed(0);
        System.out.println("Your " + getBrand() + " is now off.");
    }

    // toString() method

    @Override
    public String toString()
    {
        return "Computer{" + "brand='" + brand + '\'' + ", gpuModel='" + gpuModel + '\'' + ", cpuModel='" + cpuModel + '\'' + ", numOfFans=" + numOfFans + ", fanSpeed=" + fanSpeed + ", temperature=" + temperature + ", isOn=" + isOn + '}';
    }
}