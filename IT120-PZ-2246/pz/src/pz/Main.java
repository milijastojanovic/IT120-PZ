/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pz;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        Kompjuter.kompIzbor = r.nextInt(3);
        
        Igrac.mojIzbor = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj 0=papir, 1=kamen ili 2=makaze"));
        
        if(Igrac.mojIzbor > 2 || Igrac.mojIzbor < 0)
        {
            System.out.println("Niste uneli validan izbor!");
            System.out.println("Pokrenite program ponovo i procitajte uslove");
            System.exit(0);
        }
        
        if(Igrac.mojIzbor == Kompjuter.kompIzbor)
        {
            if(Igrac.mojIzbor == 0)
            {
                System.out.println("Obostrani izbor je papir, pa je izjednaceno");
            }
            else if(Igrac.mojIzbor == 1)
            {
                System.out.println("Obostrani izbor je kamen, pa je izjednaceno");
            }
            else
            {
                System.out.println("Obostrani izbor su makaze, pa je izjednaceno");
            }
            System.exit(0);
        }
        
        if(Igrac.mojIzbor == 0)
	{
            if(Kompjuter.kompIzbor == 1)
            {
		System.out.println("Izabrali ste papir, a kompjuter kamen");
		System.out.println("Pobedili ste!");
                Igrac.dobijena++;
            }
            else
            {
		System.out.println("Izabrali ste papir, a kompjuter makaze");
		System.out.println("Kompjuter je pobedio!");
                Kompjuter.izgubljena++;
            }
	}
	else if(Igrac.mojIzbor == 1)
	{
            if(Kompjuter.kompIzbor == 0)
            {
		System.out.println("Izabrali ste kamen, a kompjuter papir");
		System.out.println("Kompjuter je pobedio!");
                Kompjuter.izgubljena++;
            }
            else
            {
		System.out.println("Izabrali ste kamen, a kompjuter makaze");
		System.out.println("Pobedili ste!");
                Igrac.dobijena++;
            }
	}
	else
	{
            if(Kompjuter.kompIzbor == 0)
            {
		System.out.println("Izabrali ste makaze, a kompjuter papir");
		System.out.println("Pobedili ste!");
                Igrac.dobijena++;
            }
            else
            {
		System.out.println("Izabrali ste makaze, a kompjuter kamen");
		System.out.println("Kompjuter je pobedio!");
                Kompjuter.izgubljena++;
            }
	}        
        
        Igrac.dobijena();
        Kompjuter.izgubljena();    
        
    }
    
}
