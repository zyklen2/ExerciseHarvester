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

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FieldManagementComputer implements IFieldManagementComputer {
    private IDrone theDrone;
    public FieldManagementComputer(Drone theDrone) {
        this.theDrone=theDrone;
    }

    @Override
    public IData ScanFieldAndAnalyse(IField field){
        long now = System.nanoTime();
        Map<IPosition, IWheat> theFieldMap = theDrone.scanField(field);
        System.out.println("Scan Field: " + (System.nanoTime() - now)/100000);

        now = System.nanoTime();
        List<Map.Entry<IPosition,IWheat>> theWheatList = sortWheatField(theFieldMap);
        System.out.println("Sort Field: " + (System.nanoTime() - now)/100000);
        return new Data(theWheatList,theFieldMap);
    }

    private List sortWheatField(Map<IPosition, IWheat> wheatMap){
        return wheatMap.entrySet().stream()
                .sorted(new WheatSorter().reversed().thenComparing(new PositionSorter()))
                .map(entry->new AbstractMap.SimpleEntry(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public IWheat findWheatByPos(int posX, int posY, Map<IPosition, IWheat> wheatMap){
        Position pos = new Position(posX, posY);
        Optional<Map.Entry<IPosition,IWheat>> posWheatResult =  wheatMap.entrySet().stream()
                .filter(entry -> entry.getKey().getHash() == pos.getHash())
                .findFirst();
        return posWheatResult == null || posWheatResult.isEmpty() ? null : posWheatResult.get().getValue();
    }

}
