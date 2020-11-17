
public final class ClienteEspecial extends Pessoa {

    int saldoPontos;
    double valorEmCompras;

    public ClienteEspecial() { //Método construtor original

    }

    public ClienteEspecial(String nomeCliente, String senhaCliente, String emailCliente) { //Método constrtutor com polimorfismo
        this.setNomeP(nomeCliente);
        this.setSenhaP(senhaCliente);
        this.setEmailP(emailCliente);
        this.geradorId();
    }

    public static ClienteEspecial gerarClienteEspecial(ClienteComum pesssoaCliente) { // Gera um cliente especial
        if (pesssoaCliente == null) {
            System.out.println("Cliente especial não foi criado"); // Mensagem que não criou o cliente
            return null;
        } else { // Transferinda as informações

            ClienteEspecial clienteEspecial = new ClienteEspecial();
            clienteEspecial.setNomeP(pesssoaCliente.getNomeP());
            clienteEspecial.setEmailP(pesssoaCliente.getEmailP());
            clienteEspecial.setSenhaP(pesssoaCliente.getSenhaP());
            clienteEspecial.saldoPontos = pesssoaCliente.saldoPontos;
            clienteEspecial.valorEmCompras = pesssoaCliente.valorEmCompras;
            clienteEspecial.geradorId();
            return clienteEspecial;
        }
    }

    public void dadosClienteEspecial() {
        System.out.println("Id: " + this.getIdP()); //Mostra o id
        System.out.println("Nome: " + this.getNomeP()); //Mostra o nome
        System.out.println("E-mail: " + this.getEmailP()); //Mostra o e-mail
        System.out.println("Senha: " + this.getSenhaP()); //Mostra o senha
        System.out.println("Valor das compras: " + this.valorEmCompras); //Mostra o valor das compras
        System.out.println("Saldo de pontos: " + this.saldoPontos); //Mostra a pontuação
        System.out.println("Sua categoria é : Cliente Comun\n"); //Mostra a categoria
    }

}
