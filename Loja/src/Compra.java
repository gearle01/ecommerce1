import java.util.ArrayList;
import java.util.Random;

public class Compra implements MudancaDeCategoria {


    private int idCompra; // atributo

    private ClienteComum cliente; // atributo

    private final ArrayList<Produto> produtos = new ArrayList<Produto>(); // atributo

    private double valorDaCompra; // atributo

    // Métodos de acesso aos atributos

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public ClienteComum getCliente() {
        return cliente;
    }

    public void setCliente(ClienteComum cliente) {
        this.cliente = cliente;
    }


    public ArrayList<Produto> getProdutos() { // Retorna a lista de produtos
        return produtos;
    }

    public void setProdutos(Produto produtoNovo) { //Lista de produtos do cliente
        this.produtos.add(produtoNovo);
    }

    public double getValorDaCompra() { // Método de acesso
        return valorDaCompra;
    }

    public void setValorDaCompra(double valorDaCompra) { // Seta um valor para compra
        this.valorDaCompra = valorDaCompra;
    }

    public double valorTotal() { // Soma o valor das compras

        if (this.produtos.isEmpty()) { // Verificando se a lista esta vazia
            System.out.println("Cliente: " + this.cliente.getNomeP() + " não fez nenhuma compra ");
            return 0;
        } else { // Somando o valor
            double valorDaSoma = 0.0;
            for (int lista = 0; lista < this.produtos.size(); lista++) { // Parâmetros para soma
                valorDaSoma = valorDaSoma + this.produtos.get(lista).getValorUnidade(); // Soma dos valores dos produtos
            }
            this.valorDaCompra = valorDaSoma;
            this.cliente.valorEmCompras = valorDaSoma;
            return valorDaSoma;
        }
    }

    public int converssorDePontos() { // converte os pontos

        int pontos = 0; // Valor inicia da quantidade de pontos
        int valor = this.inteiro(this.valorDaCompra); //

        for (int lista = 0; lista < valor; lista += 1) { // parametros para converssão
            if (lista % 2 == 0) { // Verifica se o número é divisivel por 2
                pontos = pontos + 1; // Adiciona mais 1 ponto
            }
        }
        this.cliente.saldoPontos = pontos; // Adicona os pontos ao cliente
        return pontos;
    }

    @Override
    public boolean verificarCategoria() { // Verifica em qual categoria o cliente está
        // Valor minimo atingido
        // Manteve o cliente na mesma categoria
        return this.cliente.saldoPontos >= valorMinimo; // Cliente foi mudado de categoria

    }

    private int inteiro(double valor) { //Converte o valor double para o tipo String

        String valorT = Double.toString(valor);
        String[] convertido = new String[valorT.length()]; //cria vetor de string

        try {
            convertido = valorT.split("[.]"); // Os caracteres digitados dentro do parentese serão considerados um grupo de caracters
            return Integer.parseInt(convertido[0]); //Parte inteira do valor
        } catch (Exception e) { // Captura o erro
            System.out.println("Erro ao separar a string" + e); // mensagem de erro + erro de exceção
            return 0;
        }
    }

    public void geradorDeId() {
        Random numeroAeatorio = new Random();
        int numeroGerado = numeroAeatorio.nextInt(100); // Gera um id de 0 à 99
        this.idCompra = numeroGerado; // Atribui o número gerado a compra da pessoa
    }

    public void dadosCompra() { // Mostra a compra
        System.out.println("Id: " + this.getIdCompra()); // Mostra o id
        System.out.println("Nome: " + this.cliente.getNomeP()); // Mostra o nome
        System.out.println("Valor da compra: " + this.getValorDaCompra()); // Mostra o valor da compra

    }
}
