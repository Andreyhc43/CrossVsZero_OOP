package View.GraphicInterface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GIButtleField {

    public static Object bA;
    GridBagLayout layout;
    GridBagConstraints gBCons;

    JFrame frameProtocol;

    JPanel panelA;

    JButton button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9;

    Dimension sizeMonitor = Toolkit.getDefaultToolkit().getScreenSize();

    // КОНСТАНТТЫ?
    int widthMonitor = sizeMonitor.width;
    int heightMonitor = sizeMonitor.height;

    Color colorOn = Color.blue;
    Color colorOff = Color.blue;



    public GIButtleField() {
        prepareFrame();
    }

    public void prepareFrame() {
        frameProtocol = new JFrame("Форма_7. Игра 'КрестикиНолики'.");
        panelA = new JPanel();
        
        layout = new GridBagLayout();

        frameProtocol.setSize(widthMonitor / 2, heightMonitor);
        frameProtocol.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelA.setLayout(layout);
        panelA.setBackground(Color.gray);
        

        button_1 = new JButton("1");
        button_2 = new JButton("2");
        button_3 = new JButton("3");

        button_4 = new JButton("4");
        button_5 = new JButton("5");
        button_6 = new JButton("6");
        button_7 = new JButton("7");
        button_8 = new JButton("8");
        button_9 = new JButton("9");
        
        
        
        button_2.addActionListener(new ButtonClickButtleAxies());
        button_3.addActionListener(new ButtonClickButtleAxies());
        button_4.addActionListener(new ButtonClickButtleAxies());
        button_5.addActionListener(new ButtonClickButtleAxies());
        button_6.addActionListener(new ButtonClickButtleAxies());
        button_7.addActionListener(new ButtonClickButtleAxies());
        button_8.addActionListener(new ButtonClickButtleAxies());
        button_9.addActionListener(new ButtonClickButtleAxies());
        
        button_1.setActionCommand("1");
        button_2.setActionCommand("1");
        button_3.setActionCommand("1");
        button_4.setActionCommand("1");
        button_5.setActionCommand("1");
        button_6.setActionCommand("1");
        button_7.setActionCommand("1");
        button_8.setActionCommand("1");
        button_9.setActionCommand("1");
        
        //for
        panelA.add(button_1, setGridPosition(0, 0));
        panelA.add(button_2, setGridPosition(1, 0));
        panelA.add(button_3, setGridPosition(2, 0));
        
        
        panelA.add(button_4, setGridPosition(0,1));
        panelA.add(button_5, setGridPosition(1, 1));
        panelA.add(button_6, setGridPosition(2, 1));
        
        panelA.add(button_7, setGridPosition(0,2));
        panelA.add(button_8, setGridPosition(1, 2));
        panelA.add(button_9, setGridPosition(2, 2));


        frameProtocol.add(panelA);
        frameProtocol.setVisible(true);
        
    }

    protected GridBagConstraints setGridPosition(int column, int row) {
        gBCons = new GridBagConstraints();
        gBCons.gridx = column;
        gBCons.gridy = row;
        return gBCons;
    }




    public class ButtonClickButtleAxies implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            String command = arg0.getActionCommand();
    
    
                if(command == "1"){
                    System.out.println("1");
    
                }
            // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
    }
}
