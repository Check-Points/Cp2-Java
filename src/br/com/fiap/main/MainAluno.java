//Integrantes
//CAROLINA SANTANA FERRAZ - RM 86833
//EVELLYN VALENCIA - RM 557929
//MILENA CODINHOTO DA SILVA - RM 554682

package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAluno {
    public static void main(String[] args) {

        String nome1, nome2, rm1, rm2, dataNasc1, dataNasc2;
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Alunos com dados fixos
        Aluno aluno3 = new Aluno(554682, "Milena Codinhoto da Silva", LocalDate.of(2005, 10, 10));
        Aluno aluno4 = new Aluno(86833, "Carolina Santana Ferraz", LocalDate.of(2003, 2, 17));

        // Alunos preenchidos via entrada do usuário
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        try {
            // Dados do aluno 1
            nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro aluno:");
            rm1 = JOptionPane.showInputDialog("Digite o RM do primeiro aluno:");
            dataNasc1 = JOptionPane.showInputDialog("Digite a data de nascimento (dd/MM/yyyy):");
            aluno1.setNomeCompleto(nome1);
            aluno1.setRegistroMatricula(Integer.parseInt(rm1));
            aluno1.setDataDeNascimento(LocalDate.parse(dataNasc1, formatter));

            // Dados do aluno 2
            nome2 = JOptionPane.showInputDialog("Digite o nome do segundo aluno:");
            rm2 = JOptionPane.showInputDialog("Digite o RM do segundo aluno:");
            dataNasc2 = JOptionPane.showInputDialog("Digite a data de nascimento (dd/MM/yyyy):");
            aluno2.setNomeCompleto(nome2);
            aluno2.setRegistroMatricula(Integer.parseInt(rm2));
            aluno2.setDataDeNascimento(LocalDate.parse(dataNasc2, formatter));

            JOptionPane.showMessageDialog(null, String.format("Aluno1 \nRm: %s \nNome: %s \nIdade: %s",aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdadeCompleta(dataAtual)));
            JOptionPane.showMessageDialog(null, String.format("Aluno2 \nRm: %s \nNome: %s \nIdade: %s",aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdadeCompleta(dataAtual)));
            JOptionPane.showMessageDialog(null, String.format("Aluno3 \nRm: %s \nNome: %s \nIdade: %s",aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdadeCompleta(dataAtual)));
            JOptionPane.showMessageDialog(null, String.format("Aluno4 \nRm: %s \nNome: %s \nIdade: %s",aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdadeCompleta(dataAtual)));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }
}

