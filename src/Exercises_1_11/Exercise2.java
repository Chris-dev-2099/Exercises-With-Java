package Exercises_1_11 ;

import java.util.Random;
import java.util.Scanner;

/*2. Rock, Paper, Scissors Game Exercise:
Develop a Java program that allows the user to play the classic game
of Rock, Paper or Scissors against the computer. The program must request
user to choose one of the options (Rock, Paper or Scissors) and then generate
randomly choosing the computer. The program must then determine
Who wins according to the rules of the game.*/

public class Exercise2 {
    public static void main(String[] args){
        Scanner option = new Scanner(System.in);
        System.out.println("----- Rock Paper Scissors Game -----");
        System.out.println("\fChoose the option number you want:\f");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int player = option.nextInt();

        option.close();

        Random randomNumber = new Random();
        int cpu = randomNumber.nextInt(3) ;
        
        int rock = 1 ;
        int paper = 2 ;
        int scissors = 3 ;
        if(player >0 && player <= 3 ){

            if (player == rock && cpu == paper){
                System.out.println("\fThe cpu chose: paper");
                System.out.println("\fCPU wins !");
            }else if (player == paper && cpu == scissors){
                System.out.println("\fThe chosen cpu: scissors");
                System.out.println("\fCPU wins !");
            }else if (player == scissors && cpu == rock){
                System.out.println("\fCPU chose: rock");
                System.out.println("\fCPU wins !");
            }else if (player == cpu){
                if (cpu == 1) {
                    System.out.println("\fCPU chose: rock");   
                }else if (cpu == 2) {
                    System.out.println("\fThe cpu chose: paper");
                }else if (cpu == 3) {
                    System.out.println("\fThe chosen cpu: scissors");
                }
                System.out.println("\fThe game is tied !!");
            }else{
                if (cpu == 1) {
                    System.out.println("\fCPU chose: rock");
                    System.out.println("\fYou are win !!!");
                }else if (cpu == 2) {
                    System.out.println("\fThe cpu chose: paper");
                    System.out.println("\fYou are win !!!");
                }else if (cpu == 3) {
                    System.out.println("\fThe chosen cpu: scissors");
                    System.out.println("\fYou are win !!!");
                }
            }
        }else{
            System.out.println("You must enter a number between 1 and 3");
        }

    }

}
