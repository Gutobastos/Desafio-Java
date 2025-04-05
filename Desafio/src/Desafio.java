import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner formulario = new Scanner(System.in);
        String nome = "Fabricio Augusto Olievira Bastos";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        System.out.println("*********************************************************************");
        System.out.println("\nDados do cliente:");
        System.out.println(" ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipor de conta: " + tipoConta);
        System.out.println("Saldo Atual: R$ " + saldoConta);
        System.out.println("\n*********************************************************************");
        double valorRecebido;
        double valorTransferir;
        int decisao = 0;
        while (decisao != 5) {
            System.out.println("\nOperações");
            System.out.println("\nDigite a opção desejada:");
            System.out.println("\n1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            int opcao = formulario.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Saldo: " + saldoConta);
                    break;
                case 2 :
                    System.out.println("Digite o valor recebido:");
                    valorRecebido = formulario.nextDouble();
                    saldoConta = saldoConta + valorRecebido;
                    System.out.println("Saldo atualizado: R$ " + saldoConta);
                    System.out.println("""
                            
                            """);
                    break;
                case 3:
                    System.out.println("Digite o valor que seja transferir:");
                    valorTransferir = formulario.nextDouble();
                    if (valorTransferir <= saldoConta) {
                        saldoConta = saldoConta - valorTransferir;
                        System.out.println("Saldo atualizado: R$ " + saldoConta);
                        System.out.println("""
                                
                                """);
                    } else {
                        System.out.println("Operação cancelada, seu saldo é insufuciente !");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    decisao = 5;
                    break;
            }
        }
    }
}
