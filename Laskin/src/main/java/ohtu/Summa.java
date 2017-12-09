package ohtu;

import javax.swing.*;

public class Summa extends Operaatio {

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
    }

    @Override
    protected void laske(int arvo) {
        this.sovellus.plus(arvo);
    }
}
