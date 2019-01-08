package Field;

public class Field implements IField {
    private final int fieldSizeX;
    private final int fieldSizeY;
    private IWheat[][] wheatArray = null;

    public Field(int fieldSizeX, int fieldSizeY) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        wheatArray = new IWheat[fieldSizeX][fieldSizeY];
        for (int i = 0; i < fieldSizeX; i++) {
            IWheat[] yWheatArray = new IWheat[fieldSizeY];
            for (int j = 0; j < fieldSizeY; j++) {
                Wheat newWheat = new Wheat();
                yWheatArray[j] = newWheat;
            }
            wheatArray[i] = yWheatArray;
        }
    }

    @Override
    public int getFieldSizeX() {
        return fieldSizeX;
    }

    @Override
    public int getFieldSizeY() {
        return fieldSizeY;
    }

    @Override
    public IWheat[][] getWheatArray() {
        return wheatArray;
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
