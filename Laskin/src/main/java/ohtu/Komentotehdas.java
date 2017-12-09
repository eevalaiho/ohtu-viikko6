package ohtu;

import javax.swing.*;
import java.util.HashMap;

public class Komentotehdas {
    private HashMap<String, Komento> komennot;

    public Komentotehdas(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        komennot = new HashMap<String, Komento>();
        komennot.put("summa", new Summa(sovellus, tuloskentta, syotekentta));
        komennot.put("erotus", new Erotus(sovellus, tuloskentta, syotekentta));
        komennot.put("nollaa", new Nollaa(sovellus, tuloskentta, syotekentta));
        komennot.put("tuntematon", new Tuntematon(sovellus, tuloskentta, syotekentta));
    }

    public Komento hae(String operaatio) {
        Komento komento = komennot.get(operaatio);
        if (komento == null) {
            komento = komennot.get("tuntematon");
        }
        return komento;
    }
}