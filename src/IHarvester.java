import java.util.List;
import java.util.Map;

public interface IHarvester {
    int getPosX();

    void setPosX(int posX);

    int getPosY();

    void setPosY(int posY);

    int getHorsePower();

    void letDroneScanField(Field field);

    List<IWheat> getSortedField();

    Map<IPosition, IWheat> getFieldMap();
}
