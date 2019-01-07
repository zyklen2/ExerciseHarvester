package Core;

import Field.IWheat;

import java.util.Comparator;
import java.util.Map;

public interface IPositionSorter extends Comparator<Map.Entry<IPosition, IWheat>> {
}
