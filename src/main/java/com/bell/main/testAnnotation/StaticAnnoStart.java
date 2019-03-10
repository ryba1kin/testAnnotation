package com.bell.main.testAnnotation;

import com.bell.main.testAnnotation.anno.MyAnnoClass;
import com.bell.main.testAnnotation.anno.fabric.Fab;

public class StaticAnnoStart {
    public static void main(String[] args) {
        Fab fabric = new Fab();
        fabric.aClass = MyAnnoClass.class;
        fabric.print("theOneAnno");
    }
}
