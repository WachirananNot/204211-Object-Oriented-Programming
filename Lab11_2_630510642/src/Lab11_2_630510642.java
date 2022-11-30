//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;

class Queue <TYPE>{
    private int count,front,rear,N;
    private Object[] item;
    public Queue(int x){
        N = x;
        item = new Object[N];
        front = 0;
        rear = -1;
        count = 0;
    }
    public boolean isFull(){
        if(rear >= N-1){
            return true;
        }else{
            return false;
        }
    }

    private boolean isEmpty(){
        if(count == 0){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(TYPE v){
        rear++;
        item[rear] = v;
        count++;
        System.out.println("OK"); 
    }
    public TYPE dequeue(){
        if(isEmpty()){
            return (TYPE)("Queue is empty.");
        }else{
            count--;
            return (TYPE)(item[front++]);
        }
        
    }

    public void show(){
        if(isEmpty()){
            System.out.println("Nothing to show.");
        }else{
            for(int i = front;i<=rear;i++){
                System.out.print(item[i]+" ");
            }
            System.out.println();
        }
        
    }

}

public class Lab11_2_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input N : ");
        int x = input.nextInt();
        input.nextLine();
        int choice;
        System.out.print("Select int or char (i or c) : ");
        char t = Character.toLowerCase(input.nextLine().charAt(0));
        
        if(t == 'i'){
            Queue <Integer> qi = new Queue(x);
            do{
                System.out.println("*******************************************************\n\n\t1) enqueue\n\t2) dequeue\n\t3) show\n\t4) exit\n");
                System.out.print("Select choice : ");
                choice = input.nextInt();
                input.nextLine();

                if(choice == 1){
                    if(qi.isFull()){
                        System.out.println("Queue is full.");
                    }else{
                        System.out.print("Input data for enqueue : ");
                        qi.enqueue(input.nextInt());
                        input.nextLine();
                    }
                }else if(choice == 2){
                    System.out.println(qi.dequeue());
                }else if(choice == 3){
                    qi.show();
                }
            }while(choice != 4);
        }else if(t == 'c'){
            Queue <Character> qc = new Queue(x);
            do{
                System.out.println("*******************************************************\n\n\t1) enqueue\n\t2) dequeue\n\t3) show\n\t4) exit\n");
                System.out.print("Select choice : ");
                choice = input.nextInt();
                input.nextLine();

                if(choice == 1){
                    if(qc.isFull()){
                        System.out.println("Queue is full.");
                    }else{
                        System.out.print("Input data for enqueue : ");
                        qc.enqueue(input.nextLine().charAt(0));
                    }
                }else if(choice == 2){
                    System.out.println(qc.dequeue());
                }else if(choice == 3){
                    qc.show();
                }
            }while(choice != 4);
            System.out.println("Bye.\n*******************************************************");
        }
    }
}
