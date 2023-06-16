package ExercicioB2;

public class Exercicio02 {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente(2000.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributoContaPoupanca = contaPoupanca.calcularTributos();
        double tributoContaCorrente = contaCorrente.calcularTributos();
        double tributoSeguroDeVida = seguroDeVida.calcularTributos();

        System.out.println("Tributo da Conta Poupança: " + tributoContaPoupanca);
        System.out.println("Tributo da Conta Corrente: " + tributoContaCorrente);
        System.out.println("Tributo do Seguro de Vida: " + tributoSeguroDeVida);
    }
}
