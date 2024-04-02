package by.it.academy.homework13;

public class Earth implements CosmicBody {

    private static Earth instance;
    private int radius;

    public Earth(int radius) {
        this.radius = radius;
    }


    public static synchronized Earth getInstance (int radius) {
        if (instance == null) {
            instance = new Earth(radius);
        }
        return instance;
    }


    @Override
    public synchronized void printWeight() {
        System.out.println("Earth's weight is 5,9736*10^24 kg");
    }


    @Override
    public synchronized int getSqure() {
        return (int)(4*Math.PI*radius*radius);

    }
}
