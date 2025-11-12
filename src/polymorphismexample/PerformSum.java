package polymorphismexample;

public class PerformSum {

    public void sum(int a, int b){
        System.out.println("sum of two int nos : "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three int nos : "+(a+b+c));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double nos : "+(a+b));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float nos : "+(a+b));
    }

    public void sum(double a, int b){
        System.out.println("sum of one int and one double nos : "+(a+b));
    }

    public void sum(float a, int b){
        System.out.println("sum of one float and one int nos : "+(a+b));
    }

    public void sum(double a, float b){
        System.out.println("sum of one double and one float nos : "+(a+b));
    }
}
