package org.example;

import org.example.composite.Gerente;
import org.example.folha.Desenvolvedor;
import org.example.folha.Designer;
import org.example.folha.FrontEnd;

public class EstruturaDaCompanhia {
    public static void main(String[] args) {

        // Folhas
        Empregado dev1 = new Desenvolvedor(1001, "Alice", "Desenvolvedor Java", 8000);
        Empregado dev2 = new Desenvolvedor(1002, "Bob", "Desenvolvedor Python", 6000);
        Empregado frontEnd = new FrontEnd(1003, "José", "Frontend Angular", 4500);
        Empregado designer1 = new Designer(1004, "Carol", "UX Designer", 5500);

        // Composite: SubGerente (também é um tipo de Gerente)
        Gerente subGerente = new Gerente(2001, "Maria", "Subgerente Angular", 7000);
        subGerente.addEmpregado(frontEnd); // Maria gerencia José

        // Composite: Engenheiro Chefe
        Gerente engChefe = new Gerente(3001, "David", "Engenheiro Chefe", 12000);
        engChefe.addEmpregado(dev1);
        engChefe.addEmpregado(dev2);
        engChefe.addEmpregado(subGerente); // David gerencia Maria

        // Composite: Gerente de Design
        Gerente gerenteDesign = new Gerente(3002, "Eve", "Gerente de Design", 8000);
        gerenteDesign.addEmpregado(designer1);

        // Composite: Gerente Geral
        Gerente gerenteGeral = new Gerente(4001, "Frank", "Gerente Geral", 15000);
        gerenteGeral.addEmpregado(engChefe);
        gerenteGeral.addEmpregado(gerenteDesign);

        // Exibir estrutura
        System.out.println("=== Organograma da Empresa ===");
        gerenteGeral.mostrarDetalhes(0);

        // Exibir salário total sob responsabilidade do gerente geral
        System.out.printf("\nSalário total sob responsabilidade de Frank: R$ %.2f\n", gerenteGeral.getSalario());
    }
}

