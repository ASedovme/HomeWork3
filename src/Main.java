public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка3");
//Задача 1
System.out.println("Задача 1");
byte one = 115;
short two = -16000;
int three = 1300657;
long four = 2500666777L;
float five = 4.123456F;
double six = 3.2567898;
System.out.println("Значение переменной one c типом byte равно " + one);
System.out.println("Значение переменной two c типом short равно " + two);
System.out.println("Значение переменной three c типом int равно " + three);
System.out.println("Значение переменной four c типом long равно " + four);
System.out.println("Значение переменной five c типом float равно " + five);
System.out.println("Значение переменной six c типом doable равно " + six);
//Задача 2
System.out.println("Задача 2");
float a = 27.12F;
long b = 987678965549L;
float c = (float) 2.786;
short d = 569;
short e = -159;
short f = 27897;
byte g = 67;
System.out.println("Пепременные в коде");
//Задача 3
System.out.println("Задача 3");
byte luPa = 23;
byte anSe = 27;
byte ekAn = 30;
short sheet = 480;
int shStu = sheet/(luPa+anSe+ekAn);
System.out.println("На каждого ученика расчитано " + shStu + " листов");

//Задача 4
System.out.println("Задача 4");
byte normaBottle = 16;
byte normaTime = 2;
short minDay = 1440;
int twentyMin = normaBottle/normaTime*20;
System.out.println("За 20 минут машина произвела " + twentyMin + " бутылок");
int day = normaBottle/normaTime*minDay;
System.out.println("За сутки машина произвела " + day + " бутылок");
int threeDay = day*3;
System.out.println("За три дня машина произвела " + threeDay + " бутылок");
int month = day*30;
System.out.println("За месяц машина произвела " + month + " бутылок");

//Задача 5
System.out.println("Задача 5");
byte allpot = 120;
byte whitePot = 2;
byte brownPot = 4;
int clas = allpot/(whitePot+brownPot);
int allWhite = clas*whitePot;
int allBrown = clas*brownPot;
System.out.println("В школе, где " + clas + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

//Задача 6
System.out.println("Задача 6");
byte banan = 5;
byte wBanan = 80;
short milk = 200;
short smallMilk = 100;
short wMilk = 105;
byte wIse = 100;
byte ise = 2;
byte egg = 4;
byte wEgg = 70;
int wAll = (banan*wBanan)+(milk/smallMilk*wMilk)+(wIse*ise)+(egg*wEgg);
float wKg = wAll*0.001F;
System.out.println("вес " + wAll + " грамм или " + wKg + " кг");

//Задача 7
System.out.println("Задача 7");
byte allWhKg = 7;
short smWtG = 250;
short bigWhG = 500;
float smWtKg = smWtG*0.001F;
float bigWtKg = bigWhG*0.001F;
float smallDay = allWhKg/smWtKg;
float bigDay = allWhKg/bigWtKg;
float da = (smallDay+bigDay)/2;
int resultBigDay = Math.round(bigDay);
int resultSmallDay = Math.round(smallDay);
int resultDa = Math.round(da);
System.out.println("от "+ resultBigDay + " дней до " + resultSmallDay + " дней, в среднем " + resultDa + " день");

//Задача 8
System.out.println("Задача 8");
int masa = 67760;
int den = 83690;
int kris = 76230;
int newMasa = masa + masa/10;
int newDen = den + den/10;
int newKris = kris + kris/10;
int deltaMasa = newMasa*12 - masa*12;
int deltaDen = (newDen-den)*12;
int deltaKris = (newKris-kris)*12;
System.out.println("Маша теперь получает " + newMasa + " рублей. Годовой доход вырос на " + deltaMasa + " рублей.");
System.out.println("Денис теперь получает " + newDen + " рублей. Годовой доход вырос на " + deltaDen + " рублей.");
System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + deltaKris + " рублей.");
}

}