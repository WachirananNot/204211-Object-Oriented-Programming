//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;


class Drawing{
    
    public void drawTriangle(int N){
        String A ="*";
        for(int i = 0;i<N;i++){
            System.out.println(A);
            A += "*";
        }
        
    }

    public void drawTriangle(int N,char X){
        for(int j = N;j>0;j--){
            for(int k = 0;k<j;k++){
                System.out.print(X);
            }
            System.out.println();
        }
    }
        
}

public class Lab06_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Drawing myDrawing = new Drawing();

        System.out.print("Input N: ");
        int N = input.nextInt();
        input.nextLine();
        System.out.print("Input X: ");
        char X = input.nextLine().charAt(0);

        myDrawing.drawTriangle(N);
        myDrawing.drawTriangle(N, X);

    }
}
