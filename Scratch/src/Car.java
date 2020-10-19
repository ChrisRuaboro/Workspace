class Car extends Vehicle
{
    // this is what gets inserted into the .class file (by the compiler, to satisfy that rule)
    public Car(String vin)
    {
        super(vin); // call to Vehicle ctor ( and there is none)
    }
}
