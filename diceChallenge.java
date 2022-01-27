public class diceChallenge{
    public static void main(String args[]){
        int rolls[] = new int[20];
        for(int i = 0; i < 20; i++){
            rolls [i] = ((int)(Math.random()*6))+1;
        }
        for(int i = 0; i<20; i++){
            System.out.println("Roll " + (i+1) + ": " +  rolls[i]);
        }
    }
}

