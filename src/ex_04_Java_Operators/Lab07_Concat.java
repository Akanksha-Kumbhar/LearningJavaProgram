package ex_04_Java_Operators;

public class Lab07_Concat {
    public static void main(String[] args) {
        String s1 = "Ak";
        String s2 = "patu";
        System.out.println(s1+s2); // joins

        int a1 = 10;
        int a2 = 20; // math
        System.out.println(a1+a2);
        System.out.println(s1+s2+a1+a2);
        System.out.println(a1+a2+s1+s2);
        System.out.println(s1+s2+(a1+a2));

    }
}
