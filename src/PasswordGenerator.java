import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserire il Nome");
        String nome = input.nextLine();

        System.out.println("Inserire il Cognome");
        String cognome = input.nextLine();

        System.out.println("Inserire il Colore preferito");
        String colore = input.nextLine();

        System.out.println("Inserire la data di nascita");
        int giorno = input.nextInt();
        int mese = input.nextInt();
        int anno = input.nextInt();
        

        int sommaData = giorno + mese + anno ;

        String password = nome + "-" + cognome + "-" + colore + "-" + sommaData; 

        System.out.println("La tua password");
        System.out.println(password);


    }
}
