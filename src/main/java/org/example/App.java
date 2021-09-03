import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        int a,b,c;

        System.out.println( "Enter the first number" );
        a = input.nextInt();
        System.out.println( "Enter the second number" );
        b = input.nextInt();
        System.out.println( "Enter the third number" );
        c = input.nextInt();

        if (a == b || b == c || a == c) {

        }
        else {
            if (a > b && a > c) {
                System.out.println("The largest number is " + a);
            }
            else if (b > c && b > a) {
                System.out.println("The largest number is " + b);
            }
            else {
                System.out.println("The largest number is " + c);
            }
        }
    }
}
