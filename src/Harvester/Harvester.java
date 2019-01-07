package Harvester;

import Core.IData;
import Core.IPosition;
import Field.Field;
import Field.IWheat;

import java.util.List;
import java.util.Map;

public class Harvester implements IHarvester {
    private float length= 0;
    private float height= 0;
    private float width= 0;
    private float weight = 0;
    private IData fieldData;
    private IEngine theEngine = new Engine(5000);
    private IWheel[] wheels = new Wheel[4];
    private ILight[] lights = new Light[6];
    private IGrindSystem theGrindSystem = new GrindSystem();
    private int posX=0;
    private int posY=0;
    FieldManagementComputer theManagementComputer;

    public Harvester(float length, float height, float width, float weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
        for(int i=0;i<4;i++){
            Wheel newWheel = new Wheel(5,50,true, 500);
            wheels[i]=newWheel;
        }
        for(int i=0;i<4;i++){
            Light newLight = new Light(false);
            lights[i]=newLight;
        }

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
    public int getHorsePower(){
        return theEngine.getHorsePower();
    }

    @Override
    public void letDroneScanField(Field field){
        fieldData= theManagementComputer.ScanFieldAndAnalyse(field);
    }

    @Override
    public List<IWheat> getSortedField(){
        return fieldData.getSortedWheatList();
    }

    @Override
    public Map<IPosition, IWheat> getFieldMap(){
        return fieldData.getFieldMap();
    }

    @Override
    public float getLength() {
        return length;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public IData getFieldData() {
        return fieldData;
    }

    public boolean LightIsOn(int lightNumber){
        if(lightNumber<=lights.length) {
            return lights[lightNumber].isOnOff();
        }
        else{
            return false;
        }
    }

    @Override
    public void turnLightsOnOff(boolean on){
        for(int i=0;i<6;i++){
            lights[i].setOnOff(on);
        }
    }

    @Override
    public void GrindSystemIsOn(){
        theGrindSystem.isOn();
    }

    @Override
    public void turnGrindSystemOnOff(boolean on){
        theGrindSystem.setOn(on);
    }
}
