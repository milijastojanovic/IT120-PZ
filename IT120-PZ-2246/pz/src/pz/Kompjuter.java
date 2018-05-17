/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pz;



/**
 *
 * @author Korisnik
 */
public class Kompjuter {
   
    static int kompIzbor;
    static int izgubljena;
    
    public Kompjuter(int kompIzbor, int izgubljena){
        this.kompIzbor = kompIzbor;
        this.izgubljena = izgubljena;
    }
    
    public int getKompIzbor(){
        return kompIzbor;
    }
    
    public void setKompIzbor(int kompIzbor){
        this.kompIzbor = kompIzbor;
    }
    
    public int getIzgubljena(){
        return izgubljena;
    }
    
    public void setIzgubljena(int izgubljena){
        this.izgubljena = izgubljena;
    }
    
    public static void izgubljena(){
        System.out.println("Kompjuterova pobeda: " + izgubljena);
    }
}
