package Field;

//Interface for fields to store IWheat-objects
public interface IField {
    IWheat[][] getWheatArray();
    int getFieldSizeX();
    int getFieldSizeY();
}
