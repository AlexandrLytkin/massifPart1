public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task4() {
        System.out.println("Задание4");
        int[] array;
        array = new int[3];
        array [0] = 1 +1;
        array [1] = 2;
        array [2] = 3 +1;
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void task3() {
        System.out.println("Задание3");
        int [] array;
        array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double [] massive = {1.57, 7.654, 9.986};
        int [] yearCount;
        yearCount = new int[12];
        yearCount[0] = 1;

        for (int i = 2; i >= 0; i--) {
            System.out.printf(array[i] + ", ");
        }
        System.out.println();
        for (int j = 2; j >=0 ; j--) {
            System.out.printf(massive[j] + ", ");
        }
        System.out.println();
        for (int d = 11; d >=0 ; d--) {
            System.out.printf(yearCount[d] + ", ");
        }
        System.out.println();

    }
    public static void task2() {
        System.out.println("Задание2");
        int [] array;
        array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double [] massive = {1.57, 7.654, 9.986};
        int [] yearCount;
        yearCount = new int[12];
        yearCount[0] = 1;

        for (int i = 0; i < 3; i++) {
            System.out.printf(array[i] + ", ");
        }
        System.out.println();
        for (int j = 0; j <3 ; j++) {
            System.out.printf(massive[j] + ", ");
        }
        System.out.println();
        for (int d = 0; d < yearCount.length ; d++) {
            System.out.printf(yearCount[d] + ", ");
        }
        System.out.println();
    }
    public static void task1() {
        System.out.println("Задание1");
        int [] array;
        array = new int[3];
        double [] massive = {1.57, 7.654, 9.986};
        int [] yearCount;
        yearCount = new int[12];
    }
}
