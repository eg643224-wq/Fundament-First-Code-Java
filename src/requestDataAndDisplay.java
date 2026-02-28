
import java.util.Scanner;
public class requestDataAndDisplay {
    public static void main (String[] args){
        System.out.print ("Cual es tu nombre?: ");
        Scanner scanner=new Scanner (System.in);
        String nombre=scanner.nextLine();
        System.out.println("Cual es tu edad?: ");
        int edad=scanner.nextInt();
        scanner.nextLine();
        System.out.println("En que dia naciste?: ");
        String nacimiento= scanner.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        System.out.println("Tienes: "+edad);
        System.out.print("Naciste en: "+nacimiento);

    }
}
