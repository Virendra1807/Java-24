package com.accessspecifier;

public class AS2 {
    public static void main(String[] args) {
        AccessSpecifier obj = new AccessSpecifier();
        System.out.println("Public Can be access Anywhere : " + obj.a);
//        System.out.println("Private Only Access Within Same Class: " + obj.b);
        System.out.println("Protected can be access within package and beyond package is using class is Child class : " + obj.c);
        System.out.println("Default can be access within package only  : " + obj.d);
    }
}
