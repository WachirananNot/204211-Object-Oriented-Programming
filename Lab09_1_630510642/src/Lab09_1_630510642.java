//630510642 วชิรนันท์ พวงปัญญา
import java.util.Scanner;

class Order{
    private String orderID,tableNo;
    private int numberOfItem;
    private OrderItem item[];
    private double totalPrice;
    public Order(){
        totalPrice = 0;
    }
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter order ID : ");
        orderID = input.nextLine();

        System.out.print("Enter Table No. : ");
        tableNo = input.nextLine();

        System.out.print("Enter number of food items : ");
        numberOfItem = input.nextInt();
        input.nextLine();

        item = new OrderItem[numberOfItem];
    }

    public void setItem(){
        for(int i =0; i<numberOfItem ;i++){
            item[i] = new OrderItem();
            item[i].setData();
        }
    }

    public void showData(){
        System.out.printf("\nOrderID - %s\t\tTable No. - %s\n",orderID,tableNo);
        System.out.println("Food Name\t\tPrive/Dish(Baht)\tQTY");
        for(int i = 0;i<numberOfItem;i++){
            totalPrice += item[i].getTotal();
            item[i].showData();
        }
        System.out.printf("Total Price = %.0f Bath\n",totalPrice);
    }

}

class OrderItem{
    private String foodName;
    private int price;
    private int numDish;

    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.println("*************************************************************");
        System.out.print("Enter food name : ");
        foodName = input.nextLine();

        System.out.print("Enter price : ");
        price = input.nextInt();
        input.nextLine();

        System.out.print("Enter number of dishes : ");
        numDish = input.nextInt();
        input.nextLine();
    }

    public void showData(){

        if(foodName.length()>=8){
            System.out.printf("%s\t\t%d\t\t\t%d\n",foodName,price,numDish);
        }else if(foodName.length()>=4){
            System.out.printf("%s\t\t\t%d\t\t\t%d\n",foodName,price,numDish);
        }else{
            System.out.printf("%s\t\t\t\t%d\t\t\t%d\n",foodName,price,numDish);
        }
    }

    public int getTotal(){
        return (price*numDish);
    }
}

public class Lab09_1_630510642 {
    public static void main(String[] args) throws Exception {
        Order o = new Order();
        o.setData();
        o.setItem();
        o.showData();
    }
}                                       