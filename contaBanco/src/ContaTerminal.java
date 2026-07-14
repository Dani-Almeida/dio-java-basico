import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       //TODO: Conhecer e importar a classe Scanner

       //Exibir as mensagens para o nosso usuário

       //Obter pela scanner os valores digitados no terminal

       //Exibir a mensagem conta criada

       var scanner = new Scanner(System.in);

       
       System.out.println("Por favor, digite seu nome!");
       String nome = scanner.nextLine();
       
       System.out.println("Por favor, digite o número da agência!");
       String agencia = scanner.next();

       System.out.println("Por favor, digite o numero da conta!");
       int conta = scanner.nextInt();

       System.out.println("Por favor, digite seu saldo!");
       double saldo = scanner.nextDouble();

       System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %s e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);

       scanner.close();
    }
}
