package atividadeH06;

public class Especialização extends Curso{
    protected String pos;

    public Especialização(int id, String curso, boolean ead, String pos) {
        super(id, curso, ead);
        this.pos = pos;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public void visualizar(){
        System.out.println("id: "+this.getId()+"\n Nome do curso: "+this.getCurso()+"\n Ead: "+this.isEad()
                +"\n Pos: "+this.getPos());
    }
}
