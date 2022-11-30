//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;
public class Lab01_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        int A,B,C, NewA ,NewB, sum = 0;
        System.out.print("Enter A: ");
        A = sn.nextInt();

        System.out.print("Enter B: ");
        B = sn.nextInt();

        System.out.print("Enter C: ");
        C = sn.nextInt();
        
        System.out.print(A+" ");
        System.out.print(B+" ");
        sum = (A*A)+(B*B);
        while(sum<=C){
            System.out.print(sum+" ");
            NewA = B;
            A = NewA;
            B = sum;
            sum = (A*A)+(B*B);
        }
        
    }
}
