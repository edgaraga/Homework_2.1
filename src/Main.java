public class Main {
    public static void main(String[] args) {

        int ticketPrice = 115; // стоимость билета
        int amountRubles = 20; //количество рублей для одной бонусной мили
        int bonusMiles = ticketPrice / amountRubles; // количество бонусных миль

        System.out.println("За купленный билет начисленно:");
        System.out.println(bonusMiles + " бонусных миль");

    }
}
