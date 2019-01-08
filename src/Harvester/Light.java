package Harvester;

public class Light implements ILight {
    private boolean onOff=false;

    //Overloading
    public Light(boolean isOn){
        onOff = isOn;
    }

    public Light(){

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
