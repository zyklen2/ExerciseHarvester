package Core;

//IPosition extends Comparable, deriving non-abstract classes must implement this (Interfaces/Generalization/)
public interface IPosition extends Comparable<IPosition> {
    int getPosX();

    void setPosX(int posX);

    int getPosY();

    void setPosY(int posY);

    int getHash();
}
