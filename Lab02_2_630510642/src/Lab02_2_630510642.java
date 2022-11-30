//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
public class Lab02_2_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = Input.nextInt();
        int Q1 = 0,Q2 = 0,Q3 = 0,Q4 = 0,X = 0,Y = 0,Ori = 0;
        for(int i = 1; i<= N; i++){
            System.out.print("Enter point #"+i+": ");
            int x = Input.nextInt();
            int y = Input.nextInt();
            int CODE = checkQuadrant(x, y);
            if(CODE == 1){
                Q1 += 1;
            }else if(CODE == 2){
                Q2 +=1 ;
            }else if(CODE == 3){
                Q3 += 1;
            }else if(CODE == 4){
                Q4 += 1;
            }else if(CODE == 5){
                X += 1;
            }else if(CODE == 6){
                Y += 1;
            }else if(CODE == 7){
                Ori += 1;
            }
        }
        System.out.println("Number of points in Qaudrant 1 = "+Q1);
        System.out.println("Number of points in Qaudrant 2 = "+Q2);
        System.out.println("Number of points in Qaudrant 3 = "+Q3);
        System.out.println("Number of points in Qaudrant 4 = "+Q4);
        System.out.println("Number of points on X axis = "+X);
        System.out.println("Number of points on Y axis = "+Y);
        System.out.println("Number of points on origin point = "+Ori);
    }
    
    
    public static int checkQuadrant(int x,int y){
        int num = 0;
        if(x == 0 && y == 0){
            num = 7;
        }else if(y == 0){
            num = 6;
        }else if(x == 0){
            num = 5;
        }else if(x > 0 && y < 0){
            num = 4;
        }else if(x < 0 && y < 0){
            num = 3;
        }else if(x < 0 && y > 0){
            num = 2;
        }else if(x > 0 && y > 0){
            num = 1;
        }
        return num;

    }
}
