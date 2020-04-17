package com.company;

public class Plimorphysm {
    public static void main(String[] args) {
        Parent parent = new Parent();
        func((Child) parent);
    }

    private static void func(Child ref) {
    }
}

class Parent {}
class Child extends Parent {}
class ChildA extends Parent {}
class ChildB extends Parent {}
