package com.bell.main.testAnnotation.anno.fabric;

import com.bell.main.testAnnotation.anno.MyField;

import java.lang.reflect.Field;

public class Fab {
    public  Class aClass;
    public void print(String string){
        try {
            for (Field field : aClass.getDeclaredFields()) {
                if(field.isAnnotationPresent(MyField.class) && field.getAnnotation(MyField.class).name().equalsIgnoreCase(string)) {
                    field.setAccessible(true);
                    System.out.println(field.get(aClass));
                }
            }
            System.out.println("end");
        } catch (Exception e) {
            System.out.println("произошел писец");
            System.out.println(e);
        }
    }
}
