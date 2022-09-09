// Подключаем библиотеку
import java.util.Scanner;

public class Kvadrat {

    public static int makePriamougolnik(int w, int l){
        for (int i = 0; i < l; i++) {

            for (int j = 0; j < w; j++) {

                if (j == 0 || j == w - 1 || i == 0 || i == l - 1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        return l;
    }

    public static void main(String[] args) {

        // Подключаем ввод с клавиатуры
        Scanner in = new Scanner(System.in);

        // Переменные
        int widht;
        int leight;

        // Вводим длину
        System.out.print("Введите длину квадрата: ");
        widht = in.nextInt();

        // Вводим высоту
        System.out.print("Введите высоту квадрата: ");
        leight = in.nextInt();

        makePriamougolnik(widht, leight);
    }
}