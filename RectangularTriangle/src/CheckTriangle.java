public class CheckTriangle {
    boolean isRightTriangle (Triangle triangle){
        boolean result1 = Math.pow(triangle.a, 2) + Math.pow(triangle.b, 2) == Math.pow(triangle.c, 2);
        boolean result2 = Math.pow(triangle.b, 2) + Math.pow(triangle.c, 2) == Math.pow(triangle.a, 2);
        boolean result3 = Math.pow(triangle.c, 2) + Math.pow(triangle.a, 2) == Math.pow(triangle.b, 2);
        return  result1 || result2 || result3;
    }
}
