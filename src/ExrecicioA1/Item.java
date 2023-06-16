package ExrecicioA1;

abstract class Item {
    protected String nome;
    protected double preco;
    protected String codigoDeBarras;

    public Item(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    public abstract void mostrarDetalhesDoItem();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Item item = (Item) obj;
        return codigoDeBarras.equals(item.codigoDeBarras);
    }

    public abstract void mostraDetalhesDoItem ();

    public boolean buscarPorCodigoDeBarras(String codigo) {
        return codigoDeBarras.equals(codigo);
    }
}
