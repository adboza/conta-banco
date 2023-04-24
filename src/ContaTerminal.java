public class ContaTerminal {
    public static void main(String[] args) {

        ContaTerminal c = new ContaTerminal();
        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Informe seu Nome Completo: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o Número da Agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, Digite o Número da Conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, Digite um Valor de depósito: ");
        saldo = sc.nextDouble();

        System.out.println("Olá, " +  nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                "\nSua agência é:" + agencia
                + "\nconta: " + numeroConta + "\ne seu saldo R$" + saldo + "\njá está disponível para saque");
    }
}