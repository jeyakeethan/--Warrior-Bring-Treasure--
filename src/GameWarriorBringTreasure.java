 
public class GameWarriorBringTreasure {

    public static void main(String[] args) {
        Warrior normal_warrior1 = new NormalWarrior("John");
        Warrior normal_warrior2 = new NormalWarrior("Ram");
        Warrior super_warrior1 = new NormalWarrior("Evil");

        Fish innocent_fish1 = new NormalFish("Dolphin", 6, 5);
        Fish innocent_fish2 = new NormalFish("Sura'", 7, 6);
        Fish monster_fish1 = new MonsterFish("Whale", 5, 4);

        Lotus lotus1 = new Lotus("Blue", 2, 4);
        Lotus lotus2 = new Lotus("red", 1, 6);
        Lotus lotus3 = new Lotus("Blue", 5, 3);

        Treasure treasure1 = new Treasure("TheOnly", 4, 9);
    }

}
