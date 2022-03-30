public class Main {

    public static void main(String[] args) {
        CharacterCreator characters = new CharacterCreator();
        Battle battle = new Battle();
        Enemy enemy = characters.generateEnemy("Ruby");

        Player player = characters.generatePlayer("Ryu");
        battle.runBattle(player,enemy);
    }
}
