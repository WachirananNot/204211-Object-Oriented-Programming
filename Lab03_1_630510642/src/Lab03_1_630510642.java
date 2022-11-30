//630510642 วชิรนันท์ พวงปัญญา


import java.util.Scanner;
class Human{
    private float weight;
    private float height;
    private char gender;
    private String shape;
    
    public void setData(){
        Scanner inVar = new Scanner(System.in);

        do{
            System.out.print("Enter gender: ");
            gender = Character.toLowerCase(inVar.nextLine().charAt(0));
        }while(gender!= 'm' && gender != 'f');
        

        System.out.print("Enter weight: ");
        weight = inVar.nextFloat();

        System.out.print("Enter height: ");
        height = inVar.nextFloat();
    }

    public void calShape(){
        if(gender == 'm'){
            if(weight<=(height-100)){
                shape = "Your shape is OK.";
            }else{
                shape = "Your shape is not OK.";
            }
        }else if(gender == 'f'){
            if(weight<=(height-110)){
                shape = "Your shape is OK.";
            }else{
                shape = "Your shape is not OK.";
            }
        }
    }

    public void printResult(){
        System.out.print(shape);
    }
}    
public class Lab03_1_630510642 {
    public static void main(String[] args) {
        Human h = new Human();
        h.setData();
        h.calShape();
        h.printResult();
    }
    
}
