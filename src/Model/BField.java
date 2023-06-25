package Model;

import java.io.Console;

public class BField {

    public String[][] field = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };

    public BField() {
        // distributionCells(array);// механизм распределения массива с номерами ячеек

    }

    public void setLocate(String val, String signPlayer) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (this.field[i][j].equals(val)) {
                    this.field[i][j] = signPlayer;
                }

            }
        }
    }

    public boolean checkWin() {
        if ((this.field[0][0].equals("X") && this.field[0][1].equals("X") && this.field[0][2].equals("X"))
                || (this.field[0][0].equals("O") && this.field[0][1].equals("O") && this.field[0][2].equals("O"))) {

            System.out.println(">>> Есть победитель!");
            return true;
        } 

        else if((this.field[1][0].equals("X") && this.field[1][1].equals("X") && this.field[1][2].equals("X"))
        || (this.field[1][0].equals("O") && this.field[1][1].equals("O") && this.field[1][2].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }
        
        else if((this.field[2][0].equals("X") && this.field[2][1].equals("X") && this.field[2][2].equals("X"))
        || (this.field[2][0].equals("O") && this.field[2][1].equals("O") && this.field[2][2].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }

        else if((this.field[0][0].equals("X") && this.field[1][0].equals("X") && this.field[2][0].equals("X"))
        || (this.field[0][0].equals("O") && this.field[1][0].equals("O") && this.field[2][0].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }

        else if((this.field[0][1].equals("X") && this.field[1][1].equals("X") && this.field[2][1].equals("X"))
        || (this.field[0][1].equals("O") && this.field[1][1].equals("O") && this.field[2][1].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }

        else if((this.field[0][2].equals("X") && this.field[1][2].equals("X") && this.field[2][2].equals("X"))
        || (this.field[0][2].equals("O") && this.field[1][2].equals("O") && this.field[2][2].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }


        else if((this.field[0][0].equals("X") && this.field[1][1].equals("X") && this.field[2][2].equals("X"))
        || (this.field[0][0].equals("O") && this.field[1][1].equals("O") && this.field[2][2].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }

        else if((this.field[0][2].equals("X") && this.field[1][1].equals("X") && this.field[2][0].equals("X"))
        || (this.field[0][2].equals("O") && this.field[1][1].equals("O") && this.field[2][0].equals("O"))){
            System.out.println(">>> Есть победитель!");
            return true;
        }



        
        else {
            System.out.println(">>> Победитель отсутствует.");
            return false;
        }


        



        

    };

}
