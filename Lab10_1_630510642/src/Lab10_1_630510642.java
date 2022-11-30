//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;
abstract class Student_{
    protected String name;
    protected int mScore,fScore;

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = input.nextLine();

        System.out.print("Enter midterm score : ");
        mScore = input.nextInt();
        input.nextLine();

        System.out.print("Enter final score : ");
        fScore = input.nextInt();
        input.nextLine();
    }

    public String getName(){return name;}
    public int getMScore(){return mScore;}
    public int getFScore(){return fScore;}

    public abstract char calGrade(int totalScore);
}

class Undergraduate extends Student_{
    private int pScore;
    public void setPScore(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter project score : ");
        pScore = input.nextInt();
        input.nextLine();
    }
    public int getPScore(){
        return pScore;
    }

    @Override
    public char calGrade(int totalScore){
        return(totalScore >= 50 && pScore >= 50)?'S':'U';
    }
}

class Graduate extends Student_{
    private int publicationNo;

    public void setPublicationNo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of publications : ");
        publicationNo = input.nextInt();
        input.nextLine();
    }

    public int getPublicationNo(){return publicationNo;}

    @Override
    public char calGrade(int totalScore){
        return(totalScore >= 60 && publicationNo >= 2)?'S':'U';
    }
}

public class Lab10_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Student_ stu[] = new Student_[100];
        int n = 0;
        char choice;
        do{
            System.out.print("\nEnter undergraduate student or graduate student (u/g) : ");
            char c = Character.toLowerCase(input.nextLine().charAt(0));
            if(c == 'u'){
                stu[n] = new Undergraduate();
                stu[n].setData();
                ((Undergraduate)stu[n]).setPScore();
                n++;
            }else if(c == 'g'){
                stu[n] = new Graduate();
                stu[n].setData();
                ((Graduate)stu[n]).setPublicationNo();
                n++;
            }else{System.out.println("Invalid Type of student");}
            System.out.print("Enter another (y/n)? ");
            choice = Character.toLowerCase(input.nextLine().charAt(0));

        }while(choice == 'y');
        reportGrade(stu,n);
    }
    public static void reportGrade(Student_ stu[], int n){
        System.out.printf("\nGrade Report\n");
        System.out.println("= = = = = = = = =");
        int num_S = 0;
        for(int i = 0;i<n;i++){
            int totalScore = stu[i].getFScore()+stu[i].getMScore();
            System.out.print(stu[i].getName()+" gets grade ");
            char grade;
            if(stu[i] instanceof Undergraduate){
                grade = stu[i].calGrade(totalScore);
            }else{
                grade = stu[i].calGrade(totalScore);
            }
            System.out.printf("%c\n",grade);
            if(grade == 'S'){
                num_S++;
            }

        }
        System.out.printf("Total : Grade U = %d\tGrade S = %d", n-num_S,num_S);
    }
}
