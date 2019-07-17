
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number");
        String number = reader.nextLine();
        int randnum = (1 + (int)(Math.random() * 10));
        int myInteger = Integer.parseInt(number);

        if(randnum==myInteger){
            System.out.println("yo! lucky dude");
        }
        else {
            System.out.println("Lucky number is "+ randnum);
            System.out.println("oops! good luck try again ");
        }

        System.out.println("ThankYou");
        //JOptionPane.showMessageDialog(null,"wallo");

    }
}
