import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Jaqueline Oliveira";
        String tipoConta = "Corrente";
        float saldoTotal = 1800;
        float deposito;
        float transferencia;
        int opcoesValor = 0;
        Scanner leitor = new Scanner(System.in);

        System.out.printf("""
                *****************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo atual: R$ %.2f
                ******************************
                %n""", nome, tipoConta, saldoTotal);

       String opcoes = """
                
                **Operações**
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a operação desejada:
                """;

        while (opcoesValor != 4) {
            System.out.println(opcoes);
            opcoesValor = leitor.nextInt();

            switch (opcoesValor) {
                case 1:
                    System.out.println("O Saldo da conta é: " + saldoTotal);
                    break;

                case 2:
                    System.out.println("Insira o valor a ser depositado:");
                    deposito = leitor.nextFloat();
                    saldoTotal += deposito;
                    System.out.println("Saldo atualizado: " + saldoTotal);
                    break;

                case 3:
                    System.out.println("Insira o valor a ser transferido:");
                    transferencia = leitor.nextFloat();
                    if (transferencia <= saldoTotal) {
                        saldoTotal -= transferencia;
                        System.out.println("Saldo atualizado: " + saldoTotal);
                    } else {
                        System.out.println("Saldo bancário insuficiente");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }

        } System.out.println("Operações concluídas! Até breve.");

        leitor.close();

    }
}