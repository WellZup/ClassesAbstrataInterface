package ExrecicioA1;

public class DVD extends Item{
    private final int duracao;

    public DVD (String nome, double preco, int duracao, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.duracao = duracao;
    }

    @Override
    public void mostrarDetalhesDoItem () {
        System.out.println("DVD: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Duração: " + duracao);
        System.out.println("Código de barras: " + codigoDeBarras);
    }

    @Override
    public void mostraDetalhesDoItem() {

    }
}
