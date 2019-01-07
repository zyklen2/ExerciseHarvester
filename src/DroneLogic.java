import java.util.*;
import java.util.stream.Collectors;

public class DroneLogic implements IDroneLogic{

    public Map<IPosition, IWheat> scanField(IField field){
        Map<IPosition, IWheat> ret = new HashMap<>();
        int xPos = 0;
        for(Set<IWheat> x : field.getWheatSet()){
            int yPos = 0;
            for(IWheat y : x){
                ret.put(new Position(xPos, yPos), y);
                yPos++;
            }
            xPos++;
        }
        return ret;
    }
}
