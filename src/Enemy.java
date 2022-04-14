import java.util.Random;
public class Enemy extends Character {

    protected String[] taunts;
    public Enemy(String name, int health, Weapon weapon, String[] taunts) {
        super(name, health, weapon);
        this.taunts = taunts;
    }
    @Override
    public void battleCry() {
        Random rand = new Random();
        System.out.println(taunts[rand.nextInt(taunts.length)]);
    }
}
