public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
    System.out.println( """
            Orange
            Banana
            Apple""" );//либо через \n
    }

    public static void checkSumSign() {
        int a = (int) ( Math.random() * 1000 - 500 );
        int b = (int) ( Math.random() * 1000 - 500 );
        String answer = ( a + b >= 0 ) ? "Сумма положительная" : "Сумма отрицательная";
        /*
        System.out.println(a);
        System.out.println(b);
        */
        System.out.println( answer );
    }

    public static void printColor() {
        int value = (int) ( Math.random() * 1000 - 500 );
        if ( value <= 0 ) {
            System.out.println( "Красный" );
        }else if ( value <= 100 ) {
            System.out.println( "Желтый" );
        }else System.out.println( "Зеленый" );
        //System.out.println( value );
    }

    public static void compareNumbers() {
        int a = (int) ( Math.random() * 1000 - 500 );
        int b = (int) ( Math.random() * 1000 - 500 );
        String answer = ( a >= b ) ? "a >= b" : "b > a";
        /*
        System.out.println( "a=" + a );
        System.out.println( "b=" + b );
        */
        System.out.println( answer );
    }
}