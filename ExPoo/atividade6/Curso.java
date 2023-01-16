package atividade6;

public class Curso {

    private int id;
    private String curso;
    private int semestre;
    private boolean EAD;
    private double valor;

    public Curso(int id, String curso, int semestre, boolean EAD, double valor) {
        this.id = id;
        this.curso = curso;
        this.semestre = semestre;
        this.EAD = EAD;
        this.valor = valor;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public boolean isEAD() {
        return EAD;
    }

    public void setEAD(boolean EAD) {
        this.EAD = EAD;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void visualizar(){
        System.out.println(id);
        System.out.println(curso);
        System.out.println(semestre);
        System.out.println(EAD);
        System.out.println("R$"+valor);
    }
}
