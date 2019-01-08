package Harvester;

public class Engine implements IEngine{
    private int horsePower=0;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
