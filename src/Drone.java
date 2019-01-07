public class Drone implements IDrone{
    int posX=0;
    int posY=0;
    float batteryPercentage=0;
    boolean fieldScanned=false;
    int wheatToScan=0;
    int scannedWheat=0;

    public Drone(float batteryPercentage){
        this.batteryPercentage=batteryPercentage;
    }

    public scanField(Field fieldToScan){

    }

}
