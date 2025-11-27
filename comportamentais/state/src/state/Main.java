package state;

import state.states.EmManutencao;
import state.states.PreparandoBebida;
import state.states.SemIngrediente;
import state.states.ProntoParaVenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaCafe maquina = new MaquinaCafe(new ProntoParaVenda());

        System.out.println("=== Bem-vindo à Máquina de Café ===");

        while (true) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Selecionar produto");
            System.out.println("2 - Pagar café");
            System.out.println("3 - Retirar produto");
            System.out.println("4 - Colocar em manutenção");
            System.out.println("5 - Simular falta de ingrediente");
            System.out.println("6 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do café: ");
                    String produto = scanner.nextLine();
                    maquina.selecionarProduto(produto);
                    break;
                case 2:
                    maquina.pagarCafe();
                    break;
                case 3:
                    maquina.retirarProduto();
                    break;
                case 4:
                    maquina.setEstado(new EmManutencao());
                    System.out.println("Máquina agora está em manutenção.");
                    break;
                case 5:
                    maquina.setEstado(new SemIngrediente());
                    System.out.println("Máquina agora está sem ingredientes.");
                    break;
                case 6:
                    System.out.println("Encerrando... até a próxima!");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }

            // Simula retorno ao estado padrão após retirada
            if (maquina.getEstadoAtual() instanceof PreparandoBebida) {
                maquina.setEstado(new ProntoParaVenda());
                System.out.println("Máquina pronta para nova venda.");
            }
        }
    }
}