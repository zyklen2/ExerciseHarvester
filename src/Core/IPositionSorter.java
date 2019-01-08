package Core;

import Field.IWheat;

import java.util.Comparator;
import java.util.Map;

//Extends Comparator, deriving non-abstract classes must implement compare-method (Interfaces/Generalization/Sorting)
interface IPositionSorter extends Comparator<Map.Entry<IPosition, IWheat>> {
}
