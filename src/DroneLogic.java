import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DroneLogic implements IDroneLogic{

    public List<IWheat> sortField(Map<IPosition, IWheat> wheatMap) {
        return wheatMap.entrySet().stream()
                .sorted(new WheatPositionSorter()).map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public Map<IPosition, IWheat> getMapFromField(Field field){

    }
}
