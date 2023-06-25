package Model.Players;

import java.util.Scanner;

import Model.BField;
import View.Console.CButtleField;

public class Player {
    String valueStep;

    public Player() {
        
    }
    
    public void makeMove(BField bf, String signPlayer) {
        getValueStep(bf, signPlayer );
        setValueStep(valueStep, bf, signPlayer);

    }
    
    private void getValueStep(BField bf, String signPlayer) {
        Scanner scan_1 = new Scanner(System.in);
        String myRow_1;
        CButtleField cbf = new CButtleField();

        System.out.println(">> Введите данные ячейки. \nХод игрока " + getClass());
        myRow_1 = scan_1.nextLine();

        System.out.println(">>> Ваш ход:" + myRow_1);

        bf.setLocate(myRow_1, signPlayer);


    }

    private void setValueStep(String val, BField bf, String signPlayer) {
        this.valueStep = val;
        bf.setLocate(val, signPlayer);
        
    }

}
