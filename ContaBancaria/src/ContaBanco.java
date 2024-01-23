import java.util.Scanner;

public class ContaBanco {
    
    /**
     * O método principal que é executado quando o programa é iniciado.
     * 
     * @param args Os argumentos de linha de comando (não utilizados neste programa).
     * @throws Exception Qualquer exceção que possa ocorrer durante a execução.
     */
    public static void main(String[] args) throws Exception {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner meuScanner = new Scanner(System.in);

        // Solicitando ao usuário o nome do titular da conta
        System.out.println("Qual nome do Titular da conta? ");
        String nomeCliente = meuScanner.nextLine();

        // Solicitando ao usuário o número da agência
        System.out.println("Por favor, digite o número da agência !");
        String agencia = meuScanner.nextLine();

        // Solicitando ao usuário o número da conta
        System.out.println("Me informe o número da conta: ");
        int numeroConta = meuScanner.nextInt();

        // Solicitando ao usuário o saldo inicial da conta
        System.out.println("Quanto de saldo disponível para saque você tem?");
        double saldo = meuScanner.nextDouble();

        // Exibindo uma mensagem de boas-vindas com as informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o Scanner para evitar vazamentos de recursos
        meuScanner.close();
    }
}