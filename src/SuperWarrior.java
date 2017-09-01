 
public class SuperWarrior extends Warrior {

    public SuperWarrior(String name) {
        noOfWarriors++;
        this.name = name;
        this.Immortal = false;
        this.mobility = true;
    }

    public void eatLotus(Lotus lotus) {
        if (lotus.getPetalAvailability()) {
            this.setImmortal(true);
        }
        lotus.decrementPetal();
    }

    public void swim() {
        System.out.println(this.getName() + "is swimming differently");
    }

    public void sleep() {
        System.out.println(this.getName() + "is sleeping differently");
    }

}
