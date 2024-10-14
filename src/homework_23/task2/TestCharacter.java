package homework_23.task2;

public class TestCharacter {
    public static void main(String[] args) {
        GameCharacter[] gameCharacters = new GameCharacter[3];
        gameCharacters[0] = new Warrior("Rokky", "sword");
        gameCharacters[1] = new Mage("Harry", "wand");
        gameCharacters[2] = new Archer("Karl", "bow");

        for (int i = 0; i < gameCharacters.length; i++) {
            gameCharacters[i].attack();
        }
    }
}
