//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;

class Menu{
    private int choice;

    public void setChoice(){
        Scanner input = new Scanner(System.in);
        System.out.print("**********\n1.push\n2.pop\n3.show\n4.exit\n**********\nPlease select choice : ");
        choice = input.nextInt();
    }

    public int getChoice(){
        return choice;
    }
}

class Stack{
    private int[] item = new int[5];
    private int top;
    
    public Stack(){
        top = -1;
    }

    public void push(int x){
        boolean full = isFull();
        if(full){
            System.out.println("Stack is full");
            System.out.println();
        }else{
            item[top+1] = x;
            top += 1;
            System.out.println();
        }
        
    }

    public void pop(){
        boolean empty = isEmpty();
        if(empty){
            System.out.println("stack is empty");
            System.out.println();
        }else{
            System.out.println("pop "+item[top]);
            System.out.println();
            top -= 1;
        }
        
    }

    public void show(){
        boolean empty = isEmpty();
        if(empty){
            System.out.println("stack is empty");
            System.out.println();
        }else{
            for(int i = 0;i<=top;i++){
                System.out.print(item[i]+" ");
            }
            System.out.println();
            System.out.println();
        }

    }

    private boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
        
    }

    private boolean isFull(){
        if(top == 4){
            return true;
        }else{
            return false;
        }
    }
}

public class Lab05_3_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int choice;
        int c = 0;
        Menu menu = new Menu();
        Stack stack = new Stack();
        
        do{
            menu.setChoice();
            choice = menu.getChoice();
            if(choice == 1){
                if(c!= 4){
                    System.out.print("Enter data : ");
                    int n = input.nextInt();
                    stack.push(n);
                    c+=1;
                }else{
                    System.out.println("Stack is full\n");
                }
                
            }else if(choice == 2){
                stack.pop();
                c -= 1;
            }else if(choice == 3){
                stack.show();
            }
        }while(choice!=4);
        System.out.println("Bye bye");
    }
}
