/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 
 */

 import java.util.Scanner;
import java.util.Random;


public class Game {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
                
		Random rand = new Random();
                
                 System.out.println("welcome to the game");
                System.out.println("please choose a  character");
                String[] characters = {"Hunter", "local", "tourist"};
                System.out.println("\t What would you do?");
				System.out.println("\t 1. hunter");
				System.out.println("\t 2. local");
				System.out.println("\t 3. tourist");
                                //input from user
				String input = in.nextLine();
                                switch(input)
                                {
                                    case "1" :
                                       System.out.println("You have chosen to be a hunter"); 
        break; 
        case "2" : 
        System.out.println("You have chosen to be a local"); 
        break; 
    case "3" : 
        System.out.println("You have chosen to be a tourist"); 
        break; 
    default: 
        System.out.println("Invalid response"); 
                                }
                             
			}
		}
	//}
//}
//}
