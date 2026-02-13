package pattern;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {

//           n=4
//           *******
//            *   *
//             * *
//              *

        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                if(i == 0  || j==i || j == 2*n-i-2){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
