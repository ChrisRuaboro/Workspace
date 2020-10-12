/*
 * This is a main-class that test drives AlarmClock instances.
 */
class AlarmClockClient
{
    // entry point or starting point to a program
    public static void main(String[] args)
    {
        //create an instance of AlarmClock and work with it
        AlarmClock clock1 = new AlarmClock(5);
        clock1.setSnoozeInterval(AlarmClock.MAX_INTERVAL);
        clock1.snooze();

        //Another instance of AlarmClock
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(7);
        clock2.snooze();

        // create another instance of AlarmClock, BUT don't give it a value
        AlarmClock clock3 = new AlarmClock();
        clock3.snooze();

        // exercise our new toString() method in AlarmClock
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());

        // toString automatically called when you println() an object reference
        System.out.println(clock3);

        // AlarmClock.MAX_INTERVAL = 40;  Cannot assign a value to final variable 'MAX_INTERVAL'

    }
}