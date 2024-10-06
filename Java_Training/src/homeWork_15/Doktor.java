package homeWork_15;

public class Doktor {

    String name;
    int age;
    String specialization;
    String education;
    String workplace;
    int yearsOfExperience;
    String[] skills;
    String[] languages;
    float rating;

    public Doktor(String name, String specialization, String education, String workplace, String[] skills, String[] languages,
                  int age, int yearsOfExperience, float rating) {
        this.name = name;
        this.specialization = specialization;
        this.education = education;
        this.workplace = workplace;
        this.skills = skills;
        this.languages = languages;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.rating = rating;

    }
}
