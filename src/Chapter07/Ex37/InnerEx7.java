package Chapter07.Ex37;

import java.awt.*;
import java.awt.event.*;

public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        System.out.println("!!!!");
    }
}