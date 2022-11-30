//630510642 วชิรนันท์ พวงปัญญา


import java.util.Scanner;
class Secret{
    private String text;
    private String newtext;

    public void getText(){
        System.out.print("Input text : ");
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
    }

    public void editText(){
        newtext = "";
        int i,len;
        len = text.length();
        while(len%3 != 0){
            text += " ";
            len = text.length();
        }
        while(len != 0){
            for(i=0 ; i<3 ;i++){
                char c = text.charAt(i);
                c +=3;
                newtext += String.valueOf(c);
            }
            newtext += " ";
            if(text.length() != 0){
                text = text.substring(3);
                len = text.length();
            }
            
        }
        newtext = newtext.trim();
        newtext = newtext.toUpperCase();
        
    }

    public void printText(){
        System.out.print(newtext);
    }
}


public class Lab04_2_630510642 {
    public static void main(String[] args) throws Exception {
        Secret s = new Secret();
        s.getText();
        s.editText();
        s.printText();
    }
}
