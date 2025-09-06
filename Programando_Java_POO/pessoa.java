import java.util.Scanner;

class pessoa{
    public static void main(String arg[]){
    Scanner t = new Scanner(System.in);
    pessoas pessoa = new pessoas();
    
    System.out.println("Digite seu nome: ");
    String nome = t.nextLine();
    
    System.out.println("Digite sua idade: ");
    int idade = t.nextInt();
    
    System.out.println("Digite seu peso: ");
    double peso = t.nextDouble();
    
    System.out.println("Digite sua altura: ");
    double altura = t.nextDouble();
    
    String resultadoIMC = pessoa.calculoIMC();
    System.out.println(resultadoIMC);
    }
}