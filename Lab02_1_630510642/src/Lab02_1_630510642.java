//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
public class Lab02_1_630510642 {
    public static void main(String[] args) throws Exception {
        char ch;
        int number;
        Scanner input_ = new Scanner(System.in);

        System.out.print("Enter Alphabet: ");
        ch = input_.nextLine().charAt(0);

        do{
            System.out.print("Enter Number: ");
            number = input_.nextInt();
        }while(number<2 || number>10);

        if(Character.toLowerCase(ch)=='a'){ //if((ch=='A')||(ch=='a'))
            printStarA(number);
        }else if(Character.toLowerCase(ch)=='b'){
            printStarB(number);
        }else{
            System.out.print("Goodbye");
        }
        
    }
    public static void printStarA(int n){
        for(int i = n; i > 0; i--){
            for(int j = 1;j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void printStarB(int n){
        for(int i = n; i > 0; i--){
            for(int k = 1;k<i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j <= n - (i-1) ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
