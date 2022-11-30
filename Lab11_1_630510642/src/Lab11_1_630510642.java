//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
public class Lab11_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers");
        int n1 = input.nextInt();
        input.nextLine();
        int n2 = input.nextInt();
        input.nextLine();
        int n3 = input.nextInt();
        input.nextLine();

        System.out.println("Enter 3 characters");
        char c1 = input.nextLine().charAt(0);
        char c2 = input.nextLine().charAt(0);
        char c3 = input.nextLine().charAt(0);

        System.out.println("Enter 3 float numbers");
        float f1 = input.nextFloat();
        input.nextLine();
        float f2 = input.nextFloat();
        input.nextLine();
        float f3 = input.nextFloat();
        input.nextLine();

        System.out.println();
        System.out.println("Center is");
        System.out.println(getCenter(n1,n2,n3));
        System.out.println(getCenter(c1,c2,c3));
        System.out.println(getCenter(f1,f2,f3));
    }

    public static <TYPE extends Comparable> TYPE getCenter(TYPE a,TYPE b,TYPE c){
        Object [] data = {a,b,c};
        TYPE temp;
        int i,j;
        for(i=0;i<3;i++){
            for(j=i+1;j<3;j++){
                if(((TYPE)data[i]).compareTo(((TYPE)data[j]))>0){
                    temp = (TYPE)data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return (TYPE)data[1];
    }
}
