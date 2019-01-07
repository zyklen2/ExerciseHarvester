package Field;

import java.util.Set;
import java.util.stream.Stream;

public interface IField {
    IWheat[][] getWheatArray();
    int getFieldSizeX();
    int getFieldSizeY();
}
