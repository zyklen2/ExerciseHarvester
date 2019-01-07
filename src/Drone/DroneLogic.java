package Drone;

import Core.IPosition;
import Core.Position;
import Field.IField;
import Field.IWheat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DroneLogic implements IDroneLogic {

    public Map<IPosition, IWheat> scanField(IField field){
        Stream<AbstractMap.SimpleEntry<IPosition, IWheat>> ret = Stream.of();
        int xPos = 0;
        for(IWheat[] x : field.getWheatArray()){
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
