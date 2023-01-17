package atividadeH05;

public class Vip extends Ingresso{

    protected int quantidade;
    protected String patrocinador;

    public Vip(int id, String evento, String data, int quantidade, String patrocinador) {
        super(id, evento, data);
        this.quantidade = quantidade;
        this.patrocinador = patrocinador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public void visualizar(){
        System.out.println("Número do ingresso: "+this.getId()+"\n Nome do evento: "+this.getEvento()+"\nQuantidade: "+this.getQuantidade()
        +"\n Patrocinador: "+this.getPatrocinador());
    }


}
