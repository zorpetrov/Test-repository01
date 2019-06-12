
package skripta13;

public class Pas extends Zivotinja {
    
    private String rasa;
    
    public Pas(String rasa, String ime){
        this.vrsta = "pas";
        this.ime = ime;
        this.glas = "Av, av.";
        this.glasLjut = "Grrrr!";
        this.kretanje = "četveronoške";
        this.rasa = rasa;
    }

    @Override
    public String glasanje(){
        return rasa + ", " + super.glasanje();
        
    }
}
