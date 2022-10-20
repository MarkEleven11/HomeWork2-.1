public class Main {
    public static void main(String[] args) {
        //Переменные часть 2
        //Task1

        int money = 100;
        System.out.println("Значение переменной money с типом int равно " + money);
        byte men = 2;
        System.out.println("Значение переменной men c типом byte равно " + men);
        short computers = 35;
        System.out.println("Значение переменной computers с типом short равно " + computers);
        long days = 10000L;
        System.out.println("Значение переменной days c типом long равно " + days);
        float particle = 0.124f;
        System.out.println("Значение переменной particle с типом float равно " + particle);
        double coordinates = 1.43256576657;
        System.out.println("Значение переменной coordinates с типом double равно " + coordinates);

        //Task2
        System.out.println( "double a = 27.12 long b = 987_678_965_549L byte c = 2 int d = 786 boolean f = false " +
                "short g = 569 short h = -159 float i = 27897 char j = 67");


        //Task3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short papers = 480;
        int papers1 = papers / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + papers1 + " листов бумаги.");

        //Task4
        int machine2 = 16; //бутылок за две минуты
        int machine = machine2 / 2; //бутылок за одну минуту
        int time = 20;
        int bottle20Minute = machine * time;
        System.out.println("За " + time + " минут машина произвела бутылок " + bottle20Minute + " штук.");
        int time1 = 60 * 24;
        int bottle24Hours = time1 * 8;
        System.out.println("За " + time1 + " минут машина произвела бутылок " + bottle24Hours + " штук.");
        int time2 = time1 * 3;
        int bottle3Days = time2 * 8;
        System.out.println("За " + time2 + " минут машина произвела бутылок " + bottle3Days + " штук.");
        int time3 = time1 * 30;
        int boottleMonth = time3 * 8;
        System.out.println("За " + time3 + " минут машина произвела бутылок " + boottleMonth + " штук.");

        //Task5
        int common = 120;
        int white = 2;
        int brown = 4;
        int totalEx = white + brown;
        int totalOne = common / totalEx;
        int totalExwhite = totalOne * white;
        int totalExbrown = totalOne * brown;
        System.out.println("В школе, где " + totalOne + " классов, нужно " + totalExwhite + " банок белой краски и "
               + totalExbrown + " банок коричневой краски." );

        //Task6
        int weightBanana = 80;
        int weightMilk = 105;
        int weihtIcecream = 100;
        int weightEgg = 70;
        byte bananaUnit = 2;
        byte milkUnit = 2;
        byte icecreamUnit = 2;
        byte eggUnit = 4;
        int totalBanana = weightBanana * bananaUnit;
        int totalMilk = weightMilk * milkUnit;
        int totalIcecream = weihtIcecream * icecreamUnit;
        int totalEgg = weightEgg * eggUnit;
        int sumGram = totalBanana + totalMilk + totalIcecream + totalEgg;
        double kg = 0.001;
        double sumKg = sumGram * kg;
        System.out.println(sumGram + " грамм или " + sumKg + " килограмм энергии нужно спортсмену.");

        //Task7
        int sport = 7;
        int gram = 1000;
        int gramSport1 = 250;
        int gramSport2 = 500;
        int daySport1 = sport * gram / gramSport1;
        System.out.println(daySport1 + " дней потребуется спортсмену, чтобы сбросить вес в " + gramSport1 + " грамм");
        int daySport2 = sport * gram / gramSport2;
        System.out.println(daySport2 + " дней потребуется спортсмену, чтобы сбросить вес в " + gramSport2 + " грамм");
        int averegeTime = (daySport1 + daySport2) / 2;
        System.out.println(averegeTime + " дней в среднем потребуется спортсмену, чтобы сбросить вес в " + sport + " килограмм");

        //Task8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float yearPay = 0.1F;
        float payMasha =  masha + (masha * yearPay);
        float payDenis = denis + (denis * yearPay);
        float payKristina = kristina + (kristina * yearPay);
        System.out.println("В результате индексации зарплаты, Маша получает " + payMasha + " рублей, Денис получает "
               +  payDenis + " рублей, Кристина получает " + payKristina + " рублей.");
        int sumPay = masha + denis + kristina;
        float sumPayind = payMasha + payDenis + payKristina;
        float summa = sumPayind - sumPay;
        System.out.println(summa + " рублей составляет разница годового дохода.");























    }

}
