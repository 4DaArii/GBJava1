/**
 *Java 1. Lesson 1. Homework
 *
 *@Daria Vdovenko
 *@version Aug 12, 2018
 */
 
class HW_1{
	
	public static void main(String[] args){
		
		//Задание 2. Объявление и инициализация переменных изученных типов данных.
		byte a = 8;
		short b = 16;
		int c = 32;
		long d = 64;
		float e = 120.0f;
		double f = 15.72775;
		char g = 'g';
		boolean i = true;
		
		System.out.println(calculate(3, 7, 54, 9));
		System.out.println(SumInBorders(3, 4));
		NegativeOrPositive(7);
		System.out.println(IsNegative(0));
		HelloName("Sergey");
		LeapOrNot(2000);
	}
	
	/*Задание 3. Метод вычисляющий a * (b + (c / d))
	 *и возвращающий результат, 
	 *где a, b, c, d – входные параметры этого метода.
	 */
	public static int calculate(int a, int b, int c, int d){
		return a * (b + (c / d));
	}
	
	/*Задание 4. Метод, принимающий на вход два числа,
	 *и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
	 *если да – вернуть true, в противном случае – false.
	 */
	 public static boolean SumInBorders(int num_1, int num_2){
		int sum = num_1 + num_2;
		if ((sum >= 10) && (sum <= 20)){
			return true;
		} else{
			return false;
		}
	}
	
	/*Задание 5. Метод, которому в качестве параметра передается целое число, 
	 *метод должен напечатать в консоль положительное ли число передали, или отрицательное;
	 *Замечание: ноль считаем положительным числом.
	 */
	public static void NegativeOrPositive(int num){
		if (num < 0){
			System.out.println(num + " - negative number");
		} else{
			System.out.println(num + " - positive number");
		}
	}
	
	/*Задание 6. Метод, которому в качестве параметра передается целое число,
	 *метод должен вернуть true, если число отрицательное.
	 */
	public static boolean IsNegative(int num){
		if (num < 0){
			return true;
		} else{
			return false;
		}
	}
	
	/*Задание 7. Метод, которому в качестве параметра передается строка, обозначающая имя,
	 *метод должен вывести в консоль сообщение «Hello, указанное_имя!».
	 */
	public static void HelloName(String name){
		System.out.println("Hello, " + name + "!");
	}
	
	/*Задание 8. Метод, который определяет является ли год високосным,
	 *выводит сообщение в консоль. 
	 *Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
	 */
	public static void LeapOrNot(int year){
		if (year % 400 == 0){
			System.out.println(year + " - leap year");
		} else if ((year % 4 == 0) && (year % 100 != 0)){
			System.out.println(year + " - leap year");
		} else{
			System.out.println(year + " - not a leap year");
		}
	}
}