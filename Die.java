public class Die{
    //Stores number of sides die has
    private int numSides;
    //Store what number the die has rolled
    private int rolledNum;
    //Basic die constructor
    public Die(){

    }
    //Die constructor when inputed the sides of the die
    public Die(int sidesOfDie){
        setNumSides(sidesOfDie);
    }
    //Returns the number of sides the die has
    public int numSides(){
        return numSides;
    }
    //Rolls the die and stores it in rolled num. rolled num is returned
    public int roll(){
        rolledNum = (int)(Math.random()*numSides) + 1;
        return rolledNum;
    }
    //Returns the last roll given by the user to the program if rolled num does not have a value then -1 is returned
    public int readLastRoll(){
        if(rolledNum > 0){
            return rolledNum;
        }
        else{
            return -1;
        }
    }
    //sets the num of sides the die has
    public void setNumSides(int sides){
        numSides = sides;
    }
}
