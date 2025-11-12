package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {
        PerformSum performSum = new PerformSum();
        performSum.sum(2,3);

        performSum.sum(4,5,6);
        performSum.sum(3.45,8.90);
        performSum.sum(2.34f,1.23f);
        performSum.sum(3.45,2);
        performSum.sum(7.66f,5);
        performSum.sum(6.56,4.35f);
    }
}
