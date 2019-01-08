import Field.IField;
import Harvester.IHarvester;
import Field.Field;
import Field.IWheat;
import Harvester.Harvester;
import Drone.Drone;

public class Main {
    public static void main(String[] args){
        long now = System.nanoTime();
        IField newField = new Field(5000,5000);
        System.out.println("Fieldgen: " + (System.nanoTime() - now)/100000);
        Drone newDrone = new Drone(100);
        IHarvester newHarvester = new Harvester(100,50,30,2,newDrone);

        now = System.nanoTime();
        newHarvester.letDroneScanField(newField);
        System.out.println("Scan and order: " + (System.nanoTime() - now)/100000);

        now = System.nanoTime();
        IWheat found = newHarvester.findWheatByPosition(50,99);
        System.out.println("Finding: " + (System.nanoTime() - now)/100000);

        System.out.println(newHarvester.getFieldData().toString());
        System.out.println(found);
    }
}
