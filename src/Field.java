import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Field {
    private Map<Integer, Wheat> hashMap = new HashMap<>();

    public Field(int FieldSizeX,int FieldSizeY){
        for(int i=0;i<FieldSizeX;i++){
            for(int j=0;j<FieldSizeY;j++){

            }
        }
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
