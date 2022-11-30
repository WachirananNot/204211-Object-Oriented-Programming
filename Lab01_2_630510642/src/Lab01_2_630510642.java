//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;
import java.util.ArrayList;
public class Lab01_2_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter score between 1-100 or press 0 for stop");
        int num = 0 , sum = 0, i = 0 , max = 0 , avg= 0 , count = 0;
        int min = num = Input.nextInt();
        ArrayList<Integer> score = new ArrayList<Integer>();
        
        do{
            if(num >100){
                System.out.println("Enter score again (between 1-100 or press 0 for stop)");
                num = Input.nextInt();
                continue;
            }else if(num == 0){
                break;
            }
            if (num >= max){
                max = num;
            }
            if (num <= min){
                min = num;
            }
            
            score.add(num);
            sum += num;
            i+=1;
            num = Input.nextInt();
        
        }while(true);
        
        avg = sum/i;
        int size = score.size();
        
        
        for(int n = 0;n < size;n++){
            if(score.get(n) < avg){
                count++;
            }
        }


        System.out.println("Maximum Score = "+max);
        System.out.println("Minimum Score = "+min);
        System.out.println("Average Score = "+avg);
        System.out.println("The number of students who scored below average score = "+count);
    }
}
