package ExrecicioA1;

 class Livro extends Item {
     private String autor;
     public Livro(String nome, String autor, String codigoDeBarras, double preco) {
         super(nome, preco, codigoDeBarras);
         this.autor = autor;
     }

     @Override
     public void mostrarDetalhesDoItem () {
         System.out.println("Livro: " + nome);
         System.out.println("Preço: " + preco);
         System.out.println("Autor: " + autor);
         System.out.println("Código de barras: " + codigoDeBarras);
     }

     @Override
     public void mostraDetalhesDoItem() {

     }


 }
