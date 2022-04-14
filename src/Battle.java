public class Battle {

    public void runBattle(Character player1, Character player2) {
        while (player1.getHealth() > 0 && player2.getHealth() > 0) {
            battleUpdate(player1,player2);
            System.out.println();

            if (player2.getHealth() > 0) {
                battleUpdate(player2,player1);
                System.out.println();
            }
        }
        if (player1.getHealth() > player2.getHealth()) {
            System.out.println(player1.getName() + " is the winner of this battle ! ");
        } else {
            System.out.println(player2.getName() + " is the winner of this battle ! ");
        }
    }
    public void battleUpdate(Character attacker, Character defender) {
        System.out.println(attacker.getName() + " is attacking " + defender.getName() + " with a/an " + attacker.getWeapon().getName() + ", damage level "  + attacker.getWeapon().getDamage() );
        attacker.battleCry();
        attacker.attack(defender);

        System.out.println(defender.getName() +  ", health percentage is: " + defender.getHealth());

        if (defender.getHealth() == 0) {
            System.out.println(defender.getName() + " was knocked out. ");
        }

    }
}
