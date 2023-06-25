package Controller;

import java.io.Console;
import java.lang.ref.Cleaner;

import Model.BField;
import Model.Players.Player;
import Model.Players.VirtualPlayer;
import View.Console.CButtleField;

public class Master {

    private int val_2;
    private int val_1;

    int[] arrayComand = { val_1, val_2 };

    String blanks = "> Сделайте ход. Выберите ячейку для заполнения своей меткой. Для этого введите в консоль номер ячейки:";

    public Master() {

        saluted();
        game();

    }

    private void saluted() {
        System.out.println(this.blanks);
        


    }

    public void game() {
        // System.out.print("\033[H\033[2J");

        BField bField = new BField();
        Player player = new Player();
        VirtualPlayer vPlayer = new VirtualPlayer();

        CButtleField.printBF(bField);



        while (!bField.checkWin()) {

            player.makeMove(bField, "X");
            CButtleField.printBF(bField);

            if(!bField.checkWin()){
                vPlayer.makeMove(bField, "O");
                CButtleField.printBF(bField);
            }
                
        }


        


    }
        
}
