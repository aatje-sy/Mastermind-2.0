public class MastermindMain {
    public static void main(String[] args) {

        MastermindFunctions master = new MastermindFunctions();

        //dit pogingen variabel is gebruikt om de while loop te laten lopen
        int pogingen = 1;

        //de geheimcodes + raadpoging ga ik gebruiken om de de -
        //vergelijking variabeles te connecten met dit main file
        int[] geheimcodes = master.randomCode();
        int[] raadpoging;

        //dit while loop is ongeveer hetzelfde als de vorige versie maar met functies
        while (pogingen < 11) {
            System.out.println("Je hebt " + pogingen + " van 10 pogingen");
            pogingen++;
            System.out.println("Voer je 4 cijferige code in tussen de 0-5:");

            //hier connect is de invoer functie met dit file
            raadpoging = master.raadFunctie();

            //hier roep ik de vergelijking functie -
            //en maak gebruik van de variabeles die ik hier maakte
            master.vergelijking(raadpoging, geheimcodes);

            //in dit if statement geef ik aan wat er moet gebeuren
            // als je de code invoert.
            if (geheimcodes[0] == raadpoging[0] && geheimcodes[1] == raadpoging[1] && geheimcodes[2] == raadpoging[2] && geheimcodes[3] == raadpoging[3]){
                System.out.println("Gefeliciteerd, je hebt de geheime code goed geraden!!");
                break;
            }else if (pogingen == 10){
                System.out.println("Helaas, je hebt de maximum aantal pogingen bereikt. Je hebt verloren");
                break;
            }else{
                System.out.println("Je hebt de code niet geraden, probeer het opnieuw!");
            }
        }
    }
}
