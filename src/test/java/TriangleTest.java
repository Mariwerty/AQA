import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TriangleTest {

    @DataProvider()
    public Object[][] isInRange() {
        return new Object[][]{
                {11, 10, 15},
                {1, 23, 16},
                {10, 20, 30},
        };
    }

    @DataProvider()
    public Object[][] isEquilateral() {
        return new Object[][]{
                {30, 30, 30},
                {100, 100, 100},
        };
    }

    @DataProvider()
    public Object[][] isIsosceles() {
        return new Object[][]{
                {40, 40, 70},
                {3, 10, 3},
                {38, 14, 14},
        };
    }

    @DataProvider()
    public Object[][] isScalene() {
        return new Object[][]{
                {14, 8, 30},
                {55, 19, 7},
                {24, 97, 4},
        };
    }

    @DataProvider()
    public Object[][] isTriangle() {
        return new Object[][]{
                {58, 66, 22},
                {4, 41, 42},
                {69, 68, 67},
        };
    }

    @Test(dataProvider = "isInRange")
    public void inRange(int side1, int side2, int side3) {
        Assert.assertTrue((side1 > 0 && side2 > 0 && side3 > 0) && (side1 < 101 && side2 < 101 && side3 < 101),
                "The input is not a positive integer from 1 to 100");
    }


    @Test(dataProvider = "isEquilateral")
    public void checkIsEquilateral(int side1, int side2, int side3) {
        boolean allEqualSides = (side1 == side2 && side2 == side3);
        Assert.assertTrue(allEqualSides, "Not all sides of the triangle are equal");
    }

    @Test(dataProvider = "isIsosceles")
    public void checkIsIsosceles(int side1, int side2, int side3) {
        boolean twoEqualSides = (side1 == side2 || side2 == side3 || side1 == side3);
        Assert.assertTrue(twoEqualSides, "Two sides of the triangle are not equal");
    }

    @Test(dataProvider = "isScalene")
    public void checkIsScalene(int side1, int side2, int side3) {
        boolean allDifferentSides = (side1 != side2 && side2 != side3 && side3 != side1);
        Assert.assertTrue(allDifferentSides, "This is not a scalene triangle");
    }

    @Test(dataProvider = "isTriangle")
    public void validateTriangle (int side1, int side2, int side3) {
        boolean notTriangleSides = ((side1 + side2) < side3 || (side2 + side3) < side1 || (side1 + side3) < side2);
        Assert.assertFalse(notTriangleSides, "The proposed sides doesn't form a triangle");
    }
}