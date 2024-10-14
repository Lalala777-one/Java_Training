package homework_23.task2;

abstract class GameCharacter {

    protected String weaponType;
    protected String characterType;
    private String name;


    public GameCharacter(String name, String weaponType) {
        this.weaponType = weaponType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    abstract void attack();

}
