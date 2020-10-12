/*
 * A business class that models an alarm clock.
 */
class AlarmClock
{
    //ATTRIBUTES, PROPERTIES, TRAITS - aka FIELDS, INSTANCE VARIABLES
    private int snoozeInterval = 10;  // 10 is the default when the client doesn't specify
    private int repeatCount;
    private int minInterval = 1;
    private int maxInterval = 59;

    // CONSTRUCTORS - special methods that get called when client-side code says "new"

    //Default constructor that had to be placed because another one was created
    public AlarmClock()
    {
        //no-op
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
        if (snoozeInterval >= minInterval && snoozeInterval <= maxInterval) // "Positive Checking" "Inside bounds"
         //(snoozeInterval < 1 || snoozeInterval > 59) // "Negative checking" "Outside bounds"
        {
            snoozeInterval = this.snoozeInterval;
        }
        else
        {
            System.out.println("Invalid value: " + snoozeInterval + "." +
                    " The snooze interval should be between " + minInterval + " and " + maxInterval);
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