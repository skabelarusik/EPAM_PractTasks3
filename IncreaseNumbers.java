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
        boolean status = false;
        
        if( a % 10 >= (a /=10)%10 &&  a % 10 >= (a /= 10) % 10 && a % 10 >= (a /= 10) % 10 ) {
            status = true;
        }

        return status;
    }

    public static boolean checkDecrease(int a) {
        boolean status = false;
        
        if( a % 10 <= (a /=10)%10 &&  a % 10 <= (a /= 10) % 10 && a % 10 <= (a /= 10) % 10 ) {
            status = true;
        }

        return status;
    }
}
