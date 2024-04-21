import StatusAluno.StatusAlunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

    private String nomeAluno;
    private int idade;

    private List<DisciplinaNotas> disciplina = new ArrayList<DisciplinaNotas>();

    public void setDisciplina(List<DisciplinaNotas> disciplina) {
        this.disciplina = disciplina;
    }

    public List<DisciplinaNotas> getDisciplina() {
        return disciplina;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }


    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMediaNotas() {
        double somarNotas = 0;

        for (DisciplinaNotas disciplinaNotas : disciplina) {
            somarNotas += disciplinaNotas.getNota();
        }
        return somarNotas / disciplina.size();

    }
    public String getAlunoAprovado2(){
        double media = this.getMediaNotas();
        if(media >= 7.0) {
            return StatusAlunos.APROVADO;
        }else if(media >= 5){
            return StatusAlunos.RECUPERACAO;
        }else{
            return StatusAlunos.REPROVADO;
        }


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nomeAluno, aluno.nomeAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeAluno, idade);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", idade=" + idade +
                '}';
    }
}
