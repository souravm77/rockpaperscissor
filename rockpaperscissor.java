import java.io.*;
import java.util.Random;
public class rockpaperscissor
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        rockpaperscissor rps = new rockpaperscissor();
        int x=0;
        while(x==0)
        {
            System.out.print("Enter 1 to play vs. computer & 2 to play vs. human : ");
            int choice = Integer.parseInt(br.readLine());
            if(choice==1)
            {
                rps.computer();
                x++;
            }
            else if(choice==2)
            {
                rps.human();
                x++;
            }
            else
            {
                System.out.print("\nWrong input.");
                x=0;
            }
        }
    }
    public void computer()throws IOException
    {
        Random rand = new Random();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        rockpaperscissor rps = new rockpaperscissor();
        System.out.print("\n\nEnter R for rock, P for paper & S for scissor : ");
        char U=(char)br.read();
        char C=' ';
        if(U=='R')
        System.out.println("\nYou : Rock");
        else if(U=='P')
        System.out.println("\nYou : Paper");
        else if(U=='S')
        System.out.println("\nYou : Scissor");
        int a=rand.nextInt(3)+1;
        if(a==1)
        {
            C='R';
            System.out.println("\nComputer : Rock");
        }
        else if(a==2)
        {
            C='P';
            System.out.println("\nComputer : Paper");
        }
        else if(a==3)
        {
            C='S';
            System.out.println("\nComputer : Scissor");
        }
        if(U==C)
        System.out.println("\nGame Draw");
        else if((U=='R' && C=='P')||(U=='P' && C=='S')||(U=='S' && C=='R'))
        System.out.println("\nYou Lose");
        else
        System.out.println("\nYou Win");
        int q=0;
        while(q==0)
        {
            System.out.print("\nWant to play again(Y for yes & N for no):");
            char again=(char)br.read();;
            if(((int)again)==10)    //idea by Arkaprovo sarkar
            again=(char)br.read();  //idea by Arkaprovo sarkar
            if(again=='Y')
            {
                rps.computer();
                q++;
            }
            else if(again=='N')
            {
                System.out.print("\nThanks for playing!");
                q++;
            }
            else 
            System.out.print("\nWrong Input");
        }
    }
    public void human()throws IOException
    {
        Random rand = new Random();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        rockpaperscissor rps = new rockpaperscissor();
        System.out.println("\n\nYour turn");
        int q=0;
        char U=' ',F=' ';
        while(q==0)
        {
            System.out.print("\nEnter S to see what you have got in your luck : ");
            char start=(char)br.read();
            if(start=='S')
            {
                int a=rand.nextInt(3)+1;
                if(a==1)
                U='R';
                else if(a==2)
                U='P';
                else if(a==3)
                U='S';
                q++;
            }
            else 
            {
                System.out.println("\nWrong Input");
                q=0;
            }
        }
        q=0;
        while(q==0)
        {
            System.out.print("\n\nYour friend's turn");
            System.out.print("\nEnter S to see what you have got in your luck : ");
            char start1=(char)br.read();
            if(((int)start1)==10)   //idea by Arkaprovo sarkar
            start1=(char)br.read(); //idea by Arkaprovo sarkar
            if(start1=='S')
            {
                int b=rand.nextInt(3)+1;
                if(b==1)
                F='R';
                else if(b==2)
                F='P';
                else if(b==3)
                F='S';
                q++;
            }
            else 
            {
                System.out.println("\nWrong Input");
                q=0;
            } 
        }  
        q=0;
        if(U=='R')
        System.out.println("\nYou : Rock");
        else if(U=='P')
        System.out.println("\nYou : Paper");
        else if(U=='S')
        System.out.println("\nYou : Scissor");
        if(F=='R')
        System.out.println("\nYour Friend : Rock");
        else if(F=='P')
        System.out.println("\nYour Friend : Paper");
        else if(F=='S')
        System.out.println("\nYour Friend : Scissor");
        if(U==F)
        System.out.println("\nGame Draw");
        else if((U=='R' && F=='P')||(U=='P' && F=='S')||(U=='S' && F=='R'))
        System.out.println("\nYour Friend wins");
        else
        System.out.println("\nYou Win");
        while(q==0)
        {
            System.out.print("\n\nWant to play again(Y for yes & N for no):");
            char again=(char)br.read();   
            if(((int)again)==10)    //idea by Arkaprovo sarkar
            again=(char)br.read();  //idea by Arkaprovo sarkar
            if(again=='Y')
            {
                rps.human();
                q++;
            }
            else if(again=='N')
            {
                System.out.print("\nThanks for playing!");
                q++;
            }
            else 
            System.out.print("\nWrong Input");
        }
    }
}
