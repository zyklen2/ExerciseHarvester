import Field.Field;
import Field.IField;
import Harvester.Harvester;
import Harvester.IHarvester;

class Main {
    public static void main(String[] args){
        IField newField = new Field(100,100);
        IHarvester newHarvester = new Harvester(100,50,30,2);
        newHarvester.letDroneScanField(newField);
        System.out.println(newHarvester.getHeight());
    }
}
