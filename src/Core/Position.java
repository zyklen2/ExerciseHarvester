package Core;

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

    @Override
    public int compareTo(IPosition otherPos){
        if(this.getHash() == otherPos.getHash()){
            return 0;
        }else {
            int ret = otherPos.getPosX() + otherPos.getPosY() - this.getPosX() - this.getPosY();
            if(ret == 0){
                ret = Integer.MIN_VALUE;
            }
            return ret;
        }
    }

    public int getHash(){
        return (7 + posX)*7 + posY;
    }
}
