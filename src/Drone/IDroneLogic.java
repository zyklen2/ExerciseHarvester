package Drone;

import Core.IPosition;
import Field.IField;
import Field.IWheat;

import java.util.Map;

//Interface with methods for scanning field: projecting 2D array of IWheat to Map<IPosition, IWheat>
interface IDroneLogic {
    Map<IPosition, IWheat> scanField(IField field);
    Map<IPosition, IWheat> scanField(IWheat[][] wheatArray);
}
