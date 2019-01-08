import Field.IField;
import Harvester.IHarvester;
import Field.Field;
import Harvester.Harvester;
import Drone.Drone;

public class Main {
    public static void main(String[] args){
        IField newField = new Field(100,100);
        Drone newDrone = new Drone(100);
        IHarvester newHarvester = new Harvester(100,50,30,2,newDrone);
        newHarvester.letDroneScanField(newField);
        System.out.println(newHarvester.getHeight());
    }
}
