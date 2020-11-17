import java.util.Random;

public abstract class Pessoa { // Clssse Pessoa abstrata. Ela não pode ser instanciada

    //atributos da classse
    private int idP;
    private String nomeP;
    private String emailP;
    private String senhaP;


    public Pessoa() {       //metodo costrutor original

    }

    public int getIdP() {       //metodos de acesso e de adição de dados criado pela ide
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getSenhaP() {
        return senhaP;
    }

    public void setSenhaP(String senhaP) {
        this.senhaP = senhaP;
    }

    public void geradorId() { // metodo retirado de https://dicasdejava.com.br/como-gerar-um-numero-aleatorio-em-java/
        Random aleatorio = new Random();

        int numeroGerado = aleatorio.nextInt(100); //Gera um numero entre 0 e 99

        this.idP = numeroGerado; // Adiciona o id com o número gerado
    }
}
