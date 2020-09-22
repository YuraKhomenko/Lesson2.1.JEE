package com.gmail.yurakhomenko;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> cls = TestFile.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AnnotationOne.class)) {
                AnnotationOne ant = method.getAnnotation(AnnotationOne.class);
                method.invoke(null, ant.a(), ant.b());
            }
        }
    }
}
