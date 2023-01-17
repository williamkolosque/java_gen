package atividadeH06;

public class CursoLive extends Curso{

    protected int semestre;
    protected String plataforma;

    public CursoLive(int id, String curso, boolean ead, int semestre, String plataforma) {
        super(id, curso, ead);
        this.semestre = semestre;
        this.plataforma = plataforma;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void visualizar(){
        System.out.println("id: "+this.getId()+"\n Nome do curso: "+this.getCurso()+"\n Ead: "+this.isEad()
                +"\n Semestre: "+this.getSemestre()+"\n Plataforma: "+this.getPlataforma());
    }
}
