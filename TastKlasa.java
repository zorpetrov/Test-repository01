/*
13. Животиње – полиморфизам. Написати апстрактну класу Zivotinja, при чему сваку животињу
карактерише њена врста.  Класа треба да садржи метод за оглашавање животиње и метод за
оглашавање животиње у љутини, као и метод који описује начин кретања животиње. Дефинисати
класе Pas, Riba и Pingvin које наслеђују класу Zivotinja и класу ZlatniRetriver која наслеђује класу Pas.
Све конкретне врсте животиња карактеришу се својим именом, за пса је позната и његова раса, а за
рибу подврста. У тест-класи направити низ животиња који садржи по један примерак сваке
животињске врсте, а затим 4 пута случајно изабрати елемент низа, исписати податке о изабраној
животињи, као и начине њеног кретања и оглашавања.
 */
package skripta13;

public class TastKlasa {
    
    public static void main(String[] args){
        
        Pas cuko = new Pas("dodž","Džeki");
        System.out.println(cuko.glasanje());
        System.out.println(cuko.glasanjeLjut());
        
        Pingvin pingu = new Pingvin("Pingu");
        System.out.println(pingu.glasanje());
        System.out.println(pingu.glasanjeLjut());
        
        ZlatniRitriver zlaja = new ZlatniRitriver("Zlaja");
        System.out.println(zlaja.glasanje());
        System.out.println(zlaja.glasanjeLjut());
        
    }
    
}
