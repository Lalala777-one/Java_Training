package homework_18;

import java.util.Random;

public class Dog {

    private String name;
    private int jumpHeight;
    private int maxJumpHeight;

    public Dog(String name, int initialJumpHeight) {
        this.name = name;
        this.jumpHeight = initialJumpHeight;
        this.maxJumpHeight = initialJumpHeight * 2;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void jump() {
        System.out.println(name + "прыгает на высоту " + jumpHeight + " см");
    }


    public void train() {
        Random random = new Random();
        int growth = random.nextInt(10) + 1;
        int newJumpHeight = jumpHeight + growth;

        if (newJumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        } else {
            jumpHeight = newJumpHeight;
        }

        //System.out.println(name + "закончил тренировку. Новая высота прыжка: " + jumpHeight);

    }

    /*
    Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
 Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить
  помогут ли тренировки (будет ли данная собака в принципе в состоянии взять барьер).
  Если да -> идем тренироваться -> берет барьер
     */


    public boolean jumpBarrier(int barrierHeight) {
        if (jumpHeight >= barrierHeight) {
            jump();
            System.out.println(name + "легко перепрыгивает барьер в " + barrierHeight);

            return true;

        }
        if (maxJumpHeight >= barrierHeight) {
            while (jumpHeight < maxJumpHeight) {
                train();
            }
            jump();

            System.out.println(name + "потренировался и смог перепрыгнуть барьер высотой " + barrierHeight);
            return true;
        }
        System.out.println(name + "не в состоянии взять барьер высотой " + barrierHeight + " см.");
        return false;
    }
}


class DogTest {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex ", 3);

        rex.jumpBarrier(20);


    }
}
