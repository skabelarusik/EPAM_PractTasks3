package PractTasks4;

/* Разработайте программу, которая проверяет, что числа a, b и c различны (оди-
*  наковы). */
public class Numbers {
    public static void main(String[] args) {

    }
}

class CompareNumbers {
    public static boolean compareNumbers(double a, double b, double c) {
        boolean equals = false;

        if (a == b && a == c) {
            equals = true;
        }

       return equals;
    }
}
