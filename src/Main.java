
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        VivodMassivaDefinedLength();

    }

    public static void VivodMassivaDefinedLength() {
        int n = 5; //length of massiv cde332wq

        Scanner scan = new Scanner(System.in); // считывает значения с консли
        String[] array = new String[n];// выделяем память под новый массив strok размера n
        System.out.println("please input 5 numbers with different length  ");
        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextLine();

        }
        System.out.println("Your massiv is next"); // выводим массив

        System.out.println(Arrays.toString(array));

        /**Найти самое короткое и самое длинное число. Вывести найденные числа и их длину*/



        int MinLength = array[0].length();
        int short = array [i];
        //String short = null;// define short string

        for (int i = 0; i < array.length ; i++) {

            // int MinLength = array[0].length();// define min length of word
            // define min length of word

            if (MinLength < array[i].length()) {

                MinLength = array[i].length();
                short = array[i];

            }


        } System.out.println("MinLength = "  + MinLength + "short digit is =" + short);

       /* int minLenght = myStrings[0].length();
        int word = 0;
        for (int i = 1; i < myStrings.length; i++) {
            if (myStrings[i].length() < minLenght) {
                word = i;
            }
        }
        System.out.printf("Самое короткое слово: " +  myStrings[word] + " его длина: %d\n", myStrings[word].length()); */
    }








    }


            }














/*  ввести n чисел с консоли
1.
2. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

3. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.

4. Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.

5. Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.

6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элемен-

тов матрицы в интервале значений от -n до n с помощью датчика случайных чи-

сел.

9.1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений.

9.2. Выполнить циклический сдвиг заданной матрицы на k позиций вправо

(влево, вверх, вниз).

9.3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

9.4. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.

9.5. Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.

9.6 Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.

9.7. Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.

9.8. Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю располагались после всех остальных */
