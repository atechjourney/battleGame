public class Battle {
    public void runBattle(Character player1, Character player2) {

        while (player1.health > 0 && player2.health > 0){

            System.out.println(player1.name + " is attacking " + player2.name + " with a/an " + player1.weapon.name + ", damage level "  + player1.weapon.damage );

            player2.health = player2.health - player1.weapon.damage;

            if (player2.health < 0) {
                player2.health = 0;
            }
            System.out.println( player2.name +  ", health percentage is: " + player2.health);

            if (player2.health > 0) {

                System.out.println(player2.name + " is attacking " + player1.name + " with a/an " + player2.weapon.name + ", damage level " + player2.weapon.damage );
                player1.health = player1.health - player2.weapon.damage;

                if (player1.health < 0) {
                    player1.health = 0;
                }
                System.out.println( player1.name +  ", health percentage is: " + player1.health);
            }
        }

        if (player1.health > player2.health) {
            System.out.println(player2.name + " was knocked out. ");
            System.out.println(player1.name + " is the winner of this battle ! ");
        }
        else {
            System.out.println(player1.name + " was knocked out. ");
            System.out.println(player2.name + " is the winner of this battle ! ");
        }

    }
}
