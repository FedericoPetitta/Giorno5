//Creare una classe Piatto Speciale che ha ingredienti di tipo PRIVATE e ingredienti pubblic ( es: un panino normale o di sesamo ) e un prezzo specifico per ognuno di loro ( es ingr1 = 2 euro ) + una base di fisso ( prezzo = 1 euro ).
//Creare poi una classe menu che permetta in loop di ordinare il piatto speciale selezionando tra una lista gli ingredienti public e facendo inserire a mano gli ingredienti PRIVATE dopo aver stampato una lista dei possibili casi ( solo quelli devono essere accettati ) a quel punto calcolare il totale e riportare all'inizio.

public class PiattoSpeciale {
    //Attributi.
    public String ingrediente;
    public double prezzo;

    //Costruttore
    public PiattoSpeciale(String ingrediente, double prezzo) {
        this.ingrediente = ingrediente;
        this.prezzo = prezzo;
    }

    //Metodi
    public String getIngrediente(){
        return ingrediente;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void stampaInformazione(){
        System.out.print(ingrediente + "\t");
        System.out.print(prezzo + "\n");
    }
}