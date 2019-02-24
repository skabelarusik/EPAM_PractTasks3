package PractTasks4;
/* Написать программу, которая находит арифметическое и геометрическое
*  среднее цифр положительного шестизначного числа.*/

public class AriphGeomAverage {
    public static void main(String[] args) {
        System.out.println(Helper.averAriph(222222));
        System.out.println(Helper.averGeom(123456));
    }
}

class Helper {

    public static double averAriph(int a) {
        return (double)(a % 10 + (a /= 10) % 10 + (a /= 10) % 10 + (a /= 10)
                % 10 + (a /= 10) % 10 + (a/=10) % 10)/6;
    }


    public static double averGeom(int a) {

        return Math.pow((double) (a % 10 * ((a /= 10) % 10) * ((a /= 10) % 10) *
                ((a /= 10) % 10) * ((a /= 10) % 10) * ((a /= 10) % 10)), (double) 1 / 6);
    }

}
