/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Prakash
 */
public class Pattern_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Odd numbered String!!");
        String S=sc.next();
        char A[]=S.toCharArray();
        int l=A.length;
        int c=l/2;
//        System.out.println(c);
        char[][] a=new char [l][l];
        if(A.length%2==0)
        {
            System.out.println("Enter another sTring..of odd count");
        }
        else{
            int temp=l-1;
            for(int i=0;i<c;i++)
            {
                for(int h=0;h<i;h++)
                {
                    System.out.print(" ");
                }
                System.out.print(A[i]);
                temp--;
                for(int k=i+1;k<=temp;k++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<=i;j++)
                {
                    System.out.print(A[j]);
                }
            System.out.println();
            }
            for(int y=0;y<c;y++){System.out.print(" ");
            }System.out.println(A[c]);
            temp=0;
            int temp1=c;
            for(int i=1;i<=c;i++)
            {
                temp1--;
                for(int h=0;h<temp1;h++)
                {
                    System.out.print(" ");
                }
                System.out.print(A[c+i]);
                
                for(int k=0;k<i;k++)
                {
                    System.out.print(" ");
                }
                
                for(int k=1;k<i;k++)
                {
                    System.out.print(" ");
                }
                for(int j=i;j<=i;j++)
                {
                    System.out.print(A[c+j]);
                }
                
            System.out.println();
            }
    }
            
    
}
}