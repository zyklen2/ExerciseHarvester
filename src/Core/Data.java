package Core;

import Field.IWheat;

import java.util.List;
import java.util.Map;

public class Data implements IData {//Interface als zugang für die Öffentlichen Methoden
    //Erstellung einer neuen Datenstruktur "Data" um die Map des Feldes und die Liste der Weizenpflanzen speichern zu können
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
}
