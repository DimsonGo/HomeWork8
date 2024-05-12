import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Целочисленный массив");
        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        System.out.println(num[0] + ", " + num[1] + ", " + num[2]);


        System.out.println();
        System.out.println("Дробные числа в массиве");
        double[] doubleNum = {1.57, 7.654, 9.986};
        System.out.println(doubleNum[0] + ", " + doubleNum[1] + ", " + doubleNum[2]);


        System.out.println();
        System.out.println("Произвольный массив");
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        System.out.println(number[0] + ", " + number[1] + ", " + number[2] + ", " + number[3] + ", " + number[4]);


        System.out.println();
        System.out.println("Произвольный массив 2 версия");
        double numP[] = {1.65, 2.65, 3.65};
        for (int index1 = 0; index1 < numP.length; index1++) {
            if (index1 == numP.length - 1) {
                System.out.println(numP[index1]);
                break;
            }
            System.out.print(numP[index1] + " ");

        }
        // System.out.println(numP[0] + ", " + numP[1] + ", " + numP[2]);

        System.out.println();
        System.out.println("Задание 2 распечатать");


        //Тут исправил
        System.out.println("Задание 3 (Распечатать в обраном порядке элементы третьего массива)");
        System.out.println(num[2] + ", " + num[1] + ", " + num[0]);
        System.out.println(doubleNum[2] + ", " + doubleNum[1] + ", " + doubleNum[0]);
        System.out.println(number[4] + ", " + number[3] + ", " + number[2] + ", " + number[1] + ", " + number[0]);
        System.out.println(numP[2] + ", " + numP[1] + ", " + numP[0]);


        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num[i] += 0;
            } else {
                num[i] += 1;
            }
        }
        System.out.println(Arrays.toString(num));


    }
}