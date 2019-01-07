public class PositionSorter implements IPositionSorter {
    @Override
    public int compare(IPosition p1, IPosition p2){
        return p1.compareTo(p2);
    }
}
