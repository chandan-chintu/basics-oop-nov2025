package classesandobject;

public class Demo {
    public static class Sample{
        public static int xyz=100;
    }

    public int abc=100; // non-static variable - object is needed
    public static int pqr=200;// static variable - object is not needed

    public void demo1(){ // if non static method then we can use both static and non static variables/methods inside it
        abc=200;
        pqr=500;
        System.out.println("Demo1 non static method");
    }

    public static void demo2(){// if static method then we can use only static variables/methods inside it
        //abc=400; since it is non static we cannot use here
        pqr=600;
        System.out.println("Demo2 static method");
    }
}
