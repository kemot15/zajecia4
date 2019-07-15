public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double triangleArea (){
        return Math.pow(a, 2)* Math.sqrt(3)/4;
    }
}
