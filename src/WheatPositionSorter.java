import java.util.Map;

public class WheatPositionSorter implements IWheatPositionSorter {
    @Override
    public int compare(Map.Entry<IPosition, IWheat> e1, Map.Entry<IPosition, IWheat> e2){
        IWheat e1Wheat = e1.getValue();
        int e1GrainCount = e1Wheat.getGrainCount();
        IWheat e2Wheat = e2.getValue();
        int e2GrainCount = e2Wheat.getGrainCount();
        if(e1GrainCount != e2GrainCount){
            return new WheatSorter().compare(e1Wheat,e2Wheat);
        }else{
            return new PositionSorter().compare(e1.getKey(),e2.getKey());
        }
    }
}
