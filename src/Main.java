import Field.Field;
import Harvester.Harvester;

public class Main {
    public static void main(String[] args){
        Field newField = new Field(100000,100000);
        Harvester newHarvester = new Harvester(100,50,30,2);
        newHarvester.letDroneScanField(newField);
        System.out.println(newHarvester.getHeight());
    }
}
