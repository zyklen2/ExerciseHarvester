import java.util.List;
import java.util.Map;

public class FieldManagementComputer {
    private IDrone theDrone;
    private IData theData;
    public FieldManagementComputer() {
        theDrone = new Drone(100);
    }

    public IData ScanFieldAndAnalyse(Field field){
        Map<IPosition, IWheat> theFieldMap = ;
        List<IWheat> theWheatList = theDroneLogic.sortField(theFieldMap);
        IData data = new Data(theWheatList,theFieldMap);
        return theData;
    }

}
