import java.util.Scanner;

class mercado{
    public static void main(String arg[]){
        Scanner t = new Scanner(System.in);
        produtos arroz = new produtos();
        produtos feijao = new produtos();
        System.out.println("Digite um preço para o arroz: ");
        double p = t.nextDouble();
        arroz.codigo = 1;
        arroz.seta_preco(p);
        System.out.println("Digite um preço para o feijão: ");
        p = t.nextDouble();
        feijao.codigo = 2;
        feijao.seta_preco(p);
        System.out.println("O código do arroz é " + arroz.codigo + " e o preço é: R$" + arroz.retorna_preco());
        System.out.println("O código do feijão é " + feijao.codigo + " e o preço é: R$" + feijao.retorna_preco());
    }
}