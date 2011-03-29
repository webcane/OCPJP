package ru.habrahabr.blogs.java.ocpjp2.question4;

/**
 * Что будет выведено?
 * 1. А 4
 * 2. A A
 * 3. 0 4
 * 4. 4 4
 * 5. другой ответ
 */
public class B extends A {

    int i = Math.round(3.5f);

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }

}

/**
 * Метод print() переопределен в классе B. Соответственно, выбор метода осуществляется по типу актуального объекта.
 * Когда создается объект класса B, сначала вызывается конструктор A, который вызывает метод print().
 * Поскольку мы создаем объект класса B, вызывается версия print() из класса B. В это время переменной i еще не
 * присвоено значение, поэтому выводится значение по умолчанию (0).
 * Ну и в последствии выводится проинициализированное значение i. В результате получаем ответ 0 4.
 */