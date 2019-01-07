package Drone;

import Core.IPosition;
import Field.IField;
import Field.IWheat;

import java.util.Map;

public class Drone implements IDrone {
    int posX=0;
    int posY=0;
    float batteryPercentage=0;
    DroneLogic theDroneLogic = new DroneLogic();

    public Drone(float batteryPercentage){
        this.batteryPercentage=batteryPercentage;
    }

    @Override
    public Map<IPosition, IWheat> scanField(IField fieldToScan){
        return theDroneLogic.scanField(fieldToScan);
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public float getBatteryPercentage() {
        return batteryPercentage;
    }

    @Override
    public void setBatteryPercentage(float batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
}
