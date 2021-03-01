/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackingsim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Korisnik
 */
public class HackingSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner skener = new Scanner(System.in);
        Random r = new Random();
        String fakeKey = "";
         String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
         System.out.println("""
                                                                                                                                 
                                                                                                                                   
                              FFFFFFFFFFFFFFFFFFFFFF                                                                               
                              F::::::::::::::::::::F                                                                               
                              F::::::::::::::::::::F                                                                               
                              FF::::::FFFFFFFFF::::F                                                                               
                                F:::::F       FFFFFFrrrrr   rrrrrrrrr       eeeeeeeeeeee  yyyyyyy           yyyyyyyaaaaaaaaaaaaa   
                                F:::::F             r::::rrr:::::::::r    ee::::::::::::ee y:::::y         y:::::y a::::::::::::a  
                                F::::::FFFFFFFFFF   r:::::::::::::::::r  e::::::eeeee:::::eey:::::y       y:::::y  aaaaaaaaa:::::a 
                                F:::::::::::::::F   rr::::::rrrrr::::::re::::::e     e:::::e y:::::y     y:::::y            a::::a 
                                F:::::::::::::::F    r:::::r     r:::::re:::::::eeeee::::::e  y:::::y   y:::::y      aaaaaaa:::::a 
                                F::::::FFFFFFFFFF    r:::::r     rrrrrrre:::::::::::::::::e    y:::::y y:::::y     aa::::::::::::a 
                                F:::::F              r:::::r            e::::::eeeeeeeeeee      y:::::y:::::y     a::::aaaa::::::a 
                                F:::::F              r:::::r            e:::::::e                y:::::::::y     a::::a    a:::::a 
                              FF:::::::FF            r:::::r            e::::::::e                y:::::::y      a::::a    a:::::a 
                              F::::::::FF            r:::::r             e::::::::eeeeeeee         y:::::y       a:::::aaaa::::::a 
                              F::::::::FF            r:::::r              ee:::::::::::::e        y:::::y         a::::::::::aa:::a
                              FFFFFFFFFFF            rrrrrrr                eeeeeeeeeeeeee       y:::::y           aaaaaaaaaa  aaaa
                                                                                                y:::::y                            
                                                                                               y:::::y                             
                                                                                              y:::::y                              
                                                                                             y:::::y                               
                                                                                            yyyyyyy                                
                                                                                                                                   
                                                                                                                                   
                                    
                            """);
        while(true)
        {
            System.out.print("Terminal>Hack>CommandEntry - ");
            String inputCommand = skener.nextLine();
            if(inputCommand.equals("hack.help"))
            {
                System.out.println("Commands - " + "\n" + "- hack.inject()" + "\n" + "- hack.mainframe(off)");
            }
            else if(inputCommand.equals("hack.mainframe(off)"))
            {
                System.out.println("C://>Terminal C> Opening...");
                Thread.sleep(3000);
                System.out.println("C://>Terminal C> Opened! Cracking machine firewalls...");
                Thread.sleep(3000);
                System.out.println("Cracked!");
                Thread.sleep(500);
                System.out.println("C://>Terminal C> Overflowing Backbone API's...");
                Thread.sleep(3000);
                System.out.println("Would you like to leak employee data?");
                System.out.println("Y/N");
                String choiceYN = skener.nextLine();
                if(choiceYN.equals("Y"))
                {
                    System.out.println("C://>Terminal C> Leaking employee data....");
                    Thread.sleep(2000);
                    System.out.println("C://>Terminal C> Success!");
                    
                }
                System.out.println("C://>Terminal C> Erasing Backdoor data...");
                Thread.sleep(3000);
                System.out.println("C://>Terminal C> Generating Hashkey for api access..");
                Thread.sleep(2000);
                System.out.println("C://>Terminal C> Hashkey broken! Refixing compiler framework in ajax circumstances...");
                Thread.sleep(5000);
                for(int i = 0; i < 35; i++)
                {
                    fakeKey = fakeKey + alphabet[r.nextInt(alphabet.length)];
                }
                System.out.println("C://>Terminal C> Key generated! " + fakeKey);
                
               
                
            }
            else if(inputCommand.equals("hack.inject()"))
            {
                System.out.println("C://>Terminal C> Injecting MVC keys into PHP prework...");
                Thread.sleep(2000);
                System.out.println("C://>Terminal C> Completed!");
                System.out.println("C://>Terminal C> Terminal infected with Ruby runtime source codes in server precautions!");
                Thread.sleep(1000);
                System.out.println("C://>Terminal C> Turning off other Terminals in stack syntax terminals under XML servers...");
                Thread.sleep(4000);
                System.out.println("C://>Terminal C> Hack injected! You now have full access to the Terminal C mainframe!");
                System.out.println();
            }
        }
    }
    
}
