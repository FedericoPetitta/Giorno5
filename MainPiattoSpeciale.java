import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class MainPiattoSpeciale {
    public static void main(String[] args) {
        boolean flag = true;
        final int prezzoBase = 1;
        ArrayList<PiattoSpeciale> elencoPiatto = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Operazioni disponibili: ");
            System.out.println("1. Lista degli ingredienti e prezzi. ");
            System.out.println("2. Scegli il tuo ingrediente.");
            System.out.println("3. Proponi il tuo ingrediente.");
            System.out.println("4. Esci.");
            int scelta1 = scanner.nextInt();
            switch (scelta1) {
                case 1:
                    PiattoSpeciale piatto1 = new PiattoSpeciale("pane", 5.50 + prezzoBase);
                    PiattoSpeciale piatto2 = new PiattoSpeciale("pasta", 7.20 + prezzoBase);
                    PiattoSpeciale piatto3 = new PiattoSpeciale("zucchine", 3.10 + prezzoBase);
                    PiattoSpeciale piatto4 = new PiattoSpeciale("carote", 1.80 + prezzoBase);
                    PiattoSpeciale piatto5 = new PiattoSpeciale("sale", 0.10 + prezzoBase);
                    PiattoSpeciale piatto6 = new PiattoSpeciale("zucchero", 0.40 + prezzoBase);
                    PiattoSpeciale piatto7 = new PiattoSpeciale("patate", 1.60 + prezzoBase);
                    PiattoSpeciale piatto8 = new PiattoSpeciale("lenticchie", 4.90 + prezzoBase);
                    elencoPiatto.add(piatto1);
                    elencoPiatto.add(piatto2);
                    elencoPiatto.add(piatto3);
                    elencoPiatto.add(piatto4);
                    elencoPiatto.add(piatto5);
                    elencoPiatto.add(piatto6);
                    elencoPiatto.add(piatto7);
                    elencoPiatto.add(piatto8);
                    System.out.println("Elenco degli ingredienti e prezzo.");
                    System.out.println("Ingrediente." + "\tPrezzo.");
                    for (int i = 0; i < elencoPiatto.size(); i++) {
                        elencoPiatto.get(i).stampaInformazione();
                    }
                    break;
                case 2:
                    System.out.println("Quale ingrediente preferisci?");
                    scanner.nextLine();
                    String scelta2 = scanner.nextLine();
                    boolean trovato = false;
                    for (int i = 0; i < elencoPiatto.size(); i++) {
                        if (Objects.equals(scelta2, elencoPiatto.get(i).getIngrediente())) {
                            elencoPiatto.get(i).stampaInformazione();
                            trovato = true;
                        }
                    }
                    if (!trovato) {
                        System.out.println("Siamo spiacenti, ingrediente non trovato.");
                    }
                    break;
                case 3:
                    System.out.println("Quale ingrediente vuoi aggiungere? ");
                    scanner.nextLine();
                    String scelta3 = scanner.nextLine();
                    System.out.println("Ottimo, ti comunichiamo che ogni ingrediente aggiunto costa 10 €.");
                    int prezzoScelta3 = 10 + prezzoBase;
                    System.out.println("Ecco il tuo ordine: " + scelta3 + " " + prezzoScelta3 + ".");
                    break;
                case 4:
                    System.out.println("Grazie per aver usato il nostro servizio, arrivederci!");
                    flag = false;
                    break;
                default:
                    System.out.println("Siamo spiacenti, operazione selezionata non valida.");
                    break;
            }
        }

    }
}
