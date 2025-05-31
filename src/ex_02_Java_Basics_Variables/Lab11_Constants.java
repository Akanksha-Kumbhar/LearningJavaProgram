package ex_02_Java_Basics_Variables;

public class Lab11_Constants {
    public static void main(String[] args) {
        final int a = 10;
        //a = 20; java cannot assign a value to a final variable
        System.out.println(a);
        System.out.println(a);

        final float PI = 3.14f;
        final float PI1 = 3.14f;
        final float PI2 = 3.14f;// we can create a final variable multiple time but cannot modify
        //PI = 90;
        System.out.println(PI);
    }
}
