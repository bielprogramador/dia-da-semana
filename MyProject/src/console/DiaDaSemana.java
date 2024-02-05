package console;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        boolean diaValido = false;

        while (!diaValido) {
            System.out.print("Insira um dia da semana: ");
            String dia = enter.next();

            if (dia.equalsIgnoreCase("domingo")) {
                System.out.println("Dia 1");
                diaValido = true;
            } else if (dia.equalsIgnoreCase("segunda")) {
                System.out.println("Dia 2");
                diaValido = true;
            } else if (dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terça-feira")) {
                System.out.println("Dia 3");
                diaValido = true;
            } else if (dia.equalsIgnoreCase("quarta")) {
                System.out.println("Dia 4");
                diaValido = true;
            } else if (dia.equalsIgnoreCase("quinta") || dia.equalsIgnoreCase("quinta-feira")) {
                System.out.println("Dia 5");
                diaValido = true;
            } else if (dia.equalsIgnoreCase("sexta") || dia.equalsIgnoreCase("sexta-feira")) {
                System.out.println("Dia 6");
                diaValido = true;
            } else if (dia.equalsIgnoreCase("sabado")) {
                System.out.println("Dia 7");
                diaValido = true;
            } else {
                System.out.println("Dia Inválido! Por favor, insira um dia válido.");
            }
        }

        enter.close();
    }
}