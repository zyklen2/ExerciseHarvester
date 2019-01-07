package Drone;

import Core.IPosition;
import Field.IField;
import Field.IWheat;

import java.util.List;
import java.util.Map;

public interface IDroneLogic {
    Map<IPosition, IWheat> scanField(IField field);
}
