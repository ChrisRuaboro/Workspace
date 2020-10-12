/*
 * Here, we do validation testing for snoozeInterval.
 */
public class AlarmClockValidationTest
    // create an instance of AlarmClock with a valid snoozeInterval
{
    public static void main(String[] args)
    {
        AlarmClock clock1 = new AlarmClock();

        // Test left of, on, and right of boundaries
        clock1.setSnoozeInterval(59);
        System.out.println(clock1); // toString() is automatically called

        clock1.setSnoozeInterval(1);
        System.out.println(clock1);

        // Create an invalid instance, i.e., incorrect snoozeInterval
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(0); // Should trigger error message
        clock2.setSnoozeInterval(60); // Should trigger error message

    }
}