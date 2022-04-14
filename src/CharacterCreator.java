import java.util.Random;

public class CharacterCreator implements Generator {

    @Override
    public Character generateCharacter(String name) {
        Random random = new Random();
        int health = random.nextInt(20, 51);
        Weapon weapon = generateWeapon();
        return new Character(name,health,weapon);
    }

    public Enemy generateEnemy(String name) {
        Random random = new Random();
        int health = random.nextInt(20, 51);
        Weapon weapon = generateWeapon();
        String[] taunts = {
                "I will gain the throne again!", "Did you miss me?"
        };
        return new Enemy(name,health,weapon,taunts);
    }
    public Player generatePlayer(String name) {
        Random random = new Random();
        int health = random.nextInt(20, 51);
        Weapon weapon = generateWeapon();
        String favouriteSaying =
                "For Susexx!";
        return new Player(name,health,weapon,favouriteSaying);
    }

    @Override
    public Weapon generateWeapon() {
        Weapon[] weaponTypes = Weapon.values();
        Random random = new Random();
        return weaponTypes[random.nextInt(weaponTypes.length)];
    }
}
