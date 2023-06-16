package ExrecicioA1;

public class CD extends Item{
    private final int numeroDeFaixas;

    public CD(String nome, double preco, int numeroDeFaixas, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem () {
        System.out.println("CD: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Número de faixa: " + numeroDeFaixas);
        System.out.println("Código de barras: " + codigoDeBarras);
    }

    @Override
    public void mostraDetalhesDoItem() {

    }
}
