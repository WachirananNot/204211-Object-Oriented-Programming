//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
class Parking{
    private char type;
    private int minute;
    private double cost;

    public void setData(int i){
        System.out.println("Enter data for vehicle parking #"+i);
        Scanner inVar = new Scanner(System.in);
        do{
            System.out.print("Enter vehicle type: ");
            type = Character.toLowerCase((inVar.nextLine().charAt(0)));
        }while(type != 'c' && type != 'm');
        
        System.out.print("Enter minute: ");
        minute = inVar.nextInt();
    }

    public void calCost(){
        if(type=='c'){
            cost = 0;
            if(minute>=241){
                cost += (minute-240)*0.25;
                minute = 240;
            }if(minute>=121 && minute <= 240){
                cost += ((minute%121)+1)*0.50;
                minute = minute - ((minute%121)+1);
            }if(minute>=61 && minute <= 120){
                cost += ((minute%61)+1)*0.75;
                minute = minute - ((minute%61)+1);
            }if(minute>=1 && minute<=60){
                cost += minute;
            }
        }else{
            double dm = minute;
            cost = Math.ceil(dm/60) *5;
        }
    }

    public void printResult(){
        System.out.printf("Cost = %.2f baht(s)",cost);
        System.out.println();
        System.out.println();
    }

}

public class Lab03_2_630510642 {
    public static void main(String[] args) throws Exception {
        Parking car1,car2;

        car1 = new Parking();
        car1.setData(1);
        car1.calCost();
        car1.printResult();

        car2 = new Parking();
        car2.setData(2);
        car2.calCost();
        car2.printResult();

    }
}
