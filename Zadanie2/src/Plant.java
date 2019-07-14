public class Plant {
    String name;
    int water;

    public Plant(String name, int water) {
        this.name = name;
        this.water = water;
    }

    String showPlantInfo (){
        return name + ", " + water + " litrow";
    }
}
