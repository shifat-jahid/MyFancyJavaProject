0package myfancyjavaproject;


import javax.swing.*;


public class USD extends JFrame
{
    JLabel labelUSD;
    JLabel labelEuro;

    JTextField textUSD;
    JTextField textEuro;

    JButton button;

    JPanel panel;
    public USD()
    {
        super("Converter");

        textUSD = new JTextField();
        textUSD.setBounds(45, 10, 130, 25);

        labelUSD = new JLabel("USD",SwingConstants.CENTER);
        labelUSD.setBounds(180,8,130,30);



        button = new JButton("Convert");
        button.setBounds(45,50,130,20);


        textEuro = new JTextField();
        textEuro.setBounds(45, 90, 130, 25);

        labelEuro = new JLabel("Euro",SwingConstants.CENTER);
        labelEuro.setBounds(180,88,130,30);




        panel = new JPanel(null);
        panel.add(labelUSD);
        panel.add(labelEuro);
        panel.add(button);
        panel.add(textUSD);
        panel.add(textEuro);

        add(panel);

    }

package myfancyjavaproject;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class USD extends JFrame
{
    JLabel labelUSD;
    JLabel labelEuro;

    JTextField textUSD;
    JTextField textEuro;

    JButton button;

    JPanel panel;
    public USD()
    {
        super("Converter");

        textUSD = new JTextField();
        textUSD.setBounds(45, 10, 130, 25);

        labelUSD = new JLabel("USD",SwingConstants.CENTER);
        labelUSD.setBounds(180,8,130,30);



        button = new JButton("Convert");
        button.setBounds(45,50,130,20);


        textEuro = new JTextField();
        textEuro.setBounds(45, 90, 130, 25);

        labelEuro = new JLabel("Euro",SwingConstants.CENTER);
        labelEuro.setBounds(180,88,130,30);




        panel = new JPanel(null);
        panel.add(labelUSD);
        panel.add(labelEuro);
        panel.add(button);
        panel.add(textUSD);
        panel.add(textEuro);

        add(panel);

        button.addActionListener(new ButtonListener() );
    }


    private class ButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == button)
            {
                //1 USD = 0.88 Euro
                float button = (float) ((Double.parseDouble(textUSD.getText())) * 0.88);

                textEuro.setText(button+"");
                textUSD.requestFocus();
                textUSD.selectAll();
            }
        }
    }

    public static void main(String[] args)
    {
        USD app = new USD();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,170);
        app.setVisible(true);
    }
}


    public static void main(String[] args)
    {
        USD app = new USD();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,170);
        app.setVisible(true);
    }
}
