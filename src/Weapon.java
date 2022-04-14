public enum Weapon {
    JAPANESE_SWORD("Japanese Sword",5),
    COMBAT_KNIFE("Combat knife",4),
    PISTON_GUN("Piston Gun",10),
    FIST("Fist",15),
    GRENADE("Grenade", 4),
    AX("Ax",3),
    MACE("Mace",10),
    RIFFLE("Riffle",8),
    LANCE("Lance",6),
    PIKE("Pike",9);

    private final String name;
    private final int damage;
    Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public String getName() {

        return name;
    }

    public int getDamage() {

        return damage;
    }
}
