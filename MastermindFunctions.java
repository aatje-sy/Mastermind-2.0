import java.util.Random;
import java.util.Scanner;

public class MastermindFunctions {

//Dit is de random code genereren functie
    public int[] randomCode() {

        int[] code = new int[4];
        Random rand = new Random();

        for (int i = 0; i < code.length; i++) {

            code[i] = rand.nextInt(5);
            System.out.println(code[i]);


        }
        return code;
    }
    //dit functie laat je 4 codes raden (invoeren)
    public int[]raadFunctie(){
        Scanner sc = new Scanner(System.in);

        int[]raad = new int[4];

        for (int x = 0; x < raad.length; x++){
            raad[x] = sc.nextInt();
        }
        return raad;
    }

    //In dit functie vergelijk ik de random code met de ingevoerde code
    public void vergelijking(int[] raden, int[] geheimecode){

        if (raden[0] == geheimecode[0]) {
            System.out.println("Code 1: Juist Antwoord!");
        } else if (raden[0] == geheimecode[1] || raden[0] == geheimecode[2] || raden[0] == geheimecode[3]) {
            System.out.println("Code 1: Je hebt de Juiste antwoord Bijna!");
        } else if (raden[0] != geheimecode[0] || raden[0] != geheimecode[1] || raden[0] != geheimecode[2] || raden[0] != geheimecode[3]) {
            System.out.println("Code 1: Dit code is fout");
        }else {
            System.out.println("Error");
        }

        if (raden[1] == geheimecode[1]) {
            System.out.println("Code 2: Juist Antwoord!");
        } else if (raden[1] == geheimecode[0] || raden[1] == geheimecode[2] || raden[1] == geheimecode[3]) {
            System.out.println("Code 2: Je hebt de Juiste antwoord Bijna!");
        } else if (raden[1] != geheimecode[0] || raden[1] != geheimecode[1] || raden[1] != geheimecode[2] || raden[1] != geheimecode[3]) {
            System.out.println("Code 2: Dit code is fout");
        }else {
            System.out.println("Error");
        }

        if (raden[2] == geheimecode[2]) {
            System.out.println("Code 3: Juist Antwoord!");
        } else if (raden[2] == geheimecode[0] || raden[2] == geheimecode[1] || raden[2] == geheimecode[3]) {
            System.out.println("Code 3: Je hebt de Juiste antwoord Bijna!");
        } else if (raden[2] != geheimecode[0] || raden[2] != geheimecode[1] || raden[2] != geheimecode[2] || raden[2] != geheimecode[3]) {
            System.out.println("Code 3: Dit code is fout");
        }else {
            System.out.println("Error");
        }

        if (raden[3] == geheimecode[3]) {
            System.out.println("Code 4: Juist Antwoord!");
        } else if (raden[3] == geheimecode[0] || raden[3] == geheimecode[1] || raden[3] == geheimecode[2]) {
            System.out.println("Code 4: Je hebt de Juiste antwoord Bijna!");
        } else if (raden[3] != geheimecode[0] || raden[3] != geheimecode[1] || raden[3] != geheimecode[2] || raden[3] != geheimecode[3]) {
            System.out.println("Code 4: Dit code is fout");
        }else {
            System.out.println("Error");
        }

    }
}

