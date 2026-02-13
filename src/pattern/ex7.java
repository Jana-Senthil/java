package pattern;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
//           n=4
//           ******
//           *    *
//           *    *
//           ******

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n+2; j++) {
                if(i ==0 || i == n-1|| j == 1 || j == n+2){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();

        }
    }
}
