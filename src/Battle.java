public class Battle {

    public void runBattle(Character player1, Character player2) {
        while (player1.getHealth() > 0 && player2.getHealth() > 0){
            System.out.println(player1.getName() + " is attacking " + player2.getName() + " with a/an " + player1.getWeapon().getName() + ", damage level "  + player1.getWeapon().getDamage() );
            player1.battleCry();
            player1.attack(player2);

            System.out.println( player2.getName() +  ", health percentage is: " + player2.getHealth());
            System.out.println();
            if (player2.getHealth() > 0) {

                System.out.println(player2.getName() + " is attacking " + player1.getName() + " with a/an " + player2.getWeapon().getName() + ", damage level " + player2.getWeapon().getDamage() );
                player2.battleCry();
                player2.attack(player1);

                System.out.println(player1.getName() +  ", health percentage is: " + player1.getHealth());
                System.out.println();
            }
        }
            if (player1.getHealth() > player2.getHealth()) {
                System.out.println(player2.getName() + " was knocked out. ");
                System.out.println(player1.getName() + " is the winner of this battle ! ");
            } else {
                System.out.println(player1.getName() + " was knocked out. ");
                System.out.println(player2.getName() + " is the winner of this battle ! ");
            }
    }
}
