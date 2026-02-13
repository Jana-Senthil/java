package pattern;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

//           n=4
//           *     1
//           **    2
//           ***   3
//           ****  4
//           ***   5
//           **    6
//           *     7
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=n;j++){
                if((i >= j && i < n) || (i > n && j <= 2*n-i) || i == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
