import StatusAluno.StatusAlunos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) {
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();


        List<Aluno> listaAluno = new ArrayList<Aluno>();

            String continuar;
            do {
                Aluno aluno1 = new Aluno();
                String nome = JOptionPane.showInputDialog("Nome do Aluno: ");
                aluno1.setNomeAluno(nome);

                for (int pos = 1; pos <= 4; pos++) {
                    DisciplinaNotas disciplina = new DisciplinaNotas();
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina: " + pos);
                    String notaDisciplina = JOptionPane.showInputDialog("Nota: " + pos);

                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.parseDouble(notaDisciplina) - 1);

                    aluno1.getDisciplina().add(disciplina);
                }
                listaAluno.add(aluno1);
                continuar = JOptionPane.showInputDialog("Deseja adicionar outro aluno? (S/N)");
            }while (continuar.equalsIgnoreCase("S")) ;


        maps.put(StatusAlunos.APROVADO, new ArrayList<>());
        maps.put(StatusAlunos.RECUPERACAO, new ArrayList<>());
        maps.put(StatusAlunos.REPROVADO, new ArrayList<>());


        for (Aluno aluno : listaAluno) {
            if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.APROVADO)) {
                maps.get(StatusAlunos.APROVADO).add(aluno);

            } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.RECUPERACAO)) {
                maps.get(StatusAlunos.RECUPERACAO).add(aluno);

            } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.REPROVADO)){
                maps.get(StatusAlunos.REPROVADO).add(aluno);
            }
        }


        System.out.println("------------ Alunos Aprovado ------------");
        for (Aluno aluno : maps.get(StatusAlunos.APROVADO) ) {
            System.out.println("Aluno: " + aluno.getNomeAluno());
            System.out.println("resultado: " + aluno.getAlunoAprovado2());
            System.out.println("Media: " + aluno.getMediaNotas());
        }

        System.out.println("------------ Alunos em Recuperação ------------");
        for (Aluno aluno : maps.get(StatusAlunos.RECUPERACAO) ) {
            System.out.println("Aluno: " + aluno.getNomeAluno());
            System.out.println("resultado: " + aluno.getAlunoAprovado2());
            System.out.println("Media: " + aluno.getMediaNotas());
        }

        System.out.println("------------ Alunos Reprovados ------------");
        for (Aluno aluno : maps.get(StatusAlunos.REPROVADO) ) {
            System.out.println("Aluno: " + aluno.getNomeAluno());
            System.out.println("resultado: " + aluno.getAlunoAprovado2());
            System.out.println("Media: " + aluno.getMediaNotas());
        }

    }}