package PractTasks4;
/* Написать программу, которая переворачивает положительное семизначное
*  число (к примеру, число 1234567 переворачивает в число 7654321).*/

public class RotateNumbers {
    public static void main(String[] args) {
        System.out.println(DoRotate.rotate(5566778));
    }
}

class DoRotate{
   public static int rotate(int a) {
        int temp = 6;

        return (int) ((a % 10) * Math.pow(10, temp--) + ((a /= 10) % 10) * Math.pow(10, temp--) +
                ((a /= 10) % 10) * Math.pow(10, temp--) + ((a /= 10) % 10) * Math.pow(10, temp--) +
                ((a /= 10) % 10) * Math.pow(10, temp--) + ((a /= 10) % 10) * Math.pow(10, temp--) +
                ((a /= 10) % 10));
    }
    
}
