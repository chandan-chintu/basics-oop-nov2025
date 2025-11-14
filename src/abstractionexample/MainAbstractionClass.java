package abstractionexample;

public class MainAbstractionClass {
    public static void main(String[] args) {
        //we cannot create object for abstract classes, we have to create object for child classes and use them
        AbstractionChild abstractionChild = new AbstractionChild();
        abstractionChild.demo2();
        abstractionChild.demo1();
    }
}
