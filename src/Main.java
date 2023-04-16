
public class Main {
    public static void main(String[] args) {
        task1();
        task4();
    }

    static void task1() {
        int [] massive1 = new int[3];
        massive1[0] = 3;
        massive1[1] = 3454;
        massive1[2] = 745546;
        double [] massive2 = {1.57, 7.654, 9.986};
        double[] massive3 = {1.2, 4.7, 3234.12};
        System.out.println("Task2");
        helperInt(massive1);
        helperDouble(massive2);
        helperDouble(massive3);
        System.out.println();
        System.out.println("Task3");
        helperIntReverse(massive1);
        helperDoubleReverse(massive2);
        helperDoubleReverse(massive3);
        System.out.println();
    }
    public static void helperInt(int[] massive1) {
        for (int i = 0; i < massive1.length; i++) {
            if (i == (massive1.length - 1)) {
                System.out.println(massive1[i]);
            } else {
                System.out.print(massive1[i] + ", ");
            }
        }
    }
    public static void helperDouble(double[] massive1) {
        for (int i = 0; i < massive1.length; i++) {
            if (i == (massive1.length - 1)) {
                System.out.println(massive1[i]);
            } else {
                System.out.print(massive1[i] + ", ");
            }
        }
    }
    public static void helperDoubleReverse(double[] massive1) {
        for (int i = (massive1.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(massive1[i]);
            } else {
                System.out.print(massive1[i] + ", ");
            }
        }
    }
    public static void helperIntReverse(int[] massive1) {
        for (int i = (massive1.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(massive1[i]);
            } else {
                System.out.print(massive1[i] + ", ");
            }
        }
    }
    static void task4() {
        System.out.println("Task4");
        int [] massive1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int notEven = 0;
        for (int i = (massive1.length - 1); i >= 0; i--) {
            if (massive1[i] % 2 != 0) {
                notEven = i;
                break;
            }
        }
        for (int i = 0; i <= notEven; i++) {
            if (massive1[i] % 2 != 0) {
                massive1[i]++;
                if (i != notEven) {
                    System.out.print(massive1[i] + ", ");
                } else {
                    System.out.println(massive1[i]);
                }
            }
        }

    }
    }