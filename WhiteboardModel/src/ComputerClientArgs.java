class ComputerClientArgs
{
    public static void main(String[] args)
    {
        //System.out.println("You provided " + args.length + " arguments");
        int numArgs = args.length;
        //Check if numArgs is valid amount of args
        if (numArgs <1 && numArgs > 8)
        {
            System.out.println("Invalid amount of arguments");
            System.out.println();
            return;
        }

        Computer comp1 = new Computer();

        switch (numArgs) {
            case 8:
                comp1.setTempType(TemperatureType.valueOf(args[8]));
            case 7:
                comp1.setOn(Boolean.parseBoolean(args[7]));
            case 6:
                comp1.setTemperature(Integer.parseInt(args[6]));
            case 5:
                comp1.setFanSpeed(Integer.parseInt(args[5]));
            case 4:
                comp1.setNumOfFans(Integer.parseInt(args[4]));
            case 3:
                comp1.setCpuModel(args[3]);
            case 2:
                comp1.setGpuModel(args[2]);
            case 1:
                comp1.setBrand(args[1]);
                break;
        }
    }
}
