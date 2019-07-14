public class Course {
    String name;// = "Java";
    int length;// = 5400; //minutes
    Category category; //= "Programming";
    double price;// = 199; //zl

    public Course(String name, int length, Category category, double price) {
        this.name = name;
        this.length = length;
        this.category = category;
        this.price = price;
    }

    String showCourseInfo (){
        String courseInfo = "Nazwa kursu: " + name + ", category: " + category.showCourseInfo()+ ", length: " + length + " min" + ", price: " + price;
        return  courseInfo;

    }


}
