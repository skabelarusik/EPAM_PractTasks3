package PractTasks4;
/* Написать программу, которая переворачивает положительное семизначное
*  число (к примеру, число 1234567 переворачивает в число 7654321).*/

public class RotateNumbers {
    public static void main(String[] args) {
        System.out.println(DoRotate.rotate(5566778));
    }
}

class DoRotate{
    public static int rotate(int a){
        if(!checkNumbers(a)){
            return -1;
        }

        int temp = 7;
        int newNumber = 0;

        while (a > 0){
            newNumber += a %10 * Math.pow(10, temp - 1);
            a /= 10;
            temp --;
        }

        return newNumber;
    }

    public static boolean checkNumbers(int a){
        boolean status = true;
        int count = 0;

        while (a > 0)
        {
            count++;
            a /= 10;
        }

        if(count != 7) {
            status = false;
        }

        return status;
    }
}
