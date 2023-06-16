package ExercicioA2;

class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    public float calcularPerimetro() {
        return altura;
    }

    public float getLado() {
        return lado;
    }

    public float getAltura() {
        return altura;
    }
}

