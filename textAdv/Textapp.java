package textBasedCode;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

import javax.swing.*;

 

public class Textapp extends applet implements ActionListener

{

  private JTextArea textArea;

  private int lineNumber = 0;   // this is just to test

   

  public void init() { 

    JPanel panel = new JPanel();

    textArea = new JTextArea();
    textArea.setBackground(Color.BLACK);

    textArea.setForeground(Color.WHITE);

    JScrollPane sp = new JScrollPane(textArea);

    panel.add(sp);

    Container window = getContentPane();

    window.setLayout(new BorderLayout());

    window.add(sp,BorderLayout.CENTER);
   // this is just to test------------------

    JButton b = new JButton("Clik to add a line");

    b.addActionListener(this);

    window.add(b, BorderLayout.SOUTH);

    //---------------------------------------

  }

 

  public void actionPerformed(ActionEvent arg0) {

       lineNumber++;

       textArea.append("\nLine number: " + lineNumber);

  }

}
