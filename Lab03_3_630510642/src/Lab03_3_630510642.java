//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;
class Student{
    private int stuID;
    private int score1;
    private int score2;
    private int score;
    private String grade;
    
    public void getData(int i){
        System.out.println("Enter data for student #"+i);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student ID: ");
        stuID = input.nextInt();
        
        do{
            System.out.print("Enter midterm and final scores: ");
            score1 = input.nextInt();
            score2 = input.nextInt();
            System.out.println();
        }while(score1>50 || score2 >50);
        score = score1+score2;
        
    }

    public void calGrade(){
        if (score>= 85){
            grade = "A";
        }else if(score>=80 && score<=84){
            grade = "B+";
        }else if(score>=75 && score<=79){
            grade = "B";
        }else if(score>=60 && score<=74){
            grade = "C+";
        }else if(score>=55 && score<=59){
            grade = "C";
        }else if(score>=50 && score<=54){
            grade = "D+";
        }else if(score>=45 && score<=49){
            grade = "D";
        }else{
            grade = "F";
        }
    }

    public void printResult(int j){
        System.out.println(j+"  "+stuID+"   "+score+"     "+grade);
    }
}
public class Lab03_3_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner inputN = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = inputN.nextInt();
        Student[] stu = new Student[N];
        for(int i = 0;i<N;i++){
            stu[i] = new Student();
            stu[i].getData(i+1);
            stu[i].calGrade();
        }

        for(int j = 0;j<N;j++){
            stu[j].printResult(j+1);
        }
    }
}
