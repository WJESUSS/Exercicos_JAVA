package ContaBancaria;

import java.util.Scanner;

public class TesteContas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas contas você deseja criar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        ContaBancaria[] contas = new ContaBancaria[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a senha da conta " + (i+1) + ": ");
            String senha = scanner.nextLine();
            System.out.print("Digite o número da conta " + (i+1) + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("A conta é ContaCorrente (C) ou ContaEspecial (E)? ");
            char tipo = scanner.nextLine().charAt(0);

            if (tipo == 'C' || tipo == 'c') {
                contas[i] = new ContaCorrente(senha, numero);
            } else if (tipo == 'E' || tipo == 'e') {
                System.out.print("Digite o limite da conta especial: ");
                double limite = scanner.nextDouble();
                scanner.nextLine();
                contas[i] = new ContaEspecial(senha, numero, limite);
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar atributos das contas");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar saque");
            System.out.println("4. Mostrar extrato");
            System.out.println("5. Mostrar transações realizadas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            

            switch (opcao) {
                case 1:
                    System.out.println("\nAtributos das contas:");
                    for (ContaBancaria conta : contas) {
                        conta.tiraExtrato();
                        System.out.println("----------------------");
                    }
                    break;
                case 2:
                    System.out.print("Digite o número da conta para depósito: ");
                    int numeroContaDep = scanner.nextInt();
                    System.out.print("Digite o valor a depositar: ");
                    double valorDep = scanner.nextDouble();
                    for (ContaBancaria conta : contas) {
                        if (conta.numero == numeroContaDep) {
                            conta.deposita(valorDep);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da conta para saque: ");
                    int numeroContaSaq = scanner.nextInt();
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaq = scanner.nextDouble();
                    for (ContaBancaria conta : contas) {
                        if (conta.numero == numeroContaSaq) {
                            conta.saca(valorSaq);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o número da conta para mostrar o extrato: ");
                    int numeroContaExt = scanner.nextInt();
                    for (ContaBancaria conta : contas) {
                        if (conta.numero == numeroContaExt) {
                            conta.tiraExtrato();
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nTransações realizadas:");
                    for (ContaBancaria conta : contas) {
                        System.out.println("Conta " + conta.numero + " realizou " + conta.transacoesRealizadas + " transações.");
                    }
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
