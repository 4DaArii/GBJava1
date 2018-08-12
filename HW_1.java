/**
 *Java 1. Lesson 1. Homework
 *
 *@Daria Vdovenko
 *@version Aug 12, 2018
 */
 
class HW_1{
	
	public static void main(String[] args){
		
		//Задание 2. Объявление и инициализация переменных изученных типов данных
		byte a = 8;
		short b = 16;
		int c = 32;
		long d = 64;
		float e = 120.0f;
		double f = 15.72775;
		char g = 'g';
		boolean i = true;
		
		System.out.println(calculate(3, 7, 54, 9));
	}
	
	//Задание3. Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,  где a, b, c, d – входные параметры этого метода
	public static int calculate(int a, int b, int c, int d){
		return a * (b + (c / d));
	}
	
}