package com.tpc.generics.mainpackage.generics;
/**
 *
 * @author michael
 */
public class MainClass {
    
    private MyGenericCache cache;
    
    public static void main(String args[]) {
        MainClass mc = new MainClass();
        
        mc.cache = new MyGenericCache();
        
        mc.cache.addElem("AuthorName", "Michael");
        mc.cache.addElem("TestNumber", 123);
        mc.cache.addElem(123, "Qwerty");
        
        System.out.println(mc.cache.getElem("AuthorName"));
        System.out.println(mc.cache.getElem("TestNumber"));
        System.out.println(mc.cache.getElem(123));
        
        System.out.println();
        
        mc.printMeow(mc.getValue("TestNumber"));
        mc.printMeow(mc.getValue(123));
        //mc.printMeow(mc.<?, ?>getValue(123));
        //System.out.println(mc.<Integer, String>getValue(123));
        //System.out.println(mc.<String, Integer>getValue("TestNumber"));
    }
    
    public <K> Object getValue(Object key) {
        return cache.getElem((K)key);
    }
    
    public <V> void printMeow(Object obj) {
        System.out.println((V)obj);
    }
}
