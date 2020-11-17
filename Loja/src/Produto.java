import java.util.Random;

public class Produto {

    //atributos 
    private int idProduto; //Atributo
    private int estoqueDeProduto; //Atributo
    private double valorUnidade; //Atributo

    public static Produto[] gerarProdutos(int qtdDeProdutos) { // gerador de produtos

        Produto[] arrayProdutos = new Produto[qtdDeProdutos]; // Instacia o novo produto
        if (qtdDeProdutos == 0) {
            System.out.println("Não foi possivel gerar produto."); // Mensagem de erro
            return null;
        } else {
            Random numero = new Random(); // Instancia um novo objeto numero
            for (int indice = 0; indice < arrayProdutos.length; indice += 1) { // Parâmetros para gerar o novo produto
                Produto produto = new Produto();
                produto.geraIdProduto();
                produto.GVUA();
                produto.setEstoqueDeProduto(numero.nextInt(15)); //Gera números de 0 a 14
                arrayProdutos[indice] = produto;
            }
            return arrayProdutos;
        }


    }

    public int getIdProduto() { //Método de acesso
        return idProduto;
    }

    public void setIdProduto(int idProduto) { //Método de acesso
        this.idProduto = idProduto;
    }

    public int getEstoqueDeProduto() { //Método de acesso
        return estoqueDeProduto;
    }

    public void setEstoqueDeProduto(int estoqueDeProduto) { //Método de acesso
        this.estoqueDeProduto = estoqueDeProduto;
    }

    public double getValorUnidade() { //Método de acesso
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) { //Método de acesso
        this.valorUnidade = valorUnidade;
    }

    public double atualizarEstoque() { //Método que atualiza o estoque
        return 0;
    }

    public void geraIdProduto() { //Gerador de id aleatório
        Random numeroAleatorio = new Random();
        int numeroGerado = numeroAleatorio.nextInt(100); //gera um número aleatório de 0 à 99
        this.idProduto = numeroGerado;// Atribui o número gerado ao id
    }

    public void GVUA() { // gera o preço dos produtos de forma aleatoria. GVUA = gerar valor unidade aleatoria
        double numeroAleatorio = Math.random() * 10; //Gera valor aleatorio entre 0.0 e 1.0
        this.valorUnidade = numeroAleatorio;
    }

    public void mostrarDados() {
        System.out.println("Id: " + this.getIdProduto());
        System.out.println("Quantidade em estoque: " + this.getEstoqueDeProduto());
        System.out.println("Valor unidade: \n" + this.getValorUnidade());
    }

}