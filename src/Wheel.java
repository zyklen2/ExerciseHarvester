public class Wheel implements IWheel{
    float width = 0;
    float radius = 0;
    boolean pumpedUp = false;
    float pumpedUpBar = 0;

    public Wheel(float width, float radius, boolean pumpedUp, float pumpedUpBar) {
        this.width = width;
        this.radius = radius;
        this.pumpedUp = pumpedUp;
        this.pumpedUpBar = pumpedUpBar;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public boolean isPumpedUp() {
        return pumpedUp;
    }

    public void setPumpedUp(boolean pumpedUp) {
        this.pumpedUp = pumpedUp;
    }

    public float getPumpedUpBar() {
        return pumpedUpBar;
    }

    public void setPumpedUpBar(float pumpedUpBar) {
        this.pumpedUpBar = pumpedUpBar;
    }
}
