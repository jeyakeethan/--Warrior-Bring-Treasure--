
public abstract class Fish {

    protected int x;
    protected int y;
    protected String name;

    public abstract void attackWarrior(Warrior warrior);

    public Fish() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
