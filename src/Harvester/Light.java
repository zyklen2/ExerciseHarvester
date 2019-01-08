package Harvester;

public class Light implements ILight {
    boolean onOff=false;

    public Light(){}
    public Light(boolean onOff) {
        this.onOff = onOff;
    }

    @Override
    public boolean isOnOff() {
        return onOff;
    }

    @Override
    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }
}
