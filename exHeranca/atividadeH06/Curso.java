package atividadeH06;

public class Curso {

    protected int id;
    protected String curso;
    protected boolean ead;

    public Curso(int id, String curso, boolean ead) {
        this.id = id;
        this.curso = curso;
        this.ead = ead;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isEad() {
        return ead;
    }

    public void setEad(boolean ead) {
        this.ead = ead;
    }

    public void visualizar(){

        System.out.println("Listagem de cursos");


    }

}
