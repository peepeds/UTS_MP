package No1;

import No1.ExampleClass;

public class Main {

    public static void main(String[] args) {
        ExampleClass ex = new ExampleClass();
        int x , y , hasil ;
        String kata ;
        // implementasi / pemanggilan num
        x = ExampleClass.num;
        // implementasi / pemanggilan num2
        y = ex.num2;
        // implementasi / pemanggilan method calc
        hasil = ExampleClass.calc(3,2);
        // implementasi / pemanggilan method echo
        kata = ex.echo("Halo");

        System.out.println("Num \t: " + x);
        System.out.println("Num2 \t: " + y);
        System.out.println("Calc \t: "+ hasil);
        System.out.println("Echo \t: " +kata);
    }
}