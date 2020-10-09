class CalculatorClient
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
//        int sum = calc.add(5,9);
//        System.out.println("The value of calc is " + sum);
//
//        int difference = calc.subtract(2,3);
//        System.out.println("The difference is " + difference);

        System.out.println("Your random number is " + calc.randomNumber());
        System.out.println("Your random number is " + calc.randomNumber(2147483647,-247483647));
    }
}