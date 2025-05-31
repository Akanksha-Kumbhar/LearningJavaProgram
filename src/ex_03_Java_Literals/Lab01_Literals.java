package ex_03_Java_Literals;

public class Lab01_Literals {
    public static void main(String[] args) {
        int age = 50;
        // literals integral

        final float PI = 3.14f;
        // literals float

        final int girl_age = 18;
        // literal integral

        boolean Akanksha_is_married_or_not = false;
        // literals boolean

        char c1 = 'A';
        // literals characters
        System.out.println(c1);

        //Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("akanksha" + new_line + "kumbhar");
        System.out.println("akanksha\nkumbhar");
        System.out.println("akanksha" + tab_line + "kumbhar");
        System.out.println("akanksha" + back_space + "kumbhar");
        System.out.println("akanksha\rkumbhar");
        System.out.println();

    }
}
