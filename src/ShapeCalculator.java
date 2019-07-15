public class ShapeCalculator {


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
