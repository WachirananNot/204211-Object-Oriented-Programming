//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;

class Shape2Dim{
    protected int N;
    public void setN(int n){
        N = n;
    }
}

class Rhombus extends Shape2Dim{  
    Rhombus(){
        N = 0;
    }
    void draw(){
        if (N > 0) {
            int i;
            String fsq = "%" + N+"c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for (i=1; i<N;i++ ){   
                fsq2 = "%" + (N-i)+"c%"+(2*i)+"c\n";
                System.out.printf(fsq2,'*','*');
            }
            for (i=N-2; i>=1;i--){   
                fsq2 = "%" + (N-i)+"c%"+(2*i)+"c\n";
                System.out.printf(fsq2,'*','*');
            }
            System.out.printf(fsq,'*');
        }
    }
}

class Square extends Shape2Dim{  
    Square(){ 
        N=0;
    }
    void draw(){
        if (N > 0){
            int i;
            String fsq = "*%"+(N-1)+"c\n";
            for(i = 0;i<N;i++){
                if(i == 0 || i == N-1){
                    System.out.println("*".repeat(N));
                }
                else{System.out.printf(fsq,'*');}
            }
        }
    }
}

class Triangle extends Shape2Dim{
    Triangle(){
        N = 0;
    }
    void draw(){
        if(N > 0){
            int i;
            String fsq = "%" + N+"c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for (i=1; i<N;i++ ){   
				if(i == N-1){
					System.out.println("* ".repeat(N));
					break;
				}
                fsq2 = "%" + (N-i)+"c%"+(2*i)+"c\n";
                System.out.printf(fsq2,'*','*');
            }
        }
    }
}

public class Lab10_2_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input M : ");
        int N = input.nextInt();
        input.nextLine();
        Shape2Dim[] s2d = new Shape2Dim[N];
        for(int i = 0;i<N;i++){
            System.out.print("Input Type (R S or T) and Size : ");
            char c = Character.toLowerCase(input.next().charAt(0));
            int size = input.nextInt();
            input.nextLine();
            if(c == 'r'){
                s2d[i] = new Rhombus();
                s2d[i].setN(size);
            }else if(c == 's'){
                s2d[i] = new Square();
                s2d[i].setN(size);
            }else if(c == 't'){
                s2d[i] = new Triangle();
                s2d[i].setN(size);
            }
        }
        
        System.out.println("Rhombus\n");
        for(int i = 0;i<N;i++){
            if(s2d[i] instanceof Rhombus){
                ((Rhombus)s2d[i]).draw();
                System.out.println();
            }
        }
        
        System.out.println("Square\n");
        for(int i = 0;i<N;i++){
            if(s2d[i] instanceof Square){
                ((Square)s2d[i]).draw();
                System.out.println();
            }
        }
        
        System.out.println("Triangle\n");
        for(int i = 0;i<N;i++){
            if(s2d[i] instanceof Triangle){
                ((Triangle)s2d[i]).draw();
                System.out.println();
            }
        }
    }
}
