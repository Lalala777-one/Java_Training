package homework22.Task1;

import homework21.task2.Processor;

public class HumanTest {

    public static void main(String[] args) {
        Human human = new Human("Stiven", 25, 10);
        AmateurAthlete amateurAthlete = new AmateurAthlete("Ben", 29, 15);
        ProfessionalAthlete profAthlete = new ProfessionalAthlete("Tom", 21, 25);

        human.run();
        amateurAthlete.run();
        profAthlete.run();

    }
}
