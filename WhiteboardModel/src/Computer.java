import java.sql.SQLOutput;

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

    // BEHAVIORS, aka METHODS or FUNCTION
    void boot()
    {
        System.out.println("Starting your " + brand + " computer");
    }

    // Create toString() method
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
        isOn = false;
        fanSpeed = 0;
        System.out.println("Computer is now off.");
    }
}