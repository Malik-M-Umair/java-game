package com.comapny;

import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        int rock=0,paper=1,scissor=2;
        System.out.println("Game is starting!be ready");
        System.out.println("0 for rock 👊");
        System.out.println("1 for paper ✋");
        System.out.println("2 for scissor ✂");
        System.out.println("Write your choice to beat the machine");
        Scanner sc=new Scanner(System.in);
        int user_Input=sc.nextInt();
        Random rd=new Random();
        int com_Input=rd.nextInt(3);

        if(com_Input==user_Input){
            System.out.println("game is Draw bro!");
        }

        else if (com_Input==0 && user_Input==1 || com_Input==1 && user_Input==2 || com_Input==2 && user_Input==0) {
            System.out.println("You win!Machine lose 😜");

        }
        else{
            System.out.println("Machine wins!better luck next time😥");
        }
        System.out.println("computer input="+com_Input);
        if(com_Input==0)
        {
            System.out.println("Computer has chossen rock");
        }
        else if(com_Input==1)
        {
            System.out.println("Computer has chossen paper");
        }
        else{
            System.out.println("Computer has chosen scissor");
        }
        System.out.println("________________________");
        System.out.println("Your choice="+user_Input);
        if(user_Input==0)
        {
            System.out.println("You had chossen rock");
        }
        else if(user_Input==1)
        {
            System.out.println("You had chossen paper");
        }
        else{
            System.out.println("YOU had chosen scissor");
        }
    }
}
