import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] ints = new int [3];
        for (int i = 0; i < ints.length; i++) {
            System.out.println(i);
            ints [i] = i + 1;
        }
        System.out.println(ints[2]);
        float [] floats = {1.57f, 7.654f, 9.986f};
        boolean [] booleans = {true, true, false};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int [] ints = new int [3];
        for (int i = 0; i < ints.length; i++) {
            ints [i] = i + 1;
        }
        float [] floats = {1.57f, 7.654f, 9.986f};
        boolean [] booleans = {true, true, false};
        System.out.println(ints[0] + ", " + ints[1] + ", " + ints[2]);
        System.out.println(floats[0] + ", " + floats[1] + ", " + floats[2]);
        System.out.println(booleans[0] + ", " + booleans[1] + ", " + booleans[2]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int [] ints = new int [3];
        for (int i = 0; i < ints.length; i++) {
            ints [i] = i + 1;
        }
        float [] floats = {1.57f, 7.654f, 9.986f};
        boolean [] booleans = {true, true, false};
        System.out.println(ints[2] + ", " + ints[1] + ", " + ints[0]);
        System.out.println(floats[2] + ", " + floats[1] + ", " + floats[0]);
        System.out.println(booleans[2] + ", " + booleans[1] + ", " + booleans[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int [] ints = new int [3];
        for (int i = 0; i < ints.length; i++) {
            ints [i] = i + 1;
            if (ints[i] % 2 == 1) {
                ints[i] += 1;
            }
        }
        System.out.println(Arrays.toString (ints));
    }
}