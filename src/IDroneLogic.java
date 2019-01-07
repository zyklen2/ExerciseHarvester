import java.util.List;
import java.util.Map;

public interface IDroneLogic {
    List<IWheat> sortField(Map<IPosition, IWheat> wheatMap);
    Map<IPosition, IWheat> getMapFromField(Field field);
}
