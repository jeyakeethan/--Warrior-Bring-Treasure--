 
public class MonsterFish extends Fish {

    public MonsterFish(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void attackWarrior(Warrior warrior) {
        if (!warrior.isImmortal()) {
            warrior = null;
        }
    }
}
