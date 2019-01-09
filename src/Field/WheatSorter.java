package Field;

import Core.IPosition;

import java.util.Map;

//A comparator sorting Entry<IPosition, IWheat> by IWheat (Interfaces/Generalization/Overwriting/Sorting)
public class WheatSorter implements IWheatSorter {
    //Returns an int from the IWheat.compareTo-method
    @Override
    public int compare(Map.Entry<IPosition, IWheat> w1, Map.Entry<IPosition, IWheat> w2){
        return w1.getValue().compareTo(w2.getValue());
    }
}
