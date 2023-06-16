package ExercicioB2;

public class ContaCorrente {
    private double valorConta;

    public ContaCorrente(double valorConta) {
        this.valorConta = valorConta;
    }


    public double calcularTributos() {
        return valorConta * 0.01; // 1% do valor da conta
    }
}

