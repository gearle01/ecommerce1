
public final class ClienteComum extends Pessoa {

    int saldoPontos;
    double valorEmCompras;

    public ClienteComum() { // Método cosntrutor original

    }

    public ClienteComum(String nomeCliente, String senhaCliente, String emailCliente) { // Método construtor com polimorfismo
        this.setNomeP(nomeCliente);
        this.setEmailP(senhaCliente);
        this.setSenhaP(senhaCliente);
        this.geradorId();
    }
    // Dados do cliente

    public void dadosClienteComun() {

        System.out.println("Id: " + this.getIdP()); //Mostra o id
        System.out.println("Nome: " + this.getNomeP()); //Mostra o nome
        System.out.println("E-mail: " + this.getEmailP()); //Mostra o e-mail
        System.out.println("Senha: " + this.getSenhaP()); //Mostra o senha
        System.out.println("Valor das compras: " + this.valorEmCompras); //Mostra o valor das compras
        System.out.println("Saldo de pontos: " + this.saldoPontos); //Mostra a pontuação
        System.out.println("Sua categoria é : Cliente Comun\n"); //Mostra a categoria
    }
}
