// adivinhe a letra do jogo 

class Guess {

public static void main (String args[]) 

throws java.io.IOException { 
    
    char ch, answer = 'K';

    System.out.println("Eu estou pensando em uma letra entre A e Z.");

    System.out.print(" Você pode advinha-la:  ");

    ch = (char)

    System.in.read(); // Lê um char no teclado

    if(ch == answer)  System.out.println("** Certo **");

    else System.out.println(" .....Sinto muito, você errou");




}


}