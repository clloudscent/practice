package starMaker;

import java.util.Scanner;

public class PrintStar01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for(int i =1; i<=line; i++){
            for(int j =1; j<=line-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
