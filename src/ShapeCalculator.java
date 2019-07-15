public class ShapeCalculator {
    double squareArea (Square square){
        return Math.pow(square.a, 2);
    }

    double circleArea (Circle circle){
        return Math.pow(circle.r, 2)*Math.PI;
    }

    double rectangleArea (Rectangle rectangle){
        return rectangle.a * rectangle.b;
    }

    double triangleArea (Triangle triangle){
        return Math.pow(triangle.a, 2)* Math.sqrt(3)/4;
    }


    double squarePerimeter (Square square){
        return 4*square.a;
    }

    double circlePerimeter (Circle circle){
        return  2 * Math.PI * circle.r;
    }

    double trainglePerimeter (Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    double rectPerimeter (Rectangle rectangle){
        return 2*(rectangle.a + rectangle.b);
    }


}
