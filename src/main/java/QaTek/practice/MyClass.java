package QaTek.practice;

public class MyClass {

    int a;
    int b;
    int c;
    int d;
    int e;

    // First Constructor
    public MyClass(){

        a = 10;
        b = 15;
        c = 20;
        d = 25;
        e = 30;
    }

    // Second Constructor
    /* public MyClass(int objectA, int objectB, int objectC, int objectD, int objectE){

        a = objectA;
        b = objectB;
        c = objectC;
        d = objectD;
        e = objectE;
    } */

    // Third Constructor
    public MyClass(int a, int b, int c, int d, int e){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public static void main(String[] args){

        MyClass myObj = new MyClass();
/*
        myObj.a = 10;
        myObj.b = 15;
        myObj.c = 20;
        myObj.d = 25;
        myObj.e = 30;
*/
        System.out.println("a = " + myObj.a);
        System.out.println("b = " + myObj.b);
        System.out.println("c = " + myObj.c);
        System.out.println("d = " + myObj.d);
        System.out.println("e = " + myObj.e);

        MyClass myObj1 = new MyClass();

        System.out.println("myObj1 a = " + myObj1.a);
        System.out.println("myObj1 b = " + myObj1.b);
        System.out.println("myObj1 c = " + myObj1.c);
        System.out.println("myObj1 d = " + myObj1.d);
        System.out.println("myObj1 e = " + myObj1.e);


        MyClass myObj3 = new MyClass(101, 103, 119, 125, 137);

        System.out.println("myObj3 a = " + myObj3.a);
        System.out.println("myObj3 b = " + myObj3.b);
        System.out.println("myObj3 c = " + myObj3.c);
        System.out.println("myObj3 d = " + myObj3.d);
        System.out.println("myObj3 e = " + myObj3.e);

        MyClass myObj4 = new MyClass(223, 219, 287, 256, 201);

        System.out.println("myObj4 a = " + myObj4.a);
        System.out.println("myObj4 b = " + myObj4.b);
        System.out.println("myObj4 c = " + myObj4.c);
        System.out.println("myObj4 d = " + myObj4.d);
        System.out.println("myObj4 e = " + myObj4.e);
    }

}
