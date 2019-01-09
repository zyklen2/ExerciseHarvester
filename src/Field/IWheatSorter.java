package Field;

import Core.IPosition;

import java.util.Comparator;
import java.util.Map;

//Extends Comparator, deriving non-abstract classes must implement compare-method (Interfaces/Generalization/Sorting)
interface IWheatSorter extends Comparator<Map.Entry<IPosition, IWheat>> {
}
