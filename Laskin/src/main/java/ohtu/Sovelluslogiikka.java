package ohtu;


import javafx.beans.property.Property;

import java.util.Stack;

public class Sovelluslogiikka {

    int tulos = 0;
    Stack<Integer> edellTulokset = null;

    public void plus(int luku) {
        edellTulokset.push(tulos);
        tulos += luku;
    }
     
    public void miinus(int luku) {
        edellTulokset.push(tulos);
        tulos -= luku;
    }
 
    public void nollaa() {
        edellTulokset.push(tulos);
        tulos = 0;
    }
 
    public int tulos() {
        return tulos;
    }

    public void peru() {
        if (!edellTulokset.isEmpty())
            this.tulos = edellTulokset.peek();
        else
            this.tulos = 0;
    }

    public Sovelluslogiikka() {
        edellTulokset = new Stack<Integer>();
    }
}