/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_.pkgstatic.initializer.block;

import java.util.Scanner;

public class HackerRank_Static_Initializer_Block {
    static int height, breadth;
        static{
           height = 0;
            breadth = 0;
         }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       height = sc.nextInt();
       breadth = sc.nextInt();
      
       
          if((height>0 && breadth>0))
          {
              System.out.println(height*breadth);
          }
             
          else if(height<=0 || breadth<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
           }
    }
}
