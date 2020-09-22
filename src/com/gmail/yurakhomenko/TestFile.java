package com.gmail.yurakhomenko;

public class TestFile {

    @AnnotationOne(a = 5, b = 5)
    public static void sum(int a, int b) {
        System.out.println("Число а = " + a + ", число b = " + b );
        System.out.println();
        System.out.println("Сума чисел = " + (a + b));
        System.out.println("Різниця чисел = " + (a - b));
        System.out.println("Добуток чисел = " + (a * b));
        System.out.println("частка чисел = " + (a / b));
    }
}
