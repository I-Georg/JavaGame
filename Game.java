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
                
		Random random = new Random();
                
                 System.out.println("Welcome to the jungle.Based on your responses you will be assigned a random chance of survival in a jungle. Good luck ");
                System.out.println("please choose a  character");
                String[] characters = {  "tourist", "local"};
               
	        System.out.println("\t 1. tourist");
		System.out.println("\t 2. local");
                int number = 3;
	       while(number > 0){
             //input from user
		String input = in.nextLine();
                  switch(input)
                          {
                             case "1" :
                                 int initialLiveOne = 10;
                                 System.out.println("You have chosen to be a tourist"); 
                                 System.out.println("Pick a colour: red or blue?");
                                 String inputOne = in.nextLine();
                                   if(inputOne.equals("red"))
                              {
                                 int liveOne = random.nextInt(30);
                                 System.out.println("\t You have gained live:" + liveOne);
                                 System.out.println("\t Pick a food: pizza or pasta?");
                                 String inputOneTwo = in.nextLine();
                              if(inputOneTwo.equals("pizza"))
                              {
                                  int liveOneTwo = random.nextInt(60);
                                  System.out.println("\t You have gained live:" + liveOneTwo);
                                  int resultOne = initialLiveOne + liveOne + liveOneTwo;
                                  System.out.println("\t Your live is:" + resultOne);
                                  
                              }else if(inputOneTwo.equals("pasta"))
                              {
                                   int liveOneOption = 0;
                                   System.out.println("\t Unfortunately you haven't gained live:" + liveOneOption);
                                   System.out.println("\t Pick a animal: cat or dog?");
                                   String inputTwoTwo = in.nextLine();
                                    if(inputTwoTwo.equals("cat"))
                              {
                                  int liveTwoTwo = random.nextInt(50);
                                  System.out.println("\t You have gained live:" + liveTwoTwo);
                                  int resultTwo = initialLiveOne + liveOneOption + liveTwoTwo;
                                  System.out.println("\t Your  final live is:" + resultTwo);
                                  
                                 
                              }else if(inputTwoTwo.equals("dog"))
                              {
                                   
                                    int liveTwoTwoOption = random.nextInt(50);
                                   System.out.println("\t You have gained live:" + liveTwoTwoOption);
                              }
                                    else
                              {
                                  System.out.println("\t You have entered invalid word");
                              }
                                    
                              }
                              }
                              
                              else if(inputOne.equals("blue"))
                              {
                                  int liveOneOption = 0;
                                  System.out.println("\t Unfortunately you haven't gained live:" + liveOneOption);
                                  System.out.println("\t Rain or sun?");
                                   String inputTwo = in.nextLine();
                                   if(inputTwo.equals("rain"))
                                   {
                                       int liveTwoOp = random.nextInt(70);
                                        System.out.println("\t You have gained life:" +liveTwoOp);
                                   }
                                   else if(inputTwo.equals("sun"))
                              {
                                   
                                    int liveTwoTwoOption = random.nextInt(50);
                                   System.out.println("\t You have gained live:" + liveTwoTwoOption);
                              }
                                    else
                              {
                                  System.out.println("\t You have entered invalid word");
                              }
                              }
                              else
                              {
                                  System.out.println("\t You have entered invalid colour");
                              }
                              
                  break; 
        case "2" : 
        System.out.println("You have chosen to be a local"); 
        
         System.out.println("\t Sea or forest?");
         int localLife = 20;
          
                                 String inputThree = in.nextLine();
                              if(inputThree.equals("sea"))
                              {
                                  int liveThree = random.nextInt(50);
                                  System.out.println("\t You have gained live:" + liveThree);
                                  int resultThree = liveThree + localLife;
                                  System.out.println("\t Your live is:"  + resultThree);
                                  
                              }else if(inputThree.equals("forest"))
                              {
                                   int liveThreeOption = 0;
                                   System.out.println("\t Unfortunately you haven't gained live:" + liveThreeOption);
                                   System.out.println("\t Pick a animal: cat or dog?");
                                   String inputThreeThree = in.nextLine();
                                    if(inputThreeThree.equals("cat"))
                              {
                                  int liveThreeOp = random.nextInt(50);
                                  System.out.println("\t You have gained live:" + liveThreeOp);
                                  int resultFour = localLife + liveThreeOp;
                                  System.out.println("\t Your  final live is:" + resultFour);
                                  
                                 
                              }else if(inputThreeThree.equals("dog"))
                              {
                                   
                                    int liveThreeTwoOption = random.nextInt(50);
                                    int resultFive = localLife + liveThreeTwoOption;
                                   System.out.println("\t You have gained live:" + resultFive);
                              }
                                    else
                              {
                                  System.out.println("\t You have entered invalid word");
                              }
                              }
                                else
                              {
                                  System.out.println("\t You have entered invalid colour");
                              }
        break; 
   
    default: 
        System.out.println("Invalid response"); 
                                }
                  number++;
        System.out.println("If your life is > 75, you survive the jungle"); 
        System.out.println("To exit the game press any key"); 
			}
        }
}
		
	//}
//}
//}
