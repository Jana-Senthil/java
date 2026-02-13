package pattern;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

//      n=4;
//           ****
//            ****
//             ****
//              ****
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
            for (int j = 1; j <=n+i-1; j++) {
//                System.out.print("* ");
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
