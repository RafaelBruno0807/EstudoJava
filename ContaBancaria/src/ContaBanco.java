import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Qual nome do Titular da conta? ");
        String nomeCliente = meuScanner.nextLine();

        System.out.println("Por favor, digite o número da agência !");
        String agencia = meuScanner.nextLine();

        System.out.println("Me informe o número da conta: ");
        int numeroConta = meuScanner.nextInt();

        System.out.println("Quanto de saldo disponível para saque você tem?");
        double saldo = meuScanner.nextDouble();


        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        meuScanner.close();

    }
}
