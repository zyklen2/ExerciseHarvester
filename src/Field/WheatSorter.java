package Field;

import Core.IPosition;

import java.util.Map;

public class WheatSorter implements IWheatSorter {
    @Override
    public int compare(Map.Entry<IPosition, IWheat> w1, Map.Entry<IPosition, IWheat> w2){
        return w1.getValue().compareTo(w2.getValue());
    }
}
