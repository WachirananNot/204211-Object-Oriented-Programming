//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;
class Land{
    protected int landSize;
    public void setInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter land size: ");
        landSize = input.nextInt();
        input.nextLine();
    }
    public int getLandSize(){
        return landSize;
    }
}

class LandForHouse extends Land{
    private int housePrice;
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter house price: ");
        housePrice = input.nextInt();
        input.nextLine();
        System.out.println();
    }
    public int getHousePrice(){
        return housePrice;
    }
}

class LandForSale extends Land{
    private String titleDeed;
    private int evaluatePrice;
    private float salePrice;
    protected int saleStatus;

    public LandForSale(){
        saleStatus = 0;
    }

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter title deed: ");
        titleDeed = input.nextLine();

        System.out.print("Enter Evaluate price: ");
        evaluatePrice = input.nextInt();
        input.nextLine();
        System.out.println();

    }

    public void setSalePrice(float x){
        salePrice = x;
    }

    public String getTitleDeed(){
        return titleDeed;
    }

    public int getEvaluatePrice(){
        return evaluatePrice;
    }

    public int getSaleStatus(){
        return saleStatus;
    }

    public float getSalePrice(){
        return salePrice;
    }
}

public class Lab08_1_630510642 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of house: ");
        int m = input.nextInt();
        input.nextLine();

        System.out.print("Enter number of lands: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println();

        LandForHouse[] h = new LandForHouse[m];
        LandForSale[] l = new LandForSale[n];
        
        for(int i = 0; i<m ;i++){
            System.out.println("Enter data for house #"+(i+1));
            h[i] = new LandForHouse();
            h[i].setInfo();
            h[i].setData();
        }

        for(int i = 0;i<n;i++){
            System.out.println("Enter data for land #"+(i+1));
            l[i] = new LandForSale();
            l[i].setInfo();
            l[i].setData();
        }
        calSalePriceAndProfit( h, l, m, n);
        printData( l, n);
    }

    public static void calSalePriceAndProfit(LandForHouse[] h, LandForSale[] l,int m,int n){
        float salePrice;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(l[j].getLandSize()>=h[i].getLandSize() && l[j].saleStatus != 1){
                    l[j].saleStatus = 1;
                    salePrice = l[j].getEvaluatePrice()+(float)(0.1*l[j].getEvaluatePrice()+(float)(0.05*h[i].getHousePrice()));
                    l[j].setSalePrice(salePrice);
                    break;
                }
                continue;
            }
        }
    }

    public static void printData( LandForSale[] l,int n){
        float profit = 0;
        System.out.println("Report for lands which can be sold\nTitle deed\tSale price");
        for(int i = 0;i<n;i++){
            if(l[i].saleStatus == 1){
                System.out.printf("%s\t\t  %.2f\n", l[i].getTitleDeed(),l[i].getSalePrice());
                profit += l[i].getSalePrice() - (float)(l[i].getEvaluatePrice());
            }
        }
        System.out.printf("\nTotal profit = %.2f\n", profit);
        
    }   
}