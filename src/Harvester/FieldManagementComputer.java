package Harvester;

import Core.Data;
import Core.IData;
import Core.IPosition;
import Core.Position;
import Core.PositionSorter;
import Drone.Drone;
import Drone.IDrone;
import Field.IField;
import Field.IWheat;
import Field.WheatSorter;

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

    public IWheat findWheatByPos(int posX, int posY, Map<IPosition, IWheat> wheatMap ){
        Position pos = new Position(posX, posY);
        return wheatMap.entrySet().stream()
                .filter(entry -> entry.getKey().getHash() == pos.getHash())
                .findFirst().get().getValue();
    }

}
