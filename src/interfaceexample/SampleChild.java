package interfaceexample;

import classesandobject.Demo;

public class SampleChild extends DemoClass implements SampleInterface, SampleInterface2{
    @Override
    public void sample1() {
        System.out.println("sample1 implementation inside SampleChild");
    }

    @Override
    public void sample2() {
        System.out.println("sample2 implementation inside SampleChild");
    }

    @Override
    public void sample3() {
        System.out.println("sample3 implementation inside SampleChild");
    }



    @Override
    public void sample5() {
        System.out.println("sample5 implementation inside SampleChild");
    }

    @Override
    public void sample6() {

    }
}
