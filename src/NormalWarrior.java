 
public class NormalWarrior extends Warrior {

    public NormalWarrior(String name) {
        noOfWarriors++;
        this.name = name;
        this.Immortal = false;
        this.mobility = true;
    }

    public void eatLotus(Lotus lotus) {
        System.out.println("I can\'t eat this");
    }

    public void swim() {
        System.out.println(this.getName() + "is swimming");
    }

    public void sleep() {
        System.out.println(this.getName() + "is sleeping");
    }
}
