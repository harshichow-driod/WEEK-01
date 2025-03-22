
import java.util.Scanner;

public class Program10 {
    static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
    static String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    static int numOfCards=suits.length*ranks.length;
   
    public static String[] generateDeck(){
        String[] deck=new String[numOfCards];
        int index=0;
        for(String suit:suits){
            for(String rank:ranks){
                deck[index++]=rank+" of "+suit;
            }
        }
        return deck;
    }
    public static void shuffle(String[] deck){
        for(int i=0;i<numOfCards;i++){
            int randomCardNumber=i+(int)(Math.random()*(numOfCards-i));
            String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
    }
    public static String[][] distributeCards(String[] deck,int numPlayers,int numCards){
        String[][] players=new String[numPlayers][numCards];
        int index=0;
        for(int i=0;i<numPlayers;i++){
            for(int j=0;j<numCards;j++){
                players[i][j]=deck[index++];
            }
        }
        return players;
    }
    public static void printCards(String[][] results){
        for(int i=0;i<results.length;i++){
            System.out.println("Player "+(i+1)+" Cards:");
            for(String card:results[i]){
                System.out.println(" "+card);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] deck=generateDeck();
        shuffle(deck);
        int numPlayers=sc.nextInt();
        int numCards=sc.nextInt();
        if(numCards*numPlayers>numOfCards) System.out.println("Not enough cards to distribute");
        else{
            String[][] players=distributeCards(deck, numPlayers, numCards);
            printCards(players);
        }

    }
}


