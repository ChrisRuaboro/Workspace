/*
 * This is the main-class, we use it to test drive instances of Computer.
 */
class ComputerClient
{
    public static void main(String[] args)
    {
        Computer c1 = new Computer();
        c1.setBrand("NZXT");
        c1.setCpuModel("i9-10900k");
        c1.setGpuModel("NVidia RTX 3090");
        c1.setNumOfFans(4);
        c1.setFanSpeed(7200);
        c1.setTemperature(80);

        c1.boot();
        c1.listSpecs();
        c1.overheat();

        System.out.println(c1.toString()); // toString() automatically called

        Computer c2 = new Computer("MSI", "NVidia RTX 3090", "Ryzen 7 3900x", 6, 7200, 65, true);
        System.out.println(c2.toString());
    }
}