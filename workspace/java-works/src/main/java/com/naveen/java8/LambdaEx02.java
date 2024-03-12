package com.naveen.java8;

// only for understanding

abstract class  Room {

    public abstract  void myAbstractMethod ();
    public void myConcreteMethod () {
        System.out.println("You can have any implemention ");
    }
}

@FunctionalInterface
interface Operation {
    public int operate(int num1, int num2);

    public default  void tools () {
        System.out.println("This is default mehtod in interface... ");
    }
}





public class LambdaEx02 {
    public static void main(String[] args) {
        Operation add = (num1,num2) -> num1 + num2;
        Operation sub = (num1, num2) -> num1 - num2;
        Operation mul = (num1, num2) -> num1 * num2;
        Operation div = (num1, num2) -> num1 / num2;

//        callmathswork01(add, sub, mul);

        int addResult = mathsOperation(10, 20, add);
    }

    private static void callmathswork01(Operation add, Operation sub, Operation mul) {
        int additionResult = add.operate(10,20);
        System.out.println("Addition Result : " + additionResult);

        int substractionResult = sub.operate(20, 10);
        System.out.println("Substraction Result " + substractionResult);

        int multiplicationResult = mul.operate(22,22);
        System.out.println("Multiplication result " + multiplicationResult);
    }

    public static int mathsOperation(int num1, int num2,
                                     Operation operation) {
        return operation.operate(num1, num2);
    }


}
