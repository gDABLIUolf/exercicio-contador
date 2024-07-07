import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int primeiroParametro = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int segundoParametro = sc.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior do que o primeiro!");
        }
    }

    public static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if (p1 > p2) {
            throw new ParametrosInvalidosException();
        }
        int contagem = p2 - p1;
        for(int i = 1; i <= contagem; i++) {
            System.out.printf("Imprimindo o número %d%n", i);
        }
    }
}