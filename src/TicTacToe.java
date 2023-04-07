import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static boolean checkWin(char dot) {
        int h, v, dm1 = 0, dm2 = 0, drs1 = 0, drs2 = 0, ds1 = 0, ds2 = 0;
        for (int i = 0; i < SIZE; i++) {
            h = 0;
            v = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    h++;
                } else if (h != DOTS_TO_WIN) {
                    h = 0;
                }

                if (map[j][i] == dot) {
                    v++;
                } else if (v != DOTS_TO_WIN) {
                    v = 0;
                }
            }
            if (h == DOTS_TO_WIN || v == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int j = 0; j < SIZE; j++) {
            if (map[j][j] == dot) {
                dm1++;
            } else
                dm1 = 0;
            if (map[j][SIZE - j - 1] == dot) {
                dm2++;
            } else
                dm2 = 0;
            if (dm1 == DOTS_TO_WIN || dm2 == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i + j) == 3 && map[i][j] == dot) {
                    drs1++;
                }
                if ((i + j) == 5 && map[i][j] == dot) {
                    drs2++;
                }
            }
            if (drs1 == DOTS_TO_WIN || drs2 == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i - j) == 1 && map[i][j] == dot) {
                    ds1++;
                }
                if ((j - i) == 2 && map[i][j] == dot) {
                    ds2++;
                }
            }
            if (ds1 == DOTS_TO_WIN || ds2 == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
