package com.company;

import java.util.Arrays;

public class tmp {
    private static String tab = "";

    public static void main(String[] args) {
//        exampleTabRecursion();

    }

    private static void exampleTabRecursion() {
        tab += '\t';
        System.out.println("Check use new functionality" );
        System.out.println(tab + "Tab" );
        tab += '\t';
        System.out.println(tab + "Tab" );
//        System.out.println(tab + tab.length());
        tab = tab.substring(0, tab.length() - 1);
        System.out.println(tab + "Tab" );
    }
}

class A {
    A(int k) {}
}
class B extends A {
    B() {this(0);}
    B(int k) {super(0);}
}

