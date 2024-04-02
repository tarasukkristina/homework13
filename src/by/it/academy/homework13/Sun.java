package by.it.academy.homework13;

public class Sun implements CosmicBody{

    private static Sun instance;
    private int radius;


    public Sun(int radius) {
        this.radius = radius;
    }

    public static synchronized Sun getInstance (int radius) {
        if (instance == null) {
            instance = new Sun(radius);
        }
        return instance;
    }


    @Override
    public synchronized void printWeight() {
        System.out.println("Sun's weight  1.989*10^30 kg");
    }


    public synchronized int  getSqure() {
        return (int)(4*Math.PI*radius*radius);
    }
}
