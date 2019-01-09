package Drone;

import Core.IPosition;
import Core.Position;
import Field.IField;
import Field.IWheat;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Logic for scanning field (Interfaces/Overloading/Datastructure), should be used in Drone (Association)
public class DroneLogic implements IDroneLogic {

    //Scans field, just extracts wheatArray and returns scanField(IWheat[][]) (Overloading)
    @Override
    public Map<IPosition, IWheat> scanField(IField field) {
        return scanField(field.getWheatArray());
    }

    //Scans 2D field and creates a map of IPosition from position in array and matching IWheat (Datastructures)
    @Override
    public Map<IPosition, IWheat> scanField(IWheat[][] wheatArray) {
        //Slower with stream even in lesser numbers (maybe because of not fixed HashMap, generating of SimpleEntries and mapping)
//        if ((wheatArray.length * wheatArray[0].length) <= 9000) {
//            Stream<Map.Entry<IPosition, IWheat>> ret = Stream.of();
//            int xPos = 0;
//            for (IWheat[] x : wheatArray) {
//                int yPos = 0;
//                for (IWheat y : x) {
//                    ret = Stream.concat(ret, Stream.of(new AbstractMap.SimpleEntry<>(new Position(xPos, yPos), y)));
//                    yPos++;
//                }
//                xPos++;
//            }
//            return ret.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
//        } else {
            HashMap<IPosition, IWheat> ret = new HashMap<>();
            int xPos = 0;
            for (IWheat[] x : wheatArray) {
                int yPos = 0;
                for (IWheat y : x) {
                    ret.put(new Position(xPos, yPos), y);
                    yPos++;
                }
                xPos++;
            }
            return ret;
        //}
    }
}
