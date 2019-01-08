package Core;

import Field.IWheat;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Data implements IData {
    private List<Map.Entry<IPosition,IWheat>> sortedWheatList;
    private Map<IPosition, IWheat> fieldMap;

    public Data(List<Map.Entry<IPosition,IWheat>> sortedWheatList, Map<IPosition, IWheat> fieldMap) {
        this.sortedWheatList = sortedWheatList;
        this.fieldMap = fieldMap;
    }

    @Override
    public List<Map.Entry<IPosition,IWheat>> getSortedWheatList() {
        return sortedWheatList;
    }

    @Override
    public Map<IPosition, IWheat> getFieldMap() {
        return fieldMap;
    }

    @Override
    public String toString(){
        return "List of sorted wheat:"
                + String.join("\n",sortedWheatList.stream().map(entry->"Pos: " + entry.getKey()
                + " (Sum: " + Integer.sum(entry.getKey().getPosY(), entry.getKey().getPosX()) +")"
                +"\n\t"+ entry.getValue().toString()).collect(Collectors.toList()))
                +"\nPos/wheat-map: " + String.join("\n", fieldMap.entrySet().stream()
                .map(entry-> "Pos: " + entry.getKey().toString() + "\nWheat: " + entry.getValue().toString() ).collect(Collectors.toList()));
    }
}
