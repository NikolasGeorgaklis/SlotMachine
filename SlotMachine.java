//Slot Machine created by Nikolas Georgaklis

import java.util.*;
public class SlotMachine
{
   public static void main(String[] args)
   {
   int x, y, z;
   String str;
   String again = "yes";
   String n = "yes";
   
   Random gen = new Random();
   Scanner scan = new Scanner(System.in);
   
   System.out.print("Want to play? If yes enter \"yes\": ");
   str = scan.nextLine();

   while(again.equalsIgnoreCase(n))
      {
      if (str.equalsIgnoreCase(n))
         {
         x=gen.nextInt(6);
         y=gen.nextInt(6);
         z=gen.nextInt(6);
         
         System.out.println();
         System.out.println("[ " + x + " | " + y + " | " + z + " ]");
         if (x == y && y == z)
         System.out.println("\nCongratulations! You won!");
         else 
            {
            if (x == y || x == z || y == z)
               System.out.println("\nSo close! Better luck next time!");
            else
               System.out.println("\nBetter luck next time!");
            } 
          System.out.print("\nPlay again? If yes enter \"yes\": ");
          again = scan.nextLine();
         }
      else break;
      }
    }
}