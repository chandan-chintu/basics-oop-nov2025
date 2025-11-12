package classesandobject;

public class MainClass {

     static class Simple{
         public static int mno=900;
    }
    public static void main(String[] args) {
        System.out.println("Hello everyone, welcome to Spring module1");

        // create objects
        Student student1 = new Student(); // create a object of student class
        System.out.println("student1 before assigning values is : "+student1);

        // assigning values
        student1.id = 123;
        student1.name = "Ajay K";
        student1.dob = "12/12/2010";
        student1.grade = "10th grade";
        student1.email = "ajay123@gmail.com";
        System.out.println("student1 after assigning values is : "+student1);

        // it will create object and assign values in parameterized constructor
        Student student2 = new Student(222,"Vijay K","12/12/2010","vijay123@gmail.com","10th grade");
        System.out.println("student2 is : "+student2);

        //static examples
        Demo demo1 = new Demo();
        System.out.println("abc is : "+demo1.abc);
        System.out.println("pqr is : "+Demo.pqr);
        demo1.demo1();
        Demo.demo2();

        Simple simple = new Simple();
        Simple.mno=800;

        Demo.Sample sample = new Demo.Sample();
        Demo.Sample.xyz =400;

        int aaa=900;
        final int bbb=800;
        System.out.println("aaa is : "+aaa);
        System.out.println("bbb is : "+bbb);

        aaa=400;
        //bbb=300; cannot change its value

    }
}
