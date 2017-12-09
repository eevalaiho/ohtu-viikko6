package ohtu;

import javax.swing.*;

public class Tuntematon extends Operaatio {

    public Tuntematon(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    protected void laske(int arvo) {
    }
}

