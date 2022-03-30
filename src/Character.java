public class Character {

    private final String name;
    private int health;
    private final Weapon weapon;

    public Character(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    public void takeDamage(int damageTaken) {
        health -= damageTaken;
        if (health < 0 ){
            health = 0;
        }
    }
    public void attack(Character character){
        character.takeDamage(weapon.getDamage());
    }

    public void battleCry(){
        System.out.println("Let the best player win!");
    }
}
