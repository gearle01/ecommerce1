
public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo");
        ClienteComum clienteComum1 = new ClienteComum("Beta", "123", "beta@beta.com.br"); //Criação de um cliente
        clienteComum1.dadosClienteComun(); //Mostrando seus dados

        Produto[] listaProdutos = Produto.gerarProdutos(5); //criando produtos

        System.out.println("produtos\n"); //Mostrando os produtos criados
        for (int produtos = 0; produtos < listaProdutos.length; produtos++) {
            listaProdutos[produtos].mostrarDados();
        }


        Compra compra = new Compra(); //Cliente comun fazendo uma compra
        compra.setCliente(clienteComum1); //Cliente 1 comprando
        compra.geradorDeId();


        for (int comprou = 0; comprou < listaProdutos.length; comprou++) { //cliente comprou produtos
            compra.setProdutos(listaProdutos[comprou]);
        }

        System.out.println("Dados da compra\n"); //Mostrando os dados da compra
        compra.dadosCompra();
        System.out.println("Valor total\n"); //Calculando o valor da compra
        compra.valorTotal();
        System.out.println("Pontos do cliente\n"); //Calculando os pontos do cliente
        compra.converssorDePontos();
        System.out.println("Dados da compra\n"); //Mostrando o estado atual da compra
        compra.dadosCompra();
        System.out.println("Pontos ganhos " + compra.converssorDePontos());
        System.out.println("Dados do cliente após a compra\n"); //Mostra os dados atualizados
        clienteComum1.dadosClienteComun();
        if (compra.verificarCategoria()) { //Verifica se ouve mudança de categoria
            System.out.println("Cliente: " + clienteComum1.getNomeP() + " com total de " + clienteComum1.saldoPontos + " pontos pode mudar de categoria.\n");
            System.out.println("Valor mínimo de pontos foi atingido\n");
            ClienteEspecial clienteEspecial = ClienteEspecial.gerarClienteEspecial(clienteComum1); // Cria um novo objeto do tipo cliente especial
            System.out.println("Cliente especial\n");
            clienteEspecial.dadosClienteEspecial();
        } else {
            System.out.println("Cliente: " + clienteComum1.getNomeP() + " com total de  " + clienteComum1.saldoPontos + " não pode trocar de categoria");
        }

    }
}
