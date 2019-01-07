package Core;

import Field.IWheat;

import java.util.List;
import java.util.Map;

public interface IData {
    List<IWheat> getSortedWheatList();

    Map<IPosition, IWheat> getFieldMap();
}
