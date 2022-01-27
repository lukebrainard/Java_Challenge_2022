public class diceChallenge{
    public static void main(String args[]){
        //rolls array with a length of 20 
        int rolls[] = new int[20];
        //for loop to put rolls in the array
        for(int i = 0; i < 20; i++){
            //mutiplies the Math.random result by 6 then converts the double math.random value into an int(ie turning 0.32423141234 to 0). The number is then added 1 to in order to make the result 1-6
            rolls [i] = ((int)(Math.random()*6))+1;
        }
        //for loop goes through each index of the array and prints them out.
        for(int i = 0; i<20; i++){
            System.out.println("Roll " + (i+1) + ": " +  rolls[i]);
        }
    }
}

