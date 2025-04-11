import ContaBancaria.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        int opcao;
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        Conta conta = new Conta(501);
        contas.add(conta);
//        System.out.println(contas);
//        System.out.println("Digite o index da conta que deseja manipular: ");
//        int index = Integer.parseInt(scanner.nextLine());
        int index = 0;
        System.out.println("===============================================");
        System.out.println(contas.get(index));

        do {
            System.out.println("===============================================");
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se conta usa cheque especial");
            System.out.println("7 - Sair");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> System.out.printf("O saldo é de %s \n", contas.get(index).consultarSaldo());
                case 2 -> System.out.printf("O cheque especial é de %s \n", contas.get(index).consultarChequeEspecial());
                case 3 -> {
                    System.out.println("Insira valor a ser depositado: ");
                    double valorDeposito = Double.parseDouble(scanner.nextLine());
                    contas.get(index).depositar(valorDeposito);
                }
                case 4 -> {
                    System.out.println("Insira valor a ser sacado: ");
                    double valorSaque = Double.parseDouble(scanner.nextLine());
                    contas.get(index).sacar(valorSaque);
                }
                case 5 -> {
                    System.out.println("Insira valor do boleto a ser pago: ");
                    double valorBoleto = Double.parseDouble(scanner.nextLine());
                    contas.get(index).pagarBoleto(valorBoleto);
                }
                case 6 -> {
                    contas.get(index).verificarChequeEspecial();
                }

            }
        } while (opcao != 7);
    }
}
