public class ShapeCalculatorTest {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        Rectangle rectangle1 = new Rectangle(5,10);
        Circle circle1 = new Circle(4);
        Triangle triangle1 = new Triangle(3,4,5);
        ShapeCalculator calculator = new ShapeCalculator();

        double squareArea = calculator.squareArea(square1);
        double squarePerimeter = calculator.squarePerimeter(square1);
        System.out.println("Pole i obwod kwadratu : " + squareArea + " " + squarePerimeter);

        double rectPerimeter  =  calculator.rectPerimeter(rectangle1);
        double rectArea = calculator.rectangleArea(rectangle1);
        System.out.println("Pole i obwod prostokata: " + rectArea + " " + rectPerimeter);

        double circleArea = calculator.circleArea(circle1);
        double circlePerimeter = calculator.circlePerimeter(circle1);
        System.out.println("Pole i obwod kola: " + circleArea + " " + circlePerimeter);

        double trianglePerimeter = calculator.trainglePerimeter(triangle1);
        double triangleArea = calculator.triangleArea(triangle1);
        System.out.println("Pole i obwod trojkata: " + triangleArea + " " + trianglePerimeter);

    }
}
