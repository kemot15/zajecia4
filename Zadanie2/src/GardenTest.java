public class GardenTest {
    public static void main(String[] args) {
        Plant plant1 = new Plant("Stokrotka", 3);
        Plant plant2 = new Plant("Roza", 5);
        Plant plant3 = new Plant("Paprotka", 9);

        Garden garden1 = new Garden (plant1, plant2, plant3);

        System.out.println(garden1.showGardenInfo());
        System.out.println("Zuzycie wody: " + garden1.waterMonthlyConsumption() + " l/miesiac");
        System.out.println("Zuzycie wody: " + garden1.waterAnnualConsumtion() + " l/rok");
    }

}
