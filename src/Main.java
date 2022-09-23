public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("задание 1");
        int int1 = 1;
        System.out.println("Значение переменной int1 с типом int равно " + int1);
        byte byTe = 2;
        System.out.println("Значение переменной byTe с типом byte равно " + byTe);
        short sh = 3;
        System.out.println("Значение переменной sh с типом short равно " + sh);
        long long1 = 4000L;
        System.out.println("Значение переменной long1 с типом long равно " + long1);
        float fl1 = 5.2f;
        System.out.println("Значение переменной fl1 с типом float равно " + fl1);
        double dl = 6.3;
        System.out.println("Значение переменной dl с типом double равно " + dl);
        // задача 2
        System.out.println("задание 2");
        float g1 = 27.12F;
        long l1 = 987_678_965_549l;
        double b1 = 2.786;
        boolean d2 = 5 < 2;
        char s1 = 569;
        short s2 = -159;
        int i2 = 27897;
        byte b2 = 67;
        //задание 3
        System.out.println("задание 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int allClass = class1 + class2 + class3;
        int paper = 480 / allClass;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        //задание 4
        System.out.println("задание 4");
        byte mashine = 16 / 2;
        int time20 = mashine * 20;
        System.out.println("За 20 минут машины произвела бутылок " + time20 + " штук");
        int time24 = mashine * 1440;
        System.out.println("За 1 день машины произвела бутылок " + time24 + " штук");
        int time3 = time24 * 3;
        System.out.println("За 3 дня машины произвела бутылок " + time3 + " штук");
        int time30 = time3 * 10;
        System.out.println("За 1 месяц машины произвела бутылок " + time30 + " штук");

    }

}