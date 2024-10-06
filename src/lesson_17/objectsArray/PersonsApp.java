package lesson_17.objectsArray;

public class PersonsApp {

    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");

        System.out.println(garry.toString());

        Person john = new Person("John", 75, "Reading, music");
        System.out.println(john.toString());

        Person[] peoples = new Person[5];

        peoples[0] = garry;
        peoples[3] = john;
        peoples[1] = new Person("Tom", 5, "crying");

        System.out.println("=====================================================");

        System.out.println(peoples[0].toString());
        System.out.println(peoples[3].toString());
        System.out.println(peoples[1].toString());

        peoples[0].setName("Peter");

        System.out.println("peoples[0].toString() " + peoples[0].toString());
        System.out.println(garry.toString());

        System.out.println("=====================================================");


        for (int i = 0; i < peoples.length; i++) {
            if(peoples[i] != null) {
                System.out.println(peoples[i].toString());
                System.out.println(peoples[i].getName());
            }else {
                System.out.println("null");
            }
        }

        System.out.println("======================================================");

        Person test = new Person("Test", 58, "coding");
        peoples[2] = test;

        peoples[2].setName("Test1");
        test.setAge(52);
        System.out.println(test.toString());

        // РАЗОБРАТЬ !!!!!

        test = null;

        System.out.println( peoples[2].getHobby());

        test = peoples[1];

    }
}
