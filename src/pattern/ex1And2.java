package pattern;

import java.util.Scanner;

public class ex1And2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
///*
//*   output
//*                1
//             2   6
//         3   7   10
//     4   8   11  13
// 5   9   12  14  15
//* */
//
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("    "); // spacing for alignment
            }

            int num = i;

            // Print numbers in row
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", num);
                num += (n - j);
            }

            System.out.println();
        }

//        output
//        18
//        2 -> 4
//        4 -> 3
//        21 -> 5
//
//        Process finished with exit code 0



        int[] a= {1,1,2,2,2,2,3,4,4,4,4,5,10,21,21,21,21,21};
        int l= a.length;
//        System.out.println(l);
        int n1 = 3,m=0;
        int[][] result=  new int[l][l];
        for(int i =1;i<l;i++){
            if(a[i-1]==a[i]){
                m++;
            }else{
                if(m >= n1){
                    System.out.println(a[i-1] +" -> "+ m);
                    m=0;
                }
            }
        }
        if(a[l-2] == a[l-1] && m >= n1-1){
            System.out.println(a[l-2] +" -> "+ ++m);
        }

    }
}
