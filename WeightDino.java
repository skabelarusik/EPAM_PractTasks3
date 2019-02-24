package PractTasks4;
/* Масса динозавра задаётся в килограммах. Разработайте программу, которая
*  вычисляет, сколько это миллиграмм, грамм и тонн. */


public class WeightDino {


    public static void main(String[] args) {


    }
}

class ChangeWeight {
    private static int massKef = 1_000;

    public static double changeToGramm(double mass) {
        return mass * massKef;
    }

    public static double changeToMillGramm(double mass) {
        return mass * massKef * massKef;
    }

    public static double changeToTon(double mass) {
        return mass / massKef;
    }

}

