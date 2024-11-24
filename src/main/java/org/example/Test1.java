package org.example;

public class Test1 {

    private int a=0;

    public int getA(){
        return a;
    }

    public Test1(){

    }

    public void setA(int a){
        this.a = a;
    }

    public static void test(Test1 t){
        t = new Test1();
        t.setA(100);
    }

    public static void main(String[] args) {
        Test1 t=null;

        test(t);
        System.out.println(t.getA());
    }


}
