package Core;

public interface IPosition extends Comparable<IPosition> {
    int getPosX();

    void setPosX(int posX);

    int getPosY();

    void setPosY(int posY);
}
