public class Main {
    public static void main(String[] args) {
        exersize3 ();
    }

    public static void exersize1() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int a = 10; a > 0; a--) {
            System.out.print(" " + a);
        }
    }

    public static void exersize2 () {
        int firstFriday = 5;
        for (int day = 1; day <=31; day++) {
            //System.out.println(day);
            if (day % firstFriday == 0) {
                firstFriday=firstFriday+7;
                System.out.println("Сегодня пятница, "+ day +"-е число. Необходимо подготовить отчет.");

            }
        }

    }
    public static void exersize3 () {
        int asteroidFly200 = 0;
        int asteroidFly100 = 0;
        for (int asteroidFly=0; asteroidFly<2100;asteroidFly++){
            if (asteroidFly %79 == 0) {
                System.out.println(asteroidFly);
            }
        }
    }


}



