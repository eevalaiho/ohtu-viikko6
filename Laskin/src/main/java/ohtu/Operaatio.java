package ohtu;

import javax.swing.*;
import java.util.Stack;

public abstract class Operaatio implements Komento {
    JTextField tuloskentta, syotekentta;
    Sovelluslogiikka sovellus;

    public Operaatio(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        }
        catch (Exception e) {}

        laske(arvo);
        syotekentta.setText("");
        tuloskentta.setText("" + sovellus.tulos);
    }

    @Override
    public void peru() {
        sovellus.peru();
        tuloskentta.setText("" + sovellus.tulos);
    }

    protected abstract void laske(int arvo);
}