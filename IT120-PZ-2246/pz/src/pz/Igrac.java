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
public class Igrac {
    
    static int mojIzbor;
    static int dobijena;
    
    public Igrac(int mojIzbor, int dobijena){
        this.mojIzbor = mojIzbor;
        this.dobijena = dobijena;
    }
    
    public int getMojIzbor(){
        return mojIzbor;
    }
    
    public void setMojIzbor(int mojIzbor){
        this.mojIzbor = mojIzbor;
    }
    
    public int getDobijena(){
        return dobijena;
    }
    
    public void setDobijena(int dobijena){
        this.dobijena = dobijena;
    }
    
    public static void dobijena(){
        System.out.println("Vasa pobeda: " + dobijena);
    }
}
