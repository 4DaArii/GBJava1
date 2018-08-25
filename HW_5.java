/**
 * Java 1. Lesson 5. Homework
 *
 * @author Daria Vdovenko
 * @version dated Aug 25, 2018
 */

class HW_5 {
    public static void main(String[] args) {
        // array of Workers
        Worker[] staff = new Worker[5];
        staff[0] = new Worker("Ivanov Ivan", "programmer", "iva@gmail.com",
                              "89935648392", 32000, 29);
        staff[1] = new Worker("Petrov Peter", "cleaner", "peter@gmail.com",
                              "89535478432", 15000, 41);
        staff[2] = new Worker("Vasiliev Vasiliy", "engineer", "vvvasiliev@gmail.com",
                              "89547833225", 53000, 45);
        staff[3] = new Worker("Smirnov Igor", "developer", "igogogor@gmail.com",
                              "89075438875", 41000, 38);
        staff[4] = new Worker("Kuznetsov Artyom", "tester", "artyomovich@gmail.com",
                              "89678844660", 35000, 24);

        /* test for setAge()*/
           staff[4] = new Worker("Kuznetsov Artyom", "tester", "artyomovich@gmail.com",
                                 "89678844660", 35000, -8);
         


        // find workers older 40 and display them
        for (int i = 0; i < 5; i++) {
            if (staff[i].getAge() > 40)
                staff[i].printInfo();
        }
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

class Worker {
    private String name;
    private String position;
    private String email;
    private String number;
    private int pay;
    private int age;

    // parameterized constructor
    Worker(String name, String position, String email,
              String number, int pay, int age) {
        this.name     = name;
        this.position = position;
        this.email    = email;
        this.number   = number;
        this.pay      = pay;
        this.age      = age;
    }

    // displays information of Worker in the console
    void printInfo() {
        System.out.println(name + " ( " + age + " y.o.) :" + position + ", " +
                           pay + ", " + email + ", " +number);
    }

    String getName() {
        return name;
    }

    String getPosition() {
        return position;
    }

    String getEmail() {
        return email;
    }

    String getNumber() {
        return number;
    }

    void setPay(int pay) {
        if (pay > 0)
            this.pay = pay;
        else
            System.out.println("Incorrect age for " + this.name);
    }

    int getPay() {
        return pay;
    }

    void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}


