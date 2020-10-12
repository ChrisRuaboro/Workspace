public class Calculator
{
    // This method returns an int which represents the sum of the two input arguments
    public static double add(double a, double b)
    {
        return a + b;
    }
    public static double subtract(double a,double b)
    {
        return a - b;
    }

    /*
     * This method returns a random integer between 1 and 22.
     * Hint: you can see the Math class for help.
     * Specifically, the random() method.
     * NOTE: this is a "static" method, so you can call it as follows:
     *  Math.random()
     *  You "do not" create instances of Math, e.g.,
     *  Math m = new Math();
     *  m.random();
     *  You *do not* do it this way. you simply call Math.random()
     */
    public static int randomNumber()
    {
        int max = 22;
        int min = 1;
        return (int)(Math.random() * (max - min + 1) + min);
    }
    public static int randomNumber(int max, int min)
    {
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
