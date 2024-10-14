package homework_23.task2;

public class Mage extends GameCharacter {

    public Mage(String name, String weaponType) {
        super(name, weaponType);
        this.characterType = "The mage";
        super.setCharacterType(characterType);
    }

    public void attack() {
        System.out.printf("%s %s used his %s.%n", characterType, getName(), weaponType);
    }
}
