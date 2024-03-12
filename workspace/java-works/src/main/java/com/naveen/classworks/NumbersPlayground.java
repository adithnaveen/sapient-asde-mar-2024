package com.naveen.classworks;





public class NumbersPlayground {

    public static void main(String[] args) {

        Maths<Integer, Integer> mm1 = new Maths<>(10,20);
        System.out.println(mm1.value());

        Maths<Float, Float> mm2 = new Maths<>(23.4f, 55.6f);
        System.out.println(mm2.value());

        // handling at compile time only
//        Maths<String, String> mm3 = new Maths<String, String>("Naveen", "kumar");
    }
}
