package ExercicioB1;

class FabricaLampada {
    public Lampada construir(String tipo) {
        if (tipo.equalsIgnoreCase("incandescente")) {
            return new Incandescente();
        } else if (tipo.equalsIgnoreCase("fluorescente")) {
            return new Fluorescente();
        } else {
            System.out.println("Tipo de lâmpada inválido.");
            return null;

        }
    }
}
