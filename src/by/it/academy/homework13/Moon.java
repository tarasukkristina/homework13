package by.it.academy.homework13;

public class Moon implements CosmicBody {
    private static Moon instance;
    private int radius;


    public Moon(int radius) {
        this.radius = radius;
    }

    public static synchronized Moon getInstance (int radius) {
        if (instance == null) {
            instance = new Moon(radius);
        }
        return instance;
    }


    @Override
    public synchronized void printWeight() {
        System.out.println("Moon's weight 7.342×10^22 kg");
    }

    public synchronized int  getSqure() {
        return (int)(4*Math.PI*radius*radius);
    }
}
