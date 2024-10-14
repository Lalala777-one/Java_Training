package homework_23.task2;

public class Warrior extends GameCharacter {


    public Warrior(String name, String weaponType) {
        super(name, weaponType);
        this.characterType = "The warrior";
        super.setCharacterType(characterType);
    }

    public void attack() {
        System.out.printf("%s %s wielded his %s.%n", characterType, getName(), weaponType);
    }
}
