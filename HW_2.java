/**
 * Java 1. Lesson 2. Homework
 *
 * @author Daria Vdovenko
 * @version dated Aug 16, 2018
 */

class HW_2 {
    public static void main(String[] args) {
        //call for task #1
        invertArray();
        
        //call for task #2
        addToArray();
        
        //call for task #3
        changeUnderSix();
        
        //call for task #4
        diagUnit();
        
        //call for task #5
        arrMinMax();
    }
    
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     *    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {
        System.out.println("Задание 1 ");
        int[] arr = { 0, 1, 1, 0, 1, 0, 1, 0, 1, 1 };//length = 8
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] == 1)? 0 : 1);
        }
        System.out.println();
    }
    
    /**
     * 2. Задать пустой целочисленный массив размером 8.
     *    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void addToArray() {
        System.out.println("Задание 2 ");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] = i * 3) + " ");
        }
        System.out.println();
    }
    
    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
     *    пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void changeUnderSix() {
        System.out.println("Задание 3 ");
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + ((arr[i] < 6)? (arr[i] * 2) : arr[i]));
        }
        System.out.println();
    }
    
    /**
     * 4. Создать квадратный двумерный целочисленный массив,
     *    и с помощью цикла заполнить его диагональные элементы единицами;
     */
    public static void diagUnit() {
        System.out.println("Задание 4 ");
        int[][] arr = new int[5][5];
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if ((i == j) || (j == 4 - i)) {
                    arr[i][j] = 1;
                }
            System.out.print(arr[i][j]);
            }
        System.out.println();
        }
    }
    
    /**
     * 5. Задать одномерный массив,
     *    найти в нем минимальный и максимальный элементы
     */
    public static void arrMinMax() {
        System.out.println("Задание 5 ");
        int[] arr = { 3, 8, -4, 0, 1, 11, -23, 14, 5, 8 };//min = -23; max = 14
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
    System.out.println("Min = " + min + "; Max = " + max);
    }
}