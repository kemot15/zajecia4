public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double circleArea (){
        return Math.pow(r, 2)*Math.PI;
    }
}
