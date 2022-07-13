public class Main {
    public static void main(String[] args) {

        int ticketPrice = 2010;
        int rublesPerMile = 20;
        int bonusMiles;

        bonusMiles = ticketPrice / rublesPerMile;
        System.out.println("Начислено " + bonusMiles + " бонусных миль.");
    }
}