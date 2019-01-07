import java.util.List;
import java.util.Map;

public interface IDroneLogic {
    List<Wheat> sortField(Map<IPosition, IWheat> wheatMap);
}
