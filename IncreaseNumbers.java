package PractTasks4;
/* Разработайте программу, которая проверяет, что цифры положительного че-
*  тырёхзначного числа образуют возрастающую (убывающую) последователь-
*  ность (к примеру, число 1357 удовлетворяет условию, т.к. его цифры соответ-
*  ствуют следующему неравенству: 1 < 3 < 5 < 7, т.е. идут в порядке возрастания). */

public class IncreaseNumbers {
    public static void main(String[] args) {
        System.out.println(checkIncreaseOrDecrease.checkIncrease(122225));
        System.out.println(checkIncreaseOrDecrease.checkDecrease(4321));
    }
}

class checkIncreaseOrDecrease {

    public static boolean checkIncrease(int a) {
        if (!checkNumbers(a)) {
            return false;
        }

        int temp = a % 10;
        a /= 10;

        while (a > 0) {
            if (a % 10 <= temp) {
                temp = a % 10;
                a /= 10;
            } else {
                return false;
            }
        }

        return true;

    }

    public static boolean checkDecrease(int a) {
        if (!checkNumbers(a)) {
            return false;
        }

        int temp = a % 10;
        a /= 10;

        while (a > 0) {
            if (a % 10 >= temp) {
                temp = a % 10;
                a /= 10;
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean checkNumbers(int a) {
        int count = 0;

        while (a > 0) {
            a /= 10;
            count++;
        }
        if (count != 4) {
            System.out.println("Error");
            return false;
        }

        return true;
    }
}
