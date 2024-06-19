
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    //Classe Scanner
    Scanner scanner = new Scanner(System.in);

    //Mensagem para o usuário
    System.out.println("Nome do cliente:");
    String nomeCliente = scanner.nextLine();

    System.out.println("Digite o numero da agencia:");
    String agencia = scanner.nextLine();

    System.out.println("Digite o numero da conta:");
    int Numero = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Digite o saldo inicial:");
    double Saldo = scanner.nextDouble();

    //Obter pelo Scanner o valor digitado pelo usuário

    System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + Numero + " e seu saldo " + Saldo + " Lujá está disponível para saque");


    scanner.close();
    //Exibir mensagem de conta criada


    }
}
