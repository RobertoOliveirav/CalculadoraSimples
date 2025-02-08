package projetos;
import java.util.Scanner;

public class CalculadoraSimples 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean repeticao = true;

    while (repeticao) 
    {
        System.out.println("Bem vindo a Calculadora Simples!!");
        System.out.println("Insira os dois números que voce deseja trabalhar:");

        // Recebimento dos valores
        
        System.out.print("1º Número: ");
        Double numero1 = scanner.nextDouble();

        System.out.print("2º Número: ");
        Double numero2 = scanner.nextDouble();

        // Recebimento da operação

        System.out.println("Selecione a operação que você deseja fazer: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");

        System.out.println("Escolha: ");
        int escolhaOperacao = scanner.nextInt();


        String resul = CalcularValor(numero1, numero2, escolhaOperacao);
        System.out.println(resul);


        System.out.println("Digite 1 para parar o programa ou 2 para reiniciar.");
        int repeticaoTotal = scanner.nextInt();

        if (repeticaoTotal == 1) 
        {
            repeticao = false;
            System.out.println("Emcerrando...");
        }
        else if (repeticaoTotal == 2)
        {
            repeticao = true;
            System.out.println("Programa reiniciado.");
            System.out.println(" ");
            System.out.println(" ");
        }
        else
        {
            repeticao = false;
            System.out.println("Erro!!");
        }
    }
            scanner.close();

    }

    public static String CalcularValor(Double numero1, Double numero2, int escolhaOperacao)
    {

        switch (escolhaOperacao) 
        {
            case 1:
                    Double Resultado = numero1 + numero2;
                    return Double.toString(Resultado);
            case 2:
                    Double Resultado1 = numero1 - numero2;
                    return Double.toString(Resultado1);
            case 3:
                    Double Resultado2 = numero1 / numero2;
                    return Double.toString(Resultado2);                
            case 4:
                    Double Resultado3 = numero1 * numero2;
                    return Double.toString(Resultado3);                
            default:
                    return "Erro!!";    
        }
    
    }
}