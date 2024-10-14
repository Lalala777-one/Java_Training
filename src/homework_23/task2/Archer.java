package homework_23.task2;

public class Archer extends GameCharacter {

    public Archer(String name, String weaponType) {
        super(name, weaponType);
        this.characterType = "The archer";
        super.setCharacterType(characterType);
    }

    public void attack() {
        System.out.printf("%s %s shot an arrow from the %s.%n", characterType, getName(), weaponType);
    }
}
