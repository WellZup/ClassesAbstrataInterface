package ExercicioA2;

public class Tetes {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];

        formas[0] = new Retangulo(5.5f, 3.5f);
        formas[1] = new Circulo(3.8f);
        formas[2] = new Quadrado(6.0f);
        formas[3] = new Retangulo(6.0f, 4.0f);
        formas[4] = new Circulo(4.8f);

//        for (Forma forma : formas) {
//            System.out.println("Área: " + forma.calcularArea());
//            System.out.println("Perímetro: " + forma.calcularPerimetro());
//            System.out.println();
//        }


        for (Forma forma : formas) {
            if (forma instanceof Retangulo) {

                Retangulo retangulo = (Retangulo) forma;
                System.out.println("Retângulo");
                System.out.println("Lado: " + retangulo.getLado());
                System.out.println("Altura" + retangulo.getAltura());


            } else if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                System.out.println("Circulo");
                System.out.println("Raio" + circulo.getRaio());

            } else if (forma instanceof Quadrado) {
                Quadrado quadrado = (Quadrado) forma;
                System.out.println("Quadrado");
                System.out.println("Lado" + quadrado.getLado());

            }
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
            System.out.println();
        }

    }
}
