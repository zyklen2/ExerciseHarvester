package Field;

import java.util.HashSet;
import java.util.Set;

public class Field implements IField{
    private Set<Set<IWheat>> wheatSet = null;

    public Field(int FieldSizeX,int FieldSizeY){
        wheatSet = new HashSet<>();
        for(int i=0;i<FieldSizeX;i++){
            Set<IWheat> yWheatSet = new HashSet<>();
            for(int j=0;j<FieldSizeY;j++){
                Wheat newWheat = new Wheat();
                yWheatSet.add(newWheat);
            }
            wheatSet.add(yWheatSet);
        }
    }

    public Set<Set<IWheat>> getWheatSet() {
        return wheatSet;
    }

    /*public static void main(String... args) {
            Application application = new Application();
            application.init();
            application.filterByKey();
            application.filterByValue();
            application.filterByKeyAndValue();
        }
    public void filterByKey() {
        System.out.println("--- filterByKey ---");

        Map<Integer, String> result = hashMap.entrySet()
                .stream()
                .filter(map -> map.getKey() <= 22)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("result : " + result);
        System.out.println();
    }

    public void filterByValue() {
        System.out.println("--- filterByValue ---");

        Map<Integer, String> result = hashMap.entrySet()
                .stream()
                .filter(map -> "Orange".equals(map.getValue()))
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("result : " + result);
        System.out.println();
    }

    public void filterByKeyAndValue() {
        System.out.println("--- filterByKeyAndValue ---");

        Map<Integer, String> result = hashMap.entrySet()
                .stream()
                .filter(p -> p.getKey() <= 22)                                           // filter by key
                .filter(map -> map.getValue().startsWith("A"))                           // filter by value
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("result : " + result);
    }*/
}