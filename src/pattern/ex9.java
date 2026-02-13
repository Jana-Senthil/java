package pattern;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

//           n=4
//           ****
//          ****
//         ****
//        ****
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+n-i;j++){
                if(j > n-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
