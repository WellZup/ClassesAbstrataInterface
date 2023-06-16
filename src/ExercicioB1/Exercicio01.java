package ExercicioB1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        FabricaLampada fabrica = new FabricaLampada();

        System.out.println("Qual lâmpada você deseja construir? (incandescente/fluorescente)");
        Scanner entrada = new Scanner(System.in);
        String tipoLampada = entrada.nextLine();

        Lampada lampada = fabrica.construir(tipoLampada);

        if (lampada != null) {
            lampada.ligar();
            lampada.desligar();
        }
    }

}

