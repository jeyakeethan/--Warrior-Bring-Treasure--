
public abstract class Warrior {

    protected static int noOfWarriors = 0;

    public static int getNoOfWarriors() {
        return noOfWarriors;
    }
    protected String name;
    protected boolean Immortal;
    protected boolean mobility;

    public Warrior() {
    }

    public abstract void eatLotus(Lotus lotus);

    public abstract void swim();

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImmortal() {
        return Immortal;
    }

    public void setImmortal(boolean Immortal) {
        this.Immortal = Immortal;
    }

    public void setMobility(boolean mobility) {
        this.mobility = mobility;
    }

}
