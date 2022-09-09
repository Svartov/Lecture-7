// Подклюсаем бибилиотеки.
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Lineseaursh {

    public static int[] randomArray(int num[]){
        Random rn = new Random(); // Подключаем рандом
        for(int i = 0; i < num.length; i++){
            num[i] = rn.nextInt(10);
        }
        return num; // Возвращаем рандомный массив
    }

    public static int seaurchIndex(int num[], int sum){
        for(int i = 0; i < num.length; i++){
            if(num[i] == sum){
                return i; // Возвращаем номер элемента.
            }
        }
        return -1; // Возвращаем -1. так как нету данного элемента.
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in); // Подключаем ввод с клавиатуры.
        Random rn = new Random(); // Подключаем рандом.

        // Переменные //
        int [] number = new int[rn.nextInt(20)];
        int sum = 0;

        System.out.print("Какой элемент массива нужно найти?: " );
        sum = in.nextInt();

        // Выводим готовый массив на консоль.
        randomArray(number);
        System.out.println(Arrays.toString(number));

        // Выводим готовый элемент на консоль.
        sum = seaurchIndex(number,sum);
        System.out.println(sum);
    }
}
