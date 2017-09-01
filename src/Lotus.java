  
public class Lotus {

    private String name;
    private int petals;
    private boolean isContainPetals;

    private int x;
    private int y;

    public Lotus(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        petals = 100;
        isContainPetals = true;
    }

    public void decrementPetal() {
        petals--;
        if (petals == 0) {
            isContainPetals = false;
        }
    }

    public boolean getPetalAvailability() {
        return isContainPetals;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
