import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        double total_vendido;
        double percentual_comissao;
        double salario = 1650;
        Boolean bonus = false;

        System.out.print("Nome do vendedor: ");
        nome = leia.nextLine();

        System.out.print("Valor total de vendas: ");
        total_vendido = leia.nextDouble();

        System.out.print("Qual a percentual da comissão? ");
        percentual_comissao = leia.nextDouble();

        double comissao = (total_vendido * (percentual_comissao / 100));

        if (total_vendido >= 50000) {
            comissao = comissao + 1000;
            bonus = true;

        } else {
            bonus = false;
        }
        double pagamento = salario + comissao;

        System.out.println("\nVendedor: " + nome + "\nTotal Vendido: " + total_vendido + "\nComissão: " + comissao
                + "\nBônus: " + bonus + "\nPagamento: " + pagamento);
        leia.close();
    }
}
