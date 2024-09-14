import java.util.Scanner;

public class    SistemaGerenciamento {
    public static void main(String[] args) {
        Pilha historico = new Pilha();
        Fila atendimento = new Fila();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar solicitação ao histórico");
            System.out.println("2. Remover solicitação do histórico");
            System.out.println("3. Adicionar cliente à fila de atendimento");
            System.out.println("4. Atender próximo cliente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.print("ID da solicitação: ");
                    String id = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data: ");
                    String data = scanner.nextLine();
                    System.out.print("Hora: ");
                    String hora = scanner.nextLine();
                    historico.push(new Elemento(id, descricao, data, hora));
                    break;
                case 2:
                    Elemento removido = historico.pop();
                    if (removido != null) {
                        System.out.println("Solicitação removida: " + removido.id);
                    } else {
                        System.out.println("Histórico vazio.");
                    }
                    break;
                case 3:
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número de identificação: ");
                    String numero = scanner.nextLine();
                    System.out.print("Motivo do atendimento: ");
                    String motivo = scanner.nextLine();
                    atendimento.enqueue(new Elemento(nome, numero, motivo, ""));
                    break;
                case 4:
                    Elemento atendido = atendimento.dequeue();
                    if (atendido != null) {
                        System.out.println("Cliente atendido: " + atendido.id);
                    } else {
                        System.out.println("Fila de atendimento vazia.");
                    }
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}