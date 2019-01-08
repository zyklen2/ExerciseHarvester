package Harvester;

import Core.IData;
import Core.IPosition;
import Field.IField;
import Field.IWheat;

import java.util.Map;

public interface IFieldManagementComputer {
    IData ScanFieldAndAnalyse(IField field);

    IWheat findWheatByPos(int posX, int posY, Map<IPosition, IWheat> wheatMap);
}
