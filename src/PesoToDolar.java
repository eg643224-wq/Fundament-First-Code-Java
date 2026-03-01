import java.util.Locale;
import java.util.Scanner;
public class PesoToDolar {
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        scanner.useLocale(Locale.US);
while (true){
        System.out.println("CONVERSOR DE MONEDAS");
        System.out.println("1.Dolar a Peso");
        System.out.println("2.Peso a dolar");
        System.out.println("3.Abandonar");
        System.out.println("Elige una opcion 1,2,3: ");
        int opcion= scanner.nextInt();
if (opcion==3){
    System.out.println ("Saliendo del programa");
    break; }

        if (opcion==1){
        System.out.print ("Cuanto dinero quieres convertir (dolares):");
        double Dolar= scanner.nextDouble();
        double Pesos=Dolar*17.2348;
        System.out.printf("USD: %.2f%n",Dolar);
        System.out.printf("MXN: %.2f%n",Pesos);
        } else if (opcion==2 ) {


        System.out.print ("Cuanto dinero quieres convertir (Pesos):");
        double Pesos=scanner.nextDouble();
        double Dolar=Pesos*0.058;
        System.out.printf("MXN: %.2f%n",Pesos);
        System.out.printf("USD: %.2f%n",Dolar);
        }else{
            System.out.println("Opcion no valida, intenta de nuevo");

        }
    }
scanner.close();
}
}