/*
 * A business class that models an alarm clock.
 */
class AlarmClock
{
    //ATTRIBUTES, PROPERTIES, TRAITS - aka FIELDS, INSTANCE VARIABLES
    private int snoozeInterval = 10;
    private int repeatCount;

    // CONSTRUCTORS - special methods that get called when client-side code says "new"

    //Default constructor that had to be placed because another one was created
    public AlarmClock()
    {

    }
    public AlarmClock(int snoozeInterval)
    {
        setSnoozeInterval(snoozeInterval); // delegate to setter for any possible validation, etc.
    }

    public AlarmClock(int snoozeInterval, int repeatCount)
    {
        this(snoozeInterval);             // delegate to the neighboring ctor above me for snooze
        setRepeatCount(repeatCount);
    }

    //BEHAVIORS, FUNCTIONS, or METHODS
    public void snooze()
    {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");

    }
    //Accessor methods - these provide "controlled" access to the internal fields
    //aka "getter/setter" methods common in OOP
    public int getSnoozeInterval()
    {
        return snoozeInterval;
    }
    // TODO: add validation code to enforce range of values 1-59
    public void setSnoozeInterval(int snoozeInterval)
    {
        if (snoozeInterval < 0 || snoozeInterval > 59)
        {
            snoozeInterval = this.snoozeInterval;
        }
        else
        {
            this.snoozeInterval = snoozeInterval;
        }
    }

    public int getRepeatCount()
    {
        return repeatCount;
    }

    public void setRepeatCount(int repeatCount)
    {
        this.repeatCount = repeatCount;
    }

    @Override
    public String toString()
    {
        return "AlarmClock{" + "snoozeInterval=" + snoozeInterval + '}';
    }
}