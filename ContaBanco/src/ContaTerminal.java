import java.util.Scanner;

import conta.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        Conta conta = new Conta();

        System.out.println("Por favor, digite o seu nome!");
        conta.nome = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        conta.agencia = sc.next();

        System.out.println("Por favor, digite o número da conta!");
        conta.numero = sc.nextInt();

        System.out.println("Por favor, digite o seu saldo!");
        conta.saldo = sc.nextDouble();
        
        sc.close();
        //Exibir a mensagem conta criada
        System.out.println("Olá " + conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque");
    }
}
