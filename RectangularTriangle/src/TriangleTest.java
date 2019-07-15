public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4,5,3);
        CheckTriangle checkTriangle = new CheckTriangle();
        System.out.println("Czy trojkat jest prostokatny: " + (checkTriangle.isRightTriangle(triangle)?"tak":"nie"));
    }
}
