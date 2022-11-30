//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
class Subject{
    private char grade;
    private int credit;
    private int point;

    public void inputData(int i){
        Scanner input = new Scanner(System.in);
        System.out.println("Subject #"+i);
        System.out.print("Input Grade: ");
        do{
            grade = input.nextLine().charAt(0);
            if(grade !='A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'F'){
                System.out.print("Input Grade again (A,B,C,D,F): ");
                continue;
            }else{
                break;
            }
        }while(true);
        
        System.out.print("Enput Credit: ");
        credit = input.nextInt();
        System.out.println();
    }

    public int setPoint(char c){
        if(c == 'A'){
            point = 4;
        }else if(c == 'B'){
            point = 3;
        }else if(c == 'C'){
            point = 2;
        }else if(c == 'D'){
            point = 1;
        }else if(c == 'F'){
            point = 0;
        }
        return point;
    }

    public char sendGrade(){
        return grade;
    }

    public int sendCredit(){
        return credit;
    }   
}

public class Lab05_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = input.nextInt();
        Subject[] sub = new Subject[N]; 
        
        for(int i = 0;i < N;i++){
            sub[i] = new Subject();
            sub[i].inputData(i+1);
        }
        System.out.println("            Grade    GradePoint     Credit      TotalPoint");
        int sumC = 0;
        int sumSP = 0;
        for(int i = 0;i < N;i++){
            char grade = sub[i].sendGrade();
            int point = sub[i].setPoint(grade);
            int credit = sub[i].sendCredit();
            sumC += credit;
            int SP = point*credit;
            sumSP += SP;
            System.out.println("Subject "+(i+1)+"     "+grade+"          "+point+"            "+credit+"             "+SP);
        }
        float NSP,NC;
        NSP = sumSP;
        NC = sumC;
        System.out.println("Total                                 "+sumC+"            "+sumSP);
        float GPA = NSP/NC;
        System.out.printf("GPA = %.2f", GPA);
    }
}
