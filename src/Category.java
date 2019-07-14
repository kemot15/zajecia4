public class Category {
    String categoryName;// = "Programming";
    String categoryDescription;// = "Best programming tutorials online";

    public Category(String nameCategory, String categoryDescription) {
        this.categoryName = nameCategory;
        this.categoryDescription = categoryDescription;
    }

    String showCourseInfo(){
        return categoryName + " " + categoryDescription;
    }
}
