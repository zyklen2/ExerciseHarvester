package Core;

import Field.IWheat;

import java.util.Map;

//A comparator sorting Entry<IPosition, IWheat> by IPosition (Interfaces/Generalization/Overwriting/Sorting)
public class PositionSorter implements IPositionSorter {
    //Returns an int from the IPosition.compareTo-method
    @Override
    public int compare(Map.Entry<IPosition, IWheat> p1, Map.Entry<IPosition, IWheat> p2){
        return p1.getKey().compareTo(p2.getKey());
    }
}
