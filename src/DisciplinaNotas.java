import java.util.Objects;

public class DisciplinaNotas {
    private String disciplina;
    private double nota;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DisciplinaNotas that = (DisciplinaNotas) o;
        return Double.compare(that.nota, nota) == 0 && Objects.equals(disciplina, that.disciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, nota);
    }

    @Override
    public String toString() {
        return "DisciplinaNotas{" +
                "disciplina='" + disciplina + '\'' +
                ", nota=" + nota +
                '}';
    }
}
