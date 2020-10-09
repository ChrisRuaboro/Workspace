/*
 * A business class that models an alarm clock.
 */
class AlarmClock
{
    //ATTRIBUTES, PROPERTIES, TRAITS - aka FIELDS, INSTANCE VARIABLES
    private int snoozeInterval = 10;

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
        this.snoozeInterval = snoozeInterval;
    }

    @Override
    public String toString()
    {
        return "AlarmClock{" + "snoozeInterval=" + snoozeInterval + '}';
    }
}