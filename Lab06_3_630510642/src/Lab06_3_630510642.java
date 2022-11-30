//630510642 วชิรนันท์ พวงปัญญา

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class Star{
    private String name;
    private int score;

    public Star(String x,int j){
        name = x;
        score = j;
    }
    
    public void incScore(){
        score += 1;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    
}

class Voter{
    private String name;
    private int mstar,fstar;
    public void setData(int i){
        Scanner input = new Scanner(System.in);
        System.out.println("Input vote #"+i);
        System.out.print("Input name : ");
        name = input.nextLine();
        do{
            System.out.print("Input number of actor and number of actress : ");
            mstar = input.nextInt();
            fstar = input.nextInt();
        }while((mstar != 1&& mstar!=2 && mstar!= 3) || (fstar!=1 && fstar!=2 && fstar!=3));
        System.out.println();
    }
    public String getName(){
        return name;
    }

    public int getMstar(){
        return mstar;
    }

    public int getFstar(){
        return fstar;
    }  
}

public class Lab06_3_630510642 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Star m[] = {new Star("Nadech", 0),new Star("Wier", 0),new Star("Mario", 0)};
        Star f[] = {new Star("Aum", 0),new Star("Yaya", 0),new Star("Bella", 0)};
        int[] w = new int[2];
        System.out.print("Input N : ");
        int N = input.nextInt();
        input.nextLine();

        Voter[] vote = new Voter[N];
        for(int i=0;i<N;i++){
            vote[i] = new Voter();
            vote[i].setData(i+1);
        }
        checkAndPrintVote(N, vote,m,f,w);
        printGoodLuckPeople(N, vote,m,f,w);
    }

    static void checkAndPrintVote(int n,Voter[] vt,Star m[],Star f[],int w[]){
        ArrayList<Integer> mscore = new ArrayList<Integer>();
        ArrayList<Integer> fscore = new ArrayList<Integer>();
        int fs,ms;        
        for(int i =0;i<n;i++){
            ms = vt[i].getMstar();
            m[ms-1].incScore();
            fs = vt[i].getFstar();
            f[fs-1].incScore();
        }
        for(int k =0;k<3;k++){
            mscore.add(m[k].getScore());
            fscore.add(f[k].getScore());
        }
        for(int j = 0;j<3;j++){
            if(mscore.get(j) == Collections.max(mscore)){
                System.out.println("Top star award (Actor) goes to "+m[j].getName());
                break;
            }
        }
        for(int j = 0;j<3;j++){
            if(fscore.get(j) == Collections.max(fscore)){
                System.out.println("Top star award (Actress) goes to "+f[j].getName());
                break;
            }
        }
        w[0] = mscore.indexOf(Collections.max(mscore))+1;
        w[1] = fscore.indexOf(Collections.max(fscore))+1;
    }

    static void printGoodLuckPeople(int n,Voter[] vt,Star m[],Star f[],int w[]){
        String luck = "Good luck voter -> ";
        int len = luck.length();
        for(int i = 0;i<n;i++){      
            if(vt[i].getFstar() == w[1] && vt[i].getMstar()== w[0]){
                luck += vt[i].getName();
                luck += " ";
            }
        }

        if(luck.length()==len){
            luck = "Sorry, no one voted correctly for both of them.";
        }

        luck = luck.trim();
        System.out.println(luck);
    }
}
