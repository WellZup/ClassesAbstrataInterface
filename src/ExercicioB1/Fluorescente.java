package ExercicioB1;

class Fluorescente implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Lâmpada fluorescente ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Lâmpada fluorescente desligada.");
    }
}

