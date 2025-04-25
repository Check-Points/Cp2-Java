//Integrantes
//CAROLINA SANTANA FERRAZ - RM 86833
//EVELLYN VALENCIA - RM 557929
//MILENA CODINHOTO DA SILVA - RM 554682

package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Aluno {
        private int registroMatricula;
        private String nomeCompleto;
        private LocalDate dataDeNascimento;

        public Aluno(){

        }

        public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento){
                setRegistroMatricula(registroMatricula);
                setNomeCompleto(nomeCompleto);
                setDataDeNascimento(dataDeNascimento);
        }

        public int getRegistroMatricula() {

                return registroMatricula;
        }

        public void setRegistroMatricula(int registroMatricula) {

                try {
                        if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                                this.registroMatricula = registroMatricula;

                        } else {
                                throw new Exception("Registro de matrícula deve estar entre 80000 e 599999");

                        }
                } catch (Exception e) {
                    throw new RuntimeException(e);

                }
        }

        public String getNomeCompleto() {

                return nomeCompleto;
        }

        public void setNomeCompleto(String nomeCompleto) {

                this.nomeCompleto = nomeCompleto;
        }

        public LocalDate getDataDeNascimento() {

                return dataDeNascimento;
        }

        public void setDataDeNascimento(LocalDate dataDeNascimento) {
                LocalDate dataMinima = LocalDate.parse("1960-01-01");
                LocalDate dataAtual = LocalDate.now();

                try {
                        if (dataDeNascimento.isAfter(dataMinima) && dataDeNascimento.isBefore(dataAtual)) {
                                this.dataDeNascimento = dataDeNascimento;
                        } else {
                                throw new Exception("Data fora da faixa permitida");
                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        System.exit(0);
                }
        }
        public String calcularIdadeCompleta(LocalDate dataAtual) {
                Period periodo = Period.between(dataDeNascimento, dataAtual);
                return periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.";
        }
}
