//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
public class Lab02_3_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = Input.nextInt();
        boolean check1,cheack2;
        check1 = checkOddEven(N);
        cheack2 = checkPrime(N);
        if(check1 == true){
            System.out.println(N+" is even number.");
        }else{
            System.out.println(N+" is odd number.");
        }
        if(cheack2 == true){
            System.out.println(N+" is prime number.");
        }else{
            System.out.println(N+" is not prime number.");
        }
    }
    
    public static boolean checkOddEven(int N){
        if(N%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkPrime(int x){
        int i = 2;
        int y = x;
        while(i <= Math.sqrt(x)){
            while(x%i == 0){
                if(x != i){
                    x = x/i;
                    continue;
                }else{
                    break;
                }
            }
            i += 1;
        }
        if(y == x){
            return true;
        }else{
            return false;
        }
    }
}
