public class Die{
    private int numSides;
    private int rolledNum;
    public Die(){

    }
    public Die(int sidesOfDie){
        setNumSides(sidesOfDie);
    }
    public int numSides(){
        return numSides;
    }
    public int roll(){
        rolledNum = (int)(Math.random()*numSides) + 1;
        return rolledNum;
    }
    public int readLastRoll(){
        if(rolledNum > 0){
            return rolledNum;
        }
        else{
            return -1;
        }
    }
    public void setNumSides(int sides){
        numSides = sides;
    }
}
