package by.it.academy.homework13;

public class Main {
    public static void main(String[] args) {

        Earth earth = Earth.getInstance(6371);
        earth.printWeight();
        printCosmicBodySquare(earth);

        System.out.println("\n");
        Moon moon = Moon.getInstance(1738);
        moon.printWeight();
        printCosmicBodySquare(moon);

        System.out.println("\n");
        Sun sun = Sun.getInstance(696340);
        sun.printWeight();
        printCosmicBodySquare(sun);
    }


    private static void printCosmicBodySquare(CosmicBody cosmicBody) {
        System.out.println("CosmicBody " + cosmicBody.getClass() +
                " square is " + cosmicBody.getSqure() + " km2");
    }
}
