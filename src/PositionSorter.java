import java.util.Map;

public class PositionSorter implements IPositionSorter {
    @Override
    public int compare(Map.Entry<IPosition, IWheat> p1, Map.Entry<IPosition, IWheat> p2){
        return p1.getKey().compareTo(p2.getKey());
    }
}
