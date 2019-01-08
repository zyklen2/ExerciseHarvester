package Core;

import Field.IWheat;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Data implements IData {
    private List<IWheat> sortedWheatList;
    private Map<IPosition, IWheat> fieldMap;

    public Data(List<IWheat> sortedWheatList, Map<IPosition, IWheat> fieldMap) {
        this.sortedWheatList = sortedWheatList;
        this.fieldMap = fieldMap;
    }

    @Override
    public List<IWheat> getSortedWheatList() {
        return sortedWheatList;
    }

    @Override
    public Map<IPosition, IWheat> getFieldMap() {
        return fieldMap;
    }

    @Override
    public String toString(){
        return "List of sorted wheat:"
                + String.join("\n",sortedWheatList.stream().map(wheat->wheat.toString()).collect(Collectors.toList()))
                +"Pos/wheat-map: " + String.join("\n", fieldMap.entrySet().stream()
                .map(entry-> "Pos: " + entry.getKey().toString() + "\nWheat: " + entry.getValue().toString() ).collect(Collectors.toList()));
    }
}
