/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * Lab - Composition
 *
 * The Television class.  With constructors, properties, accessor, and business methods.
 * It now defines static members for MIN/MAX volume values
 * It checks incoming volume values for validity
 * It includes a DisplayType field to represent its display type
 *
 * It's now in a package, and enforces encapsulation
 *
 */

package com.entertainment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Television
{

    // CLASS OR STATIC VARIABLES - STORED IN THE SHARED AREA ASSOCIATED WITH A CLASS
    public static final int MIN_VOLUME = 0;   // no "magic numbers!"
    public static final int MAX_VOLUME = 100; // sprinkled liberally through the code
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    // FIELDS - AKA 'INSTANCE VARIABLES', 'ATTRIBUTES', 'PROPERTIES'
    private String brand = "Sony";
    private int volume = 1;
    private DisplayType display = DisplayType.LED;
    // TODO: Create variable for Tuner and instantiate one.
	private Tuner tuner = new Tuner();


    // CONSTRUCTORS
    // No-arg constructor.
    public Television()
    {
        // possible additional "setup" or initialization code here
        // want it to run for every instance created
    }

    // One-arg constructor for volume
    public Television(int volume) throws IllegalArgumentException
    {
        this(); // Invoke no-arg constructor
        setVolume(volume);
    }

    // One-arg constructor for brand
    public Television(String brand) throws InvalidBrandException
    {
        this();  // Invoke no-arg constructor
        setBrand(brand);
    }

    // 2-arg constructor
    public Television(String brand, int volume) throws InvalidBrandException, IllegalArgumentException
    {
        this();
        setBrand(brand);
        setVolume(volume);
    }

    // 3-arg constructor
    public Television(String brand, int volume, DisplayType display) throws InvalidBrandException, IllegalArgumentException
    {
        this(brand, volume);  // Explicit constructor call to reuse its implementation
        this.display = display;
    }


    // BUSINESS METHODS
    public void turnOn()
    {
        System.out.println("Turning on your TV with volume " + volume);
    }

    public void turnOff()
    {
        System.out.println("Shutting down your " + brand + " brand TV ...goodbye");
    }

    // TODO: Write methods to get and change the channel
	public void changeChannel(String channelIn)
	{
		tuner.setChannel(channelIn);
	}
	public String getCurrentChannel()
	{
		return tuner.getChannel();
	}

    // ACCESSOR METHODS (getters/setters)
    public int getVolume()
    {
        return volume;
    }

    /*
     * IllegalArgument is UNCHECKED.
     * Therefore, i do not "have" to "announce" this possibility in a 'throws' clause
     * in the method signature
     */
    public void setVolume(int volume) throws IllegalArgumentException
    {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
            throw new IllegalArgumentException("Invalid volume: " + volume + ". Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME + ".");
        }
    }

    public String getBrand()
    {
        return brand;
    }
    /*
     * InvalidBrandException is CHECKED.
     * Therefore i must *announce*
     */
    public void setBrand(String brand) throws InvalidBrandException
    {
        if (isValidBrand(brand)) {
            this.brand = brand; // brand is acceptable, so set the field
        } else {
            throw new InvalidBrandException("Invalid Brand:" + brand + ", Brand must be one of " + Arrays.toString(VALID_BRANDS));
        }
    }

    private boolean isValidBrand(String brand)
    {
        boolean isValid = false;

        for (String currentBrand : VALID_BRANDS) {
            if (currentBrand.equals(brand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public DisplayType getDisplay()
    {
        return display;
    }

    public void setDisplay(DisplayType display)
    {
        this.display = display;
    }


    // Replace default toString() method with our own.
    public String toString()
    {
        return "Television: brand=" + getBrand() + ", volume=" + getVolume() + ", display=" + getDisplay();
    }
}