package PractTasks4;
/* Разработайте небольшую цельную программу, которая меняет местами со-
*  держимое двух целочисленных переменных a и b, не используя для этого до-
*  полнительных переменных.*/

public class ChangeVar {
    public static void main(String[] args) {
        ChangeTwoVar.change(2,999);
    }
}

class ChangeTwoVar{
    public static void change(int a, int b){
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;
    }
}
