
package keramik2project;
public class Keramik2Project {
    public static void main(String[] args) {
        /*instansiasi*/
        HargaKeramik2 k1 = new HargaKeramik2("A",30,30,10,54000);
        k1.hitungLuas();
        k1.kebutuhanKeramik();
        k1.hargaTotal();
        
        HargaKeramik2 k2 = new HargaKeramik2("B",40,40,5,65000);
        k2.hitungLuas();
        k2.kebutuhanKeramik();
        k2.hargaTotal();
        
        HargaKeramik2 k3 = new HargaKeramik2("C",30,40,8,60000);
        k3.hitungLuas();
        k3.kebutuhanKeramik();
        k3.hargaTotal();
    }
    
}
