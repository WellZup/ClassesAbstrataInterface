package ExrecicioA1;

public class Loja {
    public static void main(String[] args) {
        Item [] produtos = new Item[5];

        produtos[0] = new Livro("Programação Orientada a Gambiarra", "O'REILLY", "43210", 19.99);
        produtos[1] = new CD("Cry DEV, Cry", 9.99, 12, "567890");
        produtos[2] = new DVD("O programador de HTML", 29.99, 240, "133546");
        produtos[3] = new Livro("Linguagem -GO Home-", "It's Real", "122333", 39.99);
        produtos[4] = new CD("Leave Alone QA", 19.99, 15, "44441");

        for (Item produto: produtos ) {
            produto.mostrarDetalhesDoItem();
            System.out.println();
        }

    }

    public static void buscarProduto(Item produto, Item[] produtos) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].buscarPorCodigoDeBarras(produto.codigoDeBarras)) {
                System.out.println("O produto " + produto.nome + " está na posição " + i + " do vetor.");
                return;
            }
        }
        System.out.println("O produto " + produto.nome + " não foi encontrado no vetor.");
    }


}
