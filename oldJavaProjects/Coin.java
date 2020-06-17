public class Coin {
    
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private int face;
    
    /*
    Sets up the coin by flipping it initially.
    */
    
    public void coin(){
        flip();
    }
    
    public void flip(){
        face = (int) (Math.random() * 2);
    }
    
    public boolean isHeads(){
        return (face == HEADS);
    }
    
    public String toString(){
        String faceName;
        
        if(face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        
        return faceName;
    }
}
