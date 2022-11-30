//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
import java.util.ArrayList;

class Course{
    private String name;
    private String [] course;
    private boolean check;

    public void getCourse(){
        Scanner input = new Scanner(System.in);
        System.out.print("Student name: ");
        name = input.nextLine();
        System.out.print("Number of subjects: ");
        int N = input.nextInt();
        input.nextLine();
        System.out.print("Course list : ");
        String c = input.nextLine();
        System.out.println();
        course = c.trim().split("\\s+");
        
    }

    public void checkCourse(String s){
        int len = course.length;
        for(int i=0;i<len;i++){
            if(course[i].equals(s)){
                check = true;
            }
        }
    }

    public void printName(){
        if(check==true){
            System.out.println(name);
        }
    }
}


public class Lab04_3_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number of students :");
        int N = input.nextInt();
        input.nextLine();
        System.out.println();
        
        Course[] stu = new Course[N];
        for(int i = 0;i<N;i++){
            stu[i] = new Course();
            stu[i].getCourse();
        }
        
        System.out.print("Input subject for searching : ");
        String M = input.nextLine();
        for(int i = 0;i<N;i++){
            stu[i].checkCourse(M);
            stu[i].printName();
        }
    }
}
