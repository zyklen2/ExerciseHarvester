package Harvester;

public class GrindSystem implements IGrindSystem {
    private float length = 0;
    private float width = 0;
    private float height = 0;
    private int numberOfGrindGears = 0;
    private boolean isOn = false;

    public GrindSystem(){
        length = 10;
        width = 2;
        height = 2;
        numberOfGrindGears = 100;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn(boolean on) {
        isOn = on;
    }
}
