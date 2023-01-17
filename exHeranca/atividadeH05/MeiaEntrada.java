package atividadeH05;

public class MeiaEntrada extends Ingresso{
    protected boolean estudante;
    protected int quantidade;

    public MeiaEntrada(int id, String evento, String data, boolean estudante, int quantidade) {
        super(id, evento, data);
        this.estudante = estudante;
        this.quantidade = quantidade;
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void visualizar(){
        System.out.println("Número do ingresso: "+this.getId()+"\n Nome do evento: "+this.getEvento()+"\nQuantidade: "+this.getQuantidade()
                +"\n Estudante: "+this.isEstudante());
    }
}
