//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;

class Stuff{
    protected String firstname,lastname;
    protected int age;

    public void setInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first name : ");
        firstname = input.nextLine();

        System.out.print("Input last name : ");
        lastname = input.nextLine();

        System.out.print("Input age : ");
        age = input.nextInt();

    }

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
}

class Student extends Stuff{
    private int year;

    public void setYear(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input study year : ");
        year = input.nextInt();
        input.nextLine();
        System.out.println();
    }

    public int getYear(){
        return year;
    }
}

class Teacher extends Stuff{
    private int salary;

    public void setSalary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input salary : ");
        salary = input.nextInt();
        input.nextLine();
        System.out.println();
    }

    public int getSaraly(){
        return salary;
    }
}

public class Lab07_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input N : ");
        int N = input.nextInt();
        input.nextLine();

        Student[] s = new Student[N];
        int si = 0;
        Teacher[] t = new Teacher[N];
        int ti = 0;
        float avg;
        char choice;

        for(int i =0;i<N;i++){
            do{
                System.out.printf("\nInput person #%d (Teacher or Student) : ", i+1);
                choice = Character.toLowerCase(input.next().charAt(0));
                if(choice == 's'){
                    s[si] = new Student();
                    s[si].setInfo();
                    s[si].setYear();
                    si++;
                }else{
                    t[ti] = new Teacher();
                    t[ti].setInfo();
                    t[ti].setSalary();
                    ti++;
                }
            }while(choice != 's' && choice != 't');
        }

        if(si!=0){printAllStudents(s,si);}
        if(ti!=0){printAllTeachers(t,ti);}

        avg = calAndPrintAvgAge(s,si,t,ti);

        if(ti!=0){countTeacher(t,ti,avg);}
    }

    public static void printAllStudents(Student[] s,int n){
        System.out.println("Students");
        System.out.println("\tFirstname\tLastname\tAge\tStudy year");
        String fname,lname;
        int age,year;
        for(int i = 0;i < n;i++){
            fname = s[i].getFirstName();
            lname = s[i].getLastName();
            age = s[i].getAge();
            year = s[i].getYear();
            System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\n", i+1,fname,lname,age,year);
        }
        System.out.println();
    }

    public static void printAllTeachers(Teacher[] t,int n){
        System.out.println("Teachers");
        System.out.println("\tFirstname\tLastname\tAge\tSalary");
        String fname,lname;
        int age,salary;
        for(int i = 0;i < n;i++){
            fname = t[i].getFirstName();
            lname = t[i].getLastName();
            age = t[i].getAge();
            salary = t[i].getSaraly();
            System.out.printf("%d\t%s\t\t%s\t\t%d\t%d\n", i+1,fname,lname,age,salary);
        }
        System.out.println();
    }

    public static float calAndPrintAvgAge(Student[] s, int si,Teacher[] t,int ti){
        float avgStudentAge,avgTeacherAge = 0f;
        int i;

        if(si!=0){
            int sumStudentAge = 0;
            for(i=0;i<si;i++){
                sumStudentAge += s[i].getAge();
            }
            avgStudentAge = (float)sumStudentAge/si;
            System.out.printf("Average of student age = %.2f\n", avgStudentAge);
        }

        if(ti!= 0){
            int sumTeacherAge = 0;
            for(i=0;i<ti;i++){
                sumTeacherAge += t[i].getAge();
            }
            avgTeacherAge = (float)sumTeacherAge/ti;
            System.out.printf("Average of teacher age = %.2f\n", avgTeacherAge);
        }

        return avgTeacherAge;
    }

    public static void countTeacher(Teacher[] t,int n,float avg){
        int numTBelowAge = 0;
        
        for(int i =0;i<n;i++){
            if((float)t[i].getAge()<avg){
                numTBelowAge += 1;
            }
        }

        System.out.printf("Number of teachers who have age below average = %d\n", numTBelowAge);
    }
}
