/**
 * Java 1. Lesson 5. Homework
 *
 * @author Daria Vdovenko
 * @version dated Aug 25, 2018
 */

class HW_5 {
    public static void main(String[] args) {
        Associate worker1 = new Associate("Ivan", "programmer", "iva@gmail.com",
                                          "89935648392", 32000, 29);
        worker1.printInfo();
    }
}

/**
 * 1. Создать класс "Сотрудник" с полями: ФИ, должность,
 *    email, телефон, зарплата, возраст;
 *    Конструктор класса должен заполнять эти поля при создании объекта;
 *      Внутри класса «Сотрудник» написать метод,
 *      который выводит информацию об объекте в консоль; 
 *    Создать массив из 5 сотрудников.
 *    С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */
class Associate {
    String name;
    String position;
    String email;
    String number;
       int pay;
       int age;

    // parameterized constructor
    Associate(String name, String position, String email,
              String number, int pay, int age) {
        this.name     = name;
        this.position = position;
        this.email    = email;
        this.number   = number;
        this.pay      = pay;
        this.age      = age;
    }

    void printInfo() {
        System.out.println(name + ": " + position + ", " + email + ", " +
                           number + ", " + pay + ", " + age);
    }
}


