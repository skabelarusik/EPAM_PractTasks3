package PractTasks4;
/* Масса динозавра задаётся в килограммах. Разработайте программу, которая
*  вычисляет, сколько это миллиграмм, грамм и тонн. */


public class WeightDino {


    public static void main(String[] args) {


    }
}

class ChangeWeight {
    private static final int MASS_KEF = 1_000;

    public static double changeToGramm(double mass) {
        return mass * MASS_KEF;
    }

    public static double changeToMillGramm(double mass) {
        return mass * MASS_KEF * MASS_KEF;
    }

    public static double changeToTon(double mass) {
        return mass / MASS_KEF;
    }

}

