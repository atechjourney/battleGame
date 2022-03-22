import java.util.Random;

public class CharacterCreator {
    int health;
    String weaponName;
    String[] weaponNames = { "Japanese Sword", " Combat Knife", "Piston Gun", "Fist", "Grenade" , "ax", "mace", "riffle", "lance", "pike"};

    //    name is what is passed in as an argument
    public Character generateCharacter(String name){

        Random random = new Random();

        health = random.nextInt(20, 51);

        int weapons = random.nextInt(0,10);
        weaponName = weaponNames [weapons];

        int weaponDamage = random.nextInt(5, 16);
        Weapon weapon = new Weapon(weaponName, weaponDamage);

        Character characters = new Character(name,health,weapon);

        return characters;
    }
}
