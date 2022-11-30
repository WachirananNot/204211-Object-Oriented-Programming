//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
public class Lab01_4_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        int numA = 0 , numB = 0;
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        
        
        System.out.println("Enter Array A");
        for(int cA = 0;cA<5;cA++){
            A[cA] = Input.nextInt();
        }
        
        System.out.println("Enter Array B");
        for(int cB = 0;cB<5;cB++){
            B[cB] = Input.nextInt();
        }

        
        int coA = 0,coB = 0,coC = 0;
        while(true){
            if(coA>=5){
                for(int j= coB ; j<5 ; j++){
                    C[coC] = B[j];
                    coC += 1;
                }
                break;
            }else if(coB>=5){
                for(int i = coA;i<5;i++){
                    C[coC] = A[i];
                    coC += 1;
                }
                break;
            }
            
            if(A[coA]==B[coB]){
                C[coC] = A[coA];
                C[coC+1] = B[coB];
                coC += 2;
                coA += 1;
                coB += 1;
                continue;
            }else if(A[coA]<B[coB]){
                C[coC] = A[coA];
                coC += 1;
                coA += 1;
                continue;
            }else if(A[coA]>B[coB]){
                C[coC] = B[coB];
                coC += 1;
                coB += 1;
                continue;
            }
        }
        
        
        for(int n = 0;n<10;n++){
            System.out.print(C[n]+" ");
        }
    }
}
