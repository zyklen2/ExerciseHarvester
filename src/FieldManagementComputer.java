import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FieldManagementComputer {
    private IDrone theDrone;
    public FieldManagementComputer() {
        theDrone = new Drone(100);
    }

    public IData ScanFieldAndAnalyse(IField field){
        Map<IPosition, IWheat> theFieldMap = theDrone.scanField(field);
        List<IWheat> theWheatList = sortWheatField(theFieldMap);
        return new Data(theWheatList,theFieldMap);
    }

    private List<IWheat> sortWheatField(Map<IPosition, IWheat> wheatMap){
        return wheatMap.entrySet().stream()
                .sorted(new WheatSorter().reversed().thenComparing(new PositionSorter())).map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

}
