import java.time.temporal.ValueRange;

public class TriangleTypes {

        private int side1;
        private int side2;
        private int side3;

        public TriangleTypes(int side1, int side2, int side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

    public static String triangleType(int side1, int side2, int side3) {//function to find type of triangle
        String type;
        if(side1 == side2 && side2 == side3) {
            return type = "an Equilateral";
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            return type = "an Isosceles";
        }
        else if ((side1 + side2) < side3 || (side2 + side3) < side1 || (side1 + side3) < side2){
            return type = "not a";
        }
        else {
            return type = "a Scalene";
        }
    }



}





