import java.util.Random;

public class CharacterCreator {

    private final String[] weaponNames = { "Japanese Sword", " Combat Knife", "Piston Gun", "Fist", "Grenade" , "ax", "mace", "riffle", "lance", "pike"};

    public Character generateCharacter(String name) {
        Random random = new Random();
        int health = random.nextInt(20, 51);
        int weapons = random.nextInt(0,10);
        String weaponName = weaponNames [weapons];
        int weaponDamage = random.nextInt(5, 16);
        Weapon weapon = new Weapon(weaponName, weaponDamage);
        return new Character(name,health,weapon);
    }

    public Enemy generateEnemy(String name){
        Random random = new Random();
        int health = random.nextInt(20, 51);
        int weapons = random.nextInt(0,10);
        String weaponName = weaponNames [weapons];
        int weaponDamage = random.nextInt(5, 16);
        Weapon weapon = new Weapon(weaponName, weaponDamage);
        String [] taunts = {
                "I will seat at the throne again!", "You can do much better than that, My lord"
        };
        return new Enemy(name,health,weapon,taunts);
    }
    public Player generatePlayer(String name) {
        Random random = new Random();
        int health = random.nextInt(20, 51);
        int weapons = random.nextInt(0, 10);
        String weaponName = weaponNames[weapons];
        int weaponDamage = random.nextInt(5, 16);
        Weapon weapon = new Weapon(weaponName, weaponDamage);

        String favouriteSaying = "For Susexxxxx!";
        return new Player(name, health, weapon, favouriteSaying);
    }
}
