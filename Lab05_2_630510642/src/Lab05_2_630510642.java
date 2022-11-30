//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;
class Box{
    private String name;
    private float width;
    private float length;
    private float height;

    public Box(String s,float w,float l,float h){
        System.out.println("Hello from 1st constructor");
        System.out.printf("The Volume of Box: "+s+" = "+"%.1f", (w*l*h));
        System.out.println();
        System.out.println();
    }

    public Box(){
        
        System.out.println("Hello from 2nd constructor");
    }
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Name of Box: ");
        name = input.nextLine();
       
        System.out.print("Input Width: ");
        width = input.nextFloat();

        System.out.print("Input Length: ");
        length = input.nextFloat();

        System.out.print("Input Height: ");
        height = input.nextFloat();
    }
    public void calVolume(){
        System.out.printf("The Volume of Box: "+name+" = "+"%.1f", (width*length*height));
        System.out.println();

    }
}

public class Lab05_2_630510642 {
    public static void main(String[] args) throws Exception {
        Box b1 = new Box("SizeA", 14, 20, 6);
        
        Box b2 = new Box();
        b2.setData();
        b2.calVolume();
    }
}
