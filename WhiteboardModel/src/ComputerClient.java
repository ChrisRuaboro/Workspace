/*
 * This is the main-class, we use it to test drive instances of Computer.
 */
class ComputerClient
{
    public static void main(String[] args)
    {
        Computer c1 = new Computer();
        c1.brand = "NZXT";
        c1.cpuModel = "i9-10900k";
        c1.gpuModel = "NVidia RTX 3090";
        c1.numOfFans = 4;
        c1.fanSpeed = 7200;
        c1.temperature = 80;

        c1.boot();
        c1.listSpecs();
        c1.overheat();
    }
}