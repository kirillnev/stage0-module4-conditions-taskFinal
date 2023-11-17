package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean isTriangle = firstSide + secondSide > thirdSide &&
                secondSide + thirdSide > firstSide &&
                firstSide + thirdSide > secondSide;
        System.out.println(isTriangle ? "this is a valid triangle" : "it's not a triangle");
    }
}
