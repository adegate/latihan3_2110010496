
package geometri;

public class lingkaran {
     private double radius;

    public lingkaran(double radius){
        this.radius = radius;
    }

    double luasLingkaran(){
        return 3.14 * (radius * radius) ;
    } 

    double kelilingLingkaran(){
        return 2 * 3.14 * radius ;
    } 
}
