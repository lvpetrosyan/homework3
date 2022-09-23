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
        // задание 5
        System.out.println("Задание 5");
        int allClasss = 120/6;
        int white = allClasss *2;
        int brow = allClasss*4;
        System.out.println("В школе, где " + allClasss + " классов, нужно " + white + " банок белой краски " +
                " и " +brow + " коричневой краски");
        // задание 6
        System.out.println("Задание 6");
        short banan = 5*80;
        short milk = 105*2;
        short ice = 100*2;
        short eggs= 4*70;
        int allFoods= banan+milk+ice+eggs;
        double kg = allFoods / 1000d;
        System.out.println("Вес завтрака " + allFoods + " грамм или " + kg+ " кг. ");
        // задание 7
        System.out.println("задание 7");
        int weight = 7*1000;
        int day1 = weight/250;
        int day2= weight/500;
        System.out.println(day1+ " уйдет дней, если спортсмен будет терять в весе 250 гр в день");
        System.out.println(day2+ " уйдет дней, если спортсмен будет терять в весе 500 гр в день");
        int med=(day1+day2)/2;
        System.out.println("на похудение в среднем уйдет " +med+ " день");
        //задание8
        System.out.println("задание 8");
        int masha = 67760; //начальная зп
        int den = 83690;
        int kris=76230;
        int masha1 = (masha/100)*10; //проценты
        int den2 = (den/100)*10;
        int kris2=(kris/100)*10;


        int masha2= masha1+masha; //итог зп
        int den3= den2+den;
        int kris3=kris+kris2;


        int year= masha*12;   //годовая первая
        int yearD=den*12;
        int yearK=kris*12;
        int allMasha =masha2*12; //годовая 2
        int allDen=den3*12;
        int allKris=kris3*12;
        int ma=allMasha-year;
        int de= allDen-yearD;
        int kr=allKris-yearK;

        System.out.println("Маша теперь получает " + masha2+ " рублей. Годовой доход вырос на "+ma+
                " рублей");
        System.out.println("Денис теперь получает " + den3 + " рублей. Годовой доход вырос на "+de+
                " рублей");
        System.out.println("Кристина теперь получает " + kris3+ " рублей. Годовой доход вырос на "+kr+
                " рублей");


    }

}