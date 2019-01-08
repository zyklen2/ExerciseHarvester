package Core;

//Class for positioning, implements IPosition, which extends Comparable (Interfaces/Generalization/Overwrite)
public class Position implements IPosition {
    private int posX;
    private int posY;

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    //Implements abstract method from Comparable
    //It returns an int according to the coordinates of both positions, if same 0,
    //if result is Integer.MIN_VALUE, the objects are not the same, but the compareTo-method would return 0
    @Override
    public int compareTo(IPosition otherPos){
        if(this.getHash() == otherPos.getHash()){
            return 0;
        }else {
            int ret = otherPos.getPosX() + otherPos.getPosY() - this.getPosX() - this.getPosY();
            if(ret == 0){
                return Integer.MIN_VALUE;
            }
            return ret;
        }
    }

    //Gets int-hash from object
    public int getHash(){
        return (7 + posX)*7 + posY;
    }

    @Override
    public String toString(){
        return "x: " + getPosX() + " y: " + getPosY();
    }
}
