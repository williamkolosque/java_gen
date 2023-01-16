package atividade2;

public class TestaFuncionario {
    public static void main(String[] args) {

      Funcionario funcionario = new Funcionario(1, "João",34,"Desenvolvedor", 4000);
        Funcionario funcionario2 = new Funcionario(2, "Pablo",32,"Backend", 5000);

        funcionario.visualizar();
        funcionario2.visualizar();
    }
}
