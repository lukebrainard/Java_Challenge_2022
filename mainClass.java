public class mainClass{
    public static void main(String[] args){
        Die dice[] = new Die[50];
        int totalDiceValue = 0;
        for(int i = 0; i<50; i++){
            dice[i].setNumSides(6);
            dice[i].roll();
            System.out.println("Roll " + i + ": " + dice[i].readLastRoll());
        }
        for(int i = 0; i<50; i++){
            totalDiceValue += dice[i].readLastRoll();
        }
        System.out.println("Total value of the " + dice.length + " rolls is " + totalDiceValue);
    }
}
