package ExercicioA2;

class Circulo extends Forma {

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }
    @Override
    public float calcularArea () {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float calcularPerimetro() {
        return 0;
    }

    public float getRaio() {
        return raio;
    }
}
