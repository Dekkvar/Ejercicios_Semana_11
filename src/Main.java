import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] winner = {(int) Math.floor(Math.random()*6),(int) Math.floor(Math.random()*10)};
        int[] boleto = new int[2];
        System.out.println("Bienvenido al nuevo sistema de loterías del Estado.");

        int select = 0;

        while (select == 0) {
            System.out.println("¿Desea un boleto aleatorio o escogerlo?: \n1 - Aleatorio. \n2 - Escogerlo.");
            select = input.nextInt();

            if (select == 1) {
                boleto[0] = (int) Math.floor(Math.random()*6);
                boleto[1] = (int) Math.floor(Math.random()*10);
                System.out.println("Su número de boleto es " + boleto[0] + boleto[1] + ".");
            } else if (select == 2) {
                int newSelect1 = 10;

                while (newSelect1 > 9) {
                    System.out.println("Por favor, intruduzca el valor entro 0 y 9 para el último dígito de su boleto:");
                    newSelect1 = input.nextInt();
                    if (newSelect1 > 9) {
                        System.out.println("El número no pertenece al rango indicado.");
                    } else {
                        boleto[1] = newSelect1;
                    }
                }

                int newSelect2 = 10;

                while (newSelect2 > 5) {
                    System.out.println("Por favor, intruduzca el valor entro 0 y 5 para el segundo dígito de su boleto:");
                    newSelect2 = input.nextInt();
                    if (newSelect2 > 5) {
                        System.out.println("El número no pertenece al rango indicado.");
                    } else {
                        boleto[0] = newSelect2;
                    }
                }

                System.out.println("Su número de boleto es " + boleto[0] + boleto[1] + ".");
            } else {
                System.out.println("Por favor, seleccione una opción válida.\n");
                select = 0;
            }
        }

        System.out.println("¿Desea comprobar su boleto?");
        int comp = input.nextInt();

        if (boleto[0] == winner[0] && boleto[1] == winner[1]) {
            System.out.println("FELICIDADES! Te ha tocado!");
        } else if (boleto[1] == winner[1]) {
            System.out.println("ENHORABUENA! El número premiado es el " + winner[0] + winner[1] + ", pero te ha tocado el reintegro!");
        } else {
            System.out.println("Lo siento, el boleto premiado es " + winner[0] + winner[1] + " y el reintegro es " + winner[1] +".");
        }
    }
}
