import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Challange3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter number that you want stars number in middle");
        int a =input.nextInt();
        for (int i = 0; i <a/2 ; i++) {
            System.out.println(" ");
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }

            
        }
    }
}
