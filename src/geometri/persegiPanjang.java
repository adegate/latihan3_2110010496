
package geometri;

public class persegiPanjang {
    private double panjang, lebar;

    public persegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }    
    double luasPersegi(){
        return panjang * lebar ;
    } 

    double kelilingPersegi(){
        return 2 * (panjang+lebar) ;
    }
}
    
