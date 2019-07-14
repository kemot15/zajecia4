public class CoursesPlatform {
    public static void main(String[] args) {
        Category course1Category = new Category("Programming","Best programming tutorials online" );
        Category course2Category = new Category("Self development", "Learn How to become the best version of Yourself Today");
        Course course1 = new Course("Java", 5400, course1Category, 199);
        Course course2 = new Course("Android", 3600, course1Category, 149);
        Course course3 = new Course("Fast Reading", 2200, course2Category, 139);
        CourseOffer offer1 = new CourseOffer();
        Time time = new Time();

        System.out.println("There are 3 courses in our database:");
        System.out.println(course1.showCourseInfo());
        System.out.println(course2.showCourseInfo());
        System.out.println(course3.showCourseInfo());

        System.out.println("Special offer! Buy 3 courses and save 10%");
        double afterDisscount = offer1.afterDisscoun(course1.price, course2.price, course3.price, 10);
        double totalPrice = offer1.toatlPrice(course1.price, course2.price, course3.price);
        System.out.printf("  > Price after discount: %.2fzl (before: %.2fzl)\n",afterDisscount, totalPrice);
        int hour = time.showHour(course1.length, course2.length, course3.length);
        int min =time.showMin(course1.length, course2.length, course3.length);
        System.out.println("You will need: " + hour +"h " + min +"min");


    }
}
