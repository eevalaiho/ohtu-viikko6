package ohtu;

import javax.swing.*;

public class Erotus extends Operaatio {

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    protected void laske(int arvo) {
        this.sovellus.miinus(arvo);
    }
}
