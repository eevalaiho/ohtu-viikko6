package ohtu;

import javax.swing.*;

public class Nollaa extends Operaatio {

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    protected void laske(int arvo) {
        this.sovellus.nollaa();
    }
}