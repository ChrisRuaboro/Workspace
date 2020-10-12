class CalculatorClient
{
    public static void main(String[] args)
    {
        // Calculator calc = new Calculator(); Don't need anymore due to making calculator methods static
        double sum = Calculator.add(5,9);
        System.out.println("The value of calc is " + sum);

        double difference = Calculator.subtract(2,3);
        System.out.println("The difference is " + difference);

        System.out.println("Your random number is " + Calculator.randomNumber());
        System.out.println("Your random number is " + Calculator.randomNumber(17,-5));
    }
}