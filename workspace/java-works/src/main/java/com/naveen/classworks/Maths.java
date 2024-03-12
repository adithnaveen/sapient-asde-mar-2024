package com.naveen.classworks;

// this class work for int, float, double, short byte
// will not work for string, Employee, Customer...
public class Maths <T1 extends  Number,
        T2 extends  Number> {
    private T1 t1;
    private T2 t2;


    public Maths(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public double value() {
        return t1.doubleValue() + t2.doubleValue();
    }

}
