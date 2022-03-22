public class Main {
    public static void main(String[] args) {

        CharacterCreator characters = new CharacterCreator();
        Battle battle = new Battle();

        Character player1 = characters.generateCharacter("Ruby");
        Character player2 = characters.generateCharacter("Ryu");

        battle.runBattle(player1,player2);

    }
}
