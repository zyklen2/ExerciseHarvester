import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Field {
    private Set<Wheat> wheatSet = new HashSet<>();

    public Field(int FieldSizeX,int FieldSizeY){
        for(int i=0;i<FieldSizeX;i++){
            for(int j=0;j<FieldSizeY;j++){
                Wheat newWheat = new Wheat(i,j);
                wheatSet.add(newWheat);
            }
        }
    }

    public Set<Wheat> getWheatSet() {
        return wheatSet;
    }

    public void setWheatSet(Set<Wheat> wheatSet) {
        this.wheatSet = wheatSet;
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
