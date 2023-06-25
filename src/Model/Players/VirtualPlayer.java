package Model.Players;

public class VirtualPlayer extends Player {
    
    String randomVal;

    public VirtualPlayer(){
        makeRandomStep();
    }

    private String makeRandomStep(){
        Integer myStep = (int) (Math.random()* 9);
        this.randomVal = myStep.toString();
        return this.randomVal;

       
    }

    
    @Override
    public String toString(){
        return this.randomVal;
    }


}
