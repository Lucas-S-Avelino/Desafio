import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        double totalVendido;
        double percentualComissao;
        double salario = 1650;

        System.out.print("Nome do vendedor: ");
        nome = leia.nextLine();

        System.out.print("Valor total de vendas: ");
        totalVendido = leia.nextDouble();

        System.out.print("Qual a percentual da comissão? ");
        percentualComissao = leia.nextDouble();

        double comissao = (totalVendido * (percentualComissao / 100));
        double bonus = 0.0;

        if (totalVendido >= 50000) {
            bonus = 1000;
        }

        double pagamento = salario + comissao + bonus;

        System.out.println("\nNome: " + nome);
        System.out.printf("Total vendido: R$ %.2f\n", totalVendido);
        System.out.printf("Comissão: R$ %.2f\n", comissao);
        System.out.printf("Bônus: R$ %.2f\n", bonus);
        System.out.printf("Pagamento: R$ %.2f\n", pagamento);
        leia.close();
    }
}
