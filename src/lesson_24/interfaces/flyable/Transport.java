package lesson_24.interfaces.flyable;

public abstract class Transport {
    int capacity;
    int amount;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract boolean takePassenger();

    public int countPassanger(){
        return amount;
    }
    }

