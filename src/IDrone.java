import java.util.Map;

public interface IDrone {
    Map<IPosition, IWheat> scanField(IField fieldToScan);

    int getPosX();

    void setPosX(int posX);

    int getPosY();

    void setPosY(int posY);

    float getBatteryPercentage();

    void setBatteryPercentage(float batteryPercentage);
}
