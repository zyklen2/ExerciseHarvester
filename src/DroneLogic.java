import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DroneLogic {

    public List<Wheat> sortField(Map<IPosition, IWheat> wheatMap) {
        return wheatMap.entrySet().stream().
                .thenComparing(wheat -> wheat.GetPosX() + wheat.GetPosY()))
                .collect(Collectors.toList());
    }

    public Map<IPosition, Wheat> get(){

    }
}