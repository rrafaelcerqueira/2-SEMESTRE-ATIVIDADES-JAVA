import java.util.InputMismatchException;
import java.util.Scanner;
class tentativa{
    public static void main(String args[]){
        Scanner scan = new  Scanner(System.in);
        System.out.println("Digite um numero: ");
        try{
                int numero = scan.nextInt();
                System.out.println(" O numero e: " + numero);
                if(numero < 0){
                    System.out.println(" NEGATIVO");
                }
                else{
                    System.out.println(" POSITIVO");
                }
        }
        catch(InputMismatchException e){
            System.out.println("Isso nao e um numero!");
        }
    }
}