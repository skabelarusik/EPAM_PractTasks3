package PractTasks4;
/* На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
*  Разработайте программу нахождения площади кольца, внешний радиус кото-
*  рого равен R1, а внутренний радиус равен R2. */

public class Circles {
    public static void main(String[] args) {
        System.out.println(SizeOfRing.findSquareOfRing(3,2));
    }
}

class SizeOfRing{
    public static double findSquareOfRing(double r1, double r2){
        return findSquareCircle(r1) - findSquareCircle(r2);
    }

    private static double findSquareCircle(double r){
        return Math.PI * r * r;
    }
}
