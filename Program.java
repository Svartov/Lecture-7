// Подключаем бибилиотеки
import java.util.Random;
import java.util.Arrays;

public class Program {

    public static int[] randomArray(int num[]){
        Random rn = new Random();
        for(int i = 0; i < num.length; i++){
            num[i] = rn.nextInt(200); // Заполняем массив случайными числами, максимальным значением 200.
        }
        return num;
    }

    public static int maxArray(int num[]){
        int max = 0;
        for(int i = 0; i < num.length; i++){
            if(max < num[i]){
                max = num[i]; // Приписываем 0-му элементу значение максимального элеменнта.
            }
        }
        return max;
    }

    public static void main(String[] args){

        Random rn = new Random(); // Подключаем рандом
        int[] number = new int[rn.nextInt(20)];// Создаём массив целых чисел с рандомным размером
        int max; // Переменная максимального значения

        // Выводим массив случайных чисел
        randomArray(number);
        System.out.println(Arrays.toString(number));

        // Выводим максимальное значение массива
        max = maxArray(number);
        System.out.println("Максимальное значение: " + max);
    }
}
