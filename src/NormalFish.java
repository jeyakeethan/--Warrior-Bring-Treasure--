
public class NormalFish extends Fish {

    public NormalFish(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void attackWarrior(Warrior warrior) {
        if (!warrior.isImmortal()) {
            warrior.setMobility(false);
        }
    }
}
