//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;

class BMI{
    private int weight,height;
    private char sex;
    private String name;
    private int dif;

    public void setData(int i){
        Scanner input = new Scanner(System.in);
        System.out.println("Input data for person #"+i);
        System.out.print("Input name : ");
        name = input.nextLine();

        System.out.print("Input height: ");
        height = input.nextInt();

        System.out.print("Input weight: ");
        weight = input.nextInt();
        input.nextLine();

        do{
            System.out.print("Input sex: ");
            sex = Character.toLowerCase(input.nextLine().charAt(0));
        }while(sex != 'f' && sex != 'm');
        System.out.println();
        
    }

    public String getName(){
        return name;
    }

    public void calDif(){
        if(sex == 'f'){
            dif = Math.abs(weight-(height-110));
        }else if(sex == 'm'){
            dif = Math.abs(weight-(height-100));
        }
    }

    public int getDif(){
        return dif;
    }
}

public class Lab06_2_630510642 {
    public static void main(String[] args) throws Exception {
        BMI bmi1,bmi2;
        bmi1 = new BMI();
        bmi1.setData(1);
        bmi1.calDif();

        bmi2 = new BMI();
        bmi2.setData(2);
        bmi2.calDif();

        compare(bmi1, bmi2);
    }

    static void compare(BMI b1,BMI b2){
        int dif1,dif2;
        String name1,name2;
        name1 = b1.getName();
        name2 = b2.getName();

        dif1 = b1.getDif();
        dif2 = b2.getDif();
        
        if(dif1 == dif2){
            System.out.println("The weight of both of them are close to the standard weight equally.");
        }else if(dif1 > dif2){
            System.out.println("Weight of "+name2+" is closer to standard weight than "+name1+".");
        }else{
            System.out.println("Weight of "+name1+" is closer to standard weight than "+name2+".");
        }
    } 

    
}
