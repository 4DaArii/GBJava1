/**
 * Java 1. Lesson 2. Homework
 *
 * @author Daria Vdovenko
 * @version dated Aug 15, 2018
 */

class HW_2 {
    public static void main(String[] args) {
        //call for task #1
        invertArray();
        
        //call for task #2
        addToArray();
    }
    
    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     *    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0, 1, 1};//length = 8
        for (int i = 0; i < arr.length; i++){
            System.out.print((arr[i] == 1) ? 0 : 1);
        }
        System.out.println();
    }
    
    /**
     * 2. Задать пустой целочисленный массив размером 8.
     *    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    public static void addToArray(){
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            System.out.print((arr[i] = i * 3) + " ");
        }
        System.out.println();
    }
    
}