public class Garden {
    Plant plant1;
    Plant plant2;
    Plant plant3;

    public Garden(Plant plant1, Plant plant2, Plant plant3) {
        this.plant1 = plant1;
        this.plant2 = plant2;
        this.plant3 = plant3;
    }

    String showGardenInfo(){
        return "Roslina 1: " + plant1.showPlantInfo()
                + "\nRoslina 2: " +plant2.showPlantInfo()
                + "\nRoslina 3: " + plant3.showPlantInfo();
    }

    int waterMonthlyConsumption (){
        return plant1.water+plant2.water+plant3.water;
    }

    int waterAnnualConsumtion () {
        return waterMonthlyConsumption()*12;
    }
}
