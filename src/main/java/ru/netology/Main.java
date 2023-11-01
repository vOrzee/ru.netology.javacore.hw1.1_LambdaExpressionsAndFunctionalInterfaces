package ru.netology;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);


        int c = calc.devide.apply(a, b);
        calc.println.accept(c);

        // Возникает ошибка от деления на 0 в целых числах, отлавливаем её и выводим сообщение
        // Как второй вариант можно перевести devide на Double, тогда исключение выброшено не будет и результат для остальных чисел будет более точным
        // Однако также придётся перевести на Double и Consumer println
    }
}