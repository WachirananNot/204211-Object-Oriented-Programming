//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
class Employee{
    protected String id,name;

    public void setNameAndID(int i){
        System.out.println("Input person #"+i);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input id : ");
        id = input.nextLine();
        
        System.out.print("Input name : ");
        name = input.nextLine();
    }
    
}

class Mouthly extends Employee{
    private int salary,ot,total;
    public void setData(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input salary : ");
        salary = input.nextInt();
        input.nextLine();
        
        System.out.print("Input overtime period : ");
        ot = input.nextInt();
        input.nextLine();
        System.out.println();
    }

    public void calData(){
        ot = ot * 200;
        total = salary + ot;
    }

    public void printData(){
        System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,name,salary,ot,total);
    }
    public int getSalary(){
        return salary;
    }
    public int getOt(){
        return ot;
    }
    public int getTotal(){
        return total;
    }
}
class Commission extends Employee{
    protected int sale,percent,commission,wage,total;
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input total sale : ");
        sale = input.nextInt();
        input.nextLine();

        System.out.print("Input percent of commission rate : ");
        percent = input.nextInt();
        input.nextLine();
    }
    public void calCommission(){
        commission = (sale*percent)/100;
    }
    public void printData(){
        System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,name,commission,wage,total);
    }
    public int getCommission(){
        return commission;
    }
    public int getWage(){
        return wage;
    }
    public int getTotal(){
        return total;
    }
}
class Weekly extends Commission{
    private int weekly,week;
    
    public void setRateAndWorking(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input weekly rate : ");
        weekly = input.nextInt();
        input.nextLine();

        System.out.print("Input working week : ");
        week = input.nextInt();
        input.nextLine();
        System.out.println();
    }
    public void calData(){
        wage = weekly*week;
        total = commission+wage;
    }
    
}

class Daily extends Weekly{
    private int daily,day;
    public void setRateAndWorking(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input daily rate : ");
        daily = input.nextInt();
        input.nextLine();

        System.out.print("Input working day : ");
        day = input.nextInt();
        input.nextLine();
        System.out.println();
    }
    public void calData(){
        wage = daily*day;
        total = commission+wage;
    }
}

public class Lab07_2_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number of mouthly employees : ");
        int NM = input.nextInt();
        input.nextLine();
        System.out.println();

        Mouthly[] m = new Mouthly[NM];
        for(int i = 0;i<NM;i++){
            m[i] = new Mouthly();
            m[i].setNameAndID(i+1);
            m[i].setData();
            m[i].calData();
        }
        System.out.println(".......................................................");

        System.out.print("Input Number of weekly employees : ");
        int NW = input.nextInt();
        input.nextLine();
        System.out.println();

        Weekly[] w = new Weekly[NW];
        for(int i = 0;i<NW;i++){
            w[i] = new Weekly();
            w[i].setNameAndID(i+1);
            w[i].setData();
            w[i].setRateAndWorking();
            w[i].calCommission();
            w[i].calData();
        }
        System.out.println(".......................................................");

        System.out.print("Input Number of daily employees : ");
        int ND = input.nextInt();
        input.nextLine();
        System.out.println();

        Daily[] d = new Daily[NW];
        for(int i = 0;i<ND;i++){
            d[i] = new Daily();
            d[i].setNameAndID(i+1);
            d[i].setData();
            d[i].setRateAndWorking();
            d[i].calCommission();
            d[i].calData();
        }
        System.out.println(".......................................................");
        System.out.printf("%38s\n","ABC Company");
        System.out.println();
        printAllMouthly(m, NM);
        printAllWeekly(w, NW);
        printAllDaily(d, ND);
    }
    public static void printAllMouthly(Mouthly[] m,int NM){
        int total1 = 0,total2 = 0,total3 = 0;
        System.out.println("Mouthly Employees");
        System.out.printf("%s\t%s\t\t\t%s\t\t%s\t%s\n","ID","Name","Salary","Overtime wage","Total");
        for(int i = 0;i<NM;i++){
            total1 += m[i].getSalary();
            total2 += m[i].getOt();
            total3 += m[i].getTotal();
            m[i].printData();
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",total1,total2,total3);
        System.out.println();
    }

    public static void printAllWeekly(Weekly[] w,int NW){
        int total1 = 0, total2 = 0, total3 = 0;
        System.out.println("Weekly Employees");
        System.out.printf("%s\t%s\t\t\t%s\t%s\t%s\n","ID","Name","Commission","Monthly wage","Total");
        for(int i = 0;i<NW;i++){
            total1 += w[i].getCommission();
            total2 += w[i].getWage();
            total3 += w[i].getTotal();
            w[i].printData();
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",total1,total2,total3);
        System.out.println();
    }

    public static void printAllDaily(Daily[] d,int ND){
        int total1 = 0, total2 = 0, total3 = 0;
        System.out.println("Daily Employees");
        System.out.printf("%s\t%s\t\t\t%s\t%s\t%s\n","ID","Name","Commission","Monthly wage","Total");
        for(int i = 0;i<ND;i++){
            total1 += d[i].getCommission();
            total2 += d[i].getWage();
            total3 += d[i].getTotal();
            d[i].printData();
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",total1,total2,total3);
    }
}