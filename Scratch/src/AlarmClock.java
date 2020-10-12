/*
 * A business class that models an alarm clock.
 */
class AlarmClock
{
    // Class level "Shared" VARIABLES
    // these live in the class-level common storage area "above" all instances
    // and are shared by those instances
    // there is only ONE COPY of each of these. Up there in that common storage area
    public static final int MIN_INTERVAL = 1;  // Lower bound of snoozeInterval
    public static final int MAX_INTERVAL = 59; // Upper bound of snoozeInterval

    //ATTRIBUTES, PROPERTIES, TRAITS - aka FIELDS, INSTANCE VARIABLES
    private int snoozeInterval = 10;  // 10 is the default when the client doesn't specify
    private int repeatCount;

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
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) // "Positive Checking" "Inside bounds"
         //(snoozeInterval < 1 || snoozeInterval > 59) // "Negative checking" "Outside bounds"
        {
            snoozeInterval = this.snoozeInterval;
        }
        else
        {
            System.out.println("Invalid value: " + snoozeInterval + "." +
                    " The snooze interval should be between " + MIN_INTERVAL + " and " + MAX_INTERVAL);
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