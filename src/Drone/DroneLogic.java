package Drone;

import Core.IPosition;
import Core.Position;
import Field.IField;
import Field.IWheat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Logic for scanning field (Interfaces/Overloading/Datastructures)
public class DroneLogic implements IDroneLogic {

    //Scans field, just extracts wheatArray and returns scanField(IWheat[][]) (Overloading)
    @Override
    public Map<IPosition, IWheat> scanField(IField field){
        return scanField(field.getWheatArray());
    }

    //Scans 2D field and creates a map of IPosition from position in array and matching IWheat (Datastructures)
    @Override
    public Map<IPosition, IWheat> scanField(IWheat[][] wheatArray){
        Stream<AbstractMap.SimpleEntry<IPosition, IWheat>> ret = Stream.of();
        int xPos = 0;
        for(IWheat[] x : wheatArray){
            int yPos = 0;
            for(IWheat y : x){
                ret = Stream.concat(ret, Stream.of( new AbstractMap.SimpleEntry<>(new Position(xPos, yPos), y)));
                yPos++;
            }
            xPos++;
        }
        return ret.collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
    }
}
