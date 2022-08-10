public class Main {
    public static void main(String[] args) {
        exersize1();
        exersize2();
        exersize3();
    }

    // Первое домашнее задание
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
        System.out.println();
    }

    // Второе домашнее задание
    public static void exersize2() {

        int firstFriday = 5;
        for (int day = 1; day <= 31; day++) {
            //System.out.println(day);
            if (day % firstFriday == 0) {
                firstFriday = firstFriday + 7;
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");

            }
        }

    }

    // Третье домашнее задание
    public static void exersize3() {
        System.out.println();
        for (int asteroidFly = 1822; asteroidFly < 2200; asteroidFly++) {

            if (asteroidFly % 79 == 0 && asteroidFly < 2022) {
                System.out.println("Астероид пролетал в " + asteroidFly);
            } else if (asteroidFly % 79 == 0 && asteroidFly < 2122) {
                System.out.println("Астероид пролетит в " + asteroidFly);
            }

        }
    }


}



