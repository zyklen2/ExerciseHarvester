public class Harvester implements IHarvester {
    float length= 0;
    float height= 0;
    float width= 0;
    IEngine theEngine = new Engine(5000);
    IWheel[] wheels = new Wheel[4];
    ILight[] lights = new Light[6];
    int posX=0;
    int posY=0;

    public Harvester(float length, float height, float width) {
        this.length = length;
        this.height = height;
        this.width = width;
        for(int i=0;i<4;i++){
            Wheel newWheel = new Wheel(5,50,true, 500);
            wheels[i]=newWheel;
        }
        for(int i=0;i<4;i++){
            Light newLight = new Light(false);
            lights[i]=newLight;
        }
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
}
