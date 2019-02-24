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

    public static double averAriph(int a){
        if(!checkNumbers(a)){
            return -1;
        }

        int sum = 0;
        while (a>0){
            sum += a%10;
            a /= 10;
        }

        return (double)sum/6;
    }

    public static double averGeom(int a){
        if(!checkNumbers(a)){
            return -1;
        }

        int mult = 1;

        while (a > 0){
            mult *= a%10;
            a /= 10;
        }
        System.out.println(mult);

        return Math.pow((double)mult, (double)1/6);
    }

    public static boolean checkNumbers(int a) {
        int count = 0;
        while (a > 0){
            a/=10;
            count++;
        }

        if(count != 6) {
            System.out.println("ERROR");
            return false;
        }

        return true;
    }
}
