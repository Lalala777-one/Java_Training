package homework_26.Task1;

public class Pair <T>{
    T valueA;
    T valueB;

    public Pair(T valueA, T valueB) {
        this.valueA = valueA;
        this.valueB = valueB;

    }

    @Override
    public String toString() {
        return "Pair{" +
                "valueA = " + valueA +
                ", valueB = " + valueB +
                '}';
    }

    public  T getFirst() {
        return valueA;


    }

    public  T  getSecond(){
        return valueB;
    }

    public void setFirst(T valueA) {
        this.valueA = valueA;
    }

    public void setSecond(T valueB) {
        this.valueB = valueB;
    }

    public void swap(){
        T tempValueC = this.valueA;
        this.valueA = this.valueB;
        this.valueB = tempValueC;

    }
    }


