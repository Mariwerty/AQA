import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        String exceptionMessage = "Please check your input, only positive integers from 1 to 100 accepted";
        Scanner in = new Scanner(System.in);
           while (true) {
                try {
                    System.out.println("Please enter the sides of the triangle in positive integers from 1 to 100");
                    System.out.println("Input side 1: \n");
                    int side1 = in.nextInt();
                    if (side1 < 1 || side1 > 100) {
                        System.out.println(exceptionMessage);
                        break;
                    }
                    System.out.print("Input side 2: \n");
                    int side2 = in.nextInt();
                    if (side2 < 1 || side2 > 100) {
                        System.out.println(exceptionMessage);
                        break;
                    }
                    System.out.print("Input side 3: \n");
                    int side3 = in.nextInt();
                    if (side3 < 1 || side3 > 100) {
                        System.out.println(exceptionMessage);
                        break;
                    }
                    System.out.println("This is " + TriangleTypes.triangleType(side1, side2, side3) + " Triangle");
                    break;
                }
                catch (Exception e){
                    System.out.println(exceptionMessage);
                    break;
                }
           }
    }
}