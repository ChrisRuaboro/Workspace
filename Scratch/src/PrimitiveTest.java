class PrimitiveTest
{
    public static void main(String[] args)
    {
        int age = 53;
        System.out.println("The age is " + age);

        long population = 7000000000L;
        System.out.println("The population of earth is " + population);

        double pi = 3.14;
        System.out.println("The approximate value of pi is" + pi);

        boolean isMarried = true;
        System.out.println("The instructor is married " + isMarried);

        char size = 'M';
        System.out.println("The size of the t-shirt is " + size);

        String name = "Jay";
        System.out.println("The name of the instructor is " + name);
        System.out.println("The uppercase name of the instructor is " + name.toUpperCase());
        System.out.println("The uppercase name of the instructor is " + name.toLowerCase());

        String message = ("The default value of a field is \"zero\" for that type");
        System.out.println("sentence");

        int i = 1;
        int j = i;
        i = 2;
        System.out.println("The value of j is" + j);

    }
}