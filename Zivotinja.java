
package skripta13;

public abstract class Zivotinja {
    
    public String vrsta;
    public String glas;
    public String glasLjut;
    public String ime;
    public String kretanje;
    
    public String glasanje() {
        return vrsta + " se glasa sa: " + glas;
    }
    
    public String glasanjeLjut(){
        return vrsta + ", kad je ljut, se glasa sa: " + glasLjut;
    }
    
    public String kretanje(){
        return kretanje;
    }
    
}
