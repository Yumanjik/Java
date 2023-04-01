public class Main {
    public static void main(String[] args) {
        /*
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        int a = 23;
        int b = -7;
        int c = 0;
        int n = 5;
        int year = 1980;
        String s = "Задание 4";
        System.out.println(work1(a, b));
        System.out.println(work2(c));
        System.out.println(work3(b));
        work4(s, n);
        System.out.println(work5(year));
        */
        zadanie5();
    }

    public static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple""");//либо через \n
    }

    public static void checkSumSign() {
        int a = (int) (Math.random() * 1000 - 500);
        int b = (int) (Math.random() * 1000 - 500);
        String answer = (a + b >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        /*
        System.out.println(a);
        System.out.println(b);
        */
        System.out.println(answer);
    }

    public static void printColor() {
        int value = (int) (Math.random() * 1000 - 500);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
        //System.out.println( value );
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 1000 - 500);
        int b = (int) (Math.random() * 1000 - 500);
        String answer = (a >= b) ? "a >= b" : "b > a";
        /*
        System.out.println( "a=" + a );
        System.out.println( "b=" + b );
        */
        System.out.println(answer);
    }

    //01.04.2023
    public static boolean work1(int a, int b) {
        return (a + b > 10) && (a + b < 20);
    }

    public static String work2(int a) {
        if (a >= 0) {
            return "Положительное";
        } else return "Отрицательное";
    }

    public static boolean work3(int a) {
        return a < 0;
    }

    public static void work4(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    public static boolean work5(int year) {
        return (year % 4 < 1) && (year % 100 > 0);
    }

    //15.04.2023
    public static void primer1() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void primer2() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void primer3() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void primer4() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void primer5 () {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else if (i < j) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie1() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie2() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie3() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ( i == 5 || j == 0  || i == j ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie4() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 1 || i == 4 || i == 5 || j == 0 || j == 1 || j == 4 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void zadanie5() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 && j < 4 || i == 1 && j < 4 || i == 2 || i == 3 || i == 4 && j > 1 || i == 5 && j > 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
