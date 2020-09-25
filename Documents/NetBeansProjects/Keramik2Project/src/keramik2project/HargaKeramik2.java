package keramik2project;

public class HargaKeramik2 {
    String keramik;
    int panjang,lebar,isi,harga,luasLantai;
    double luas,butuh,total;
    
    //constructor
    HargaKeramik2(String krmk,int p,int l, int i,int hrg){
    keramik = krmk;
    panjang = p;
    lebar = l;
    isi=i;
    harga=hrg;
    }
    
    double hitungLuas(){
        //Menghitung luas keramik per box//
        luas = (this.panjang * this.lebar * 0.0001)* this.isi ;
        return luas;     
    }
    
    double kebutuhanKeramik(){
        //Menghitung kebutuhan box keramik sesuai luas yg diinginkan//
        this.luasLantai=100;
        butuh = this.luasLantai / hitungLuas();
        butuh = Math.ceil(butuh);
        return butuh;
    }
    
    void hargaTotal(){
       //Menghitung harga total masing" keramik// 
        total = kebutuhanKeramik() * this.harga;
        System.out.println("Keramik = " + this.keramik + " Total Biaya = Rp " + (int)total);         
    }
}
