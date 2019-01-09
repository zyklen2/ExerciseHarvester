package Harvester;

public class DrivingEssentialLights extends Light implements IDrivingEssentialLights {
    private boolean fogMode=false;
    public DrivingEssentialLights(boolean onOff,boolean fogMode) {
        this.onOff = onOff;
        this.fogMode = fogMode;
    }
    @Override
    public void setOnOff(boolean on, boolean fogMode){//Überschreiben von setOnOff der Oberklasse Light
        if(fogMode&&on) {
            onOff = on;
            this.fogMode = fogMode;
        }
        else{
            onOff = on;
            this.fogMode = false;
        }
    }
}
