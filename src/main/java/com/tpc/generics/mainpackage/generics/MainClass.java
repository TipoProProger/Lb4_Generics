package com.tpc.generics.mainpackage.generics;

/**
 *
 * @author michael
 */
public class MainClass {
    public static void main(String args[]) {
        MyGenericCache cache = new MyGenericCache();
        
        cache.addElem("AuthorName", "Michael");
        cache.addElem("TestNumber", 123);
        cache.addElem(123, "Qwerty");
        
        System.out.println(cache.getElem("AuthorName"));
        System.out.println(cache.getElem("TestNumber"));
        System.out.println(cache.getElem(123));
    }
}
