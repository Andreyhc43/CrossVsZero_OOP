package View.Console;

import java.util.HashMap;
import java.util.Map;

import Model.BField;

public class CButtleField {

    public CButtleField() {
      
    }

    public static void printBF(BField bf) {
        String row = "";

        for (int i = 0; i < 3; i++) {
            // System.out.println(row);
            row = "";

            for (int j = 0; j < 3; j++) {
                row = row.concat(bf.field[i][j] + "|");
                row.concat(bf.field[i][j]);

            }
            System.out.println("------");
            System.out.println(row);
        }
    }

   

}
