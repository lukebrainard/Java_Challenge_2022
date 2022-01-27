public class mainClass{
    public static void main(String[] args){
        //Creates an array of dices
        Die dice[] = new Die[50];
        //variable storing the total dice value
        int totalDiceValue = 0;
        //for loop that initalizes each index in the die array, rolls it, and prints it out in the terminal.
        for(int i = 0; i<50; i++){
            dice[i] = new Die(6);
            dice[i].roll();
            System.out.println("Roll " + (i+1) + ": " + dice[i].readLastRoll());
        }
        //gets the last roll of each die in the array and adds it to totalDiceValue
        for(int i = 0; i<50; i++){
            totalDiceValue += dice[i].readLastRoll();
        }
        //prints out totalDiceValue
        System.out.println("Total value of the " + (dice.length) + " rolls is " + totalDiceValue);
    }
}
