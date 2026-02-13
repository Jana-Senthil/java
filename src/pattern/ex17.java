package pattern;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

//             n=4
//             *
//            ***
//           *****
//          *******
//           *****
//            ***
//             *
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for (int i = 1; i <= n*2-1; i++) {
            for (int j = 1; j <= n*2-1; j++) {
                if((i <=n && j >= n-i+1 && j < n+i) || ( i > n && j > i-n && j < 2*n-(i-n) )){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
