package myfancyjavaproject;


import javax.swing.*;


public class USD extends JFrame
{
    JLabel labelUSD;
    JLabel labelEuro;

    JTextField textUSD;
    JTextField textEuro;

    JButton button1;

    JPanel panel;
    public USD()
    {
        super("Converter");

        textUSD = new JTextField();
        textUSD.setBounds(45, 10, 130, 25);

        labelUSD = new JLabel("USD",SwingConstants.CENTER);
        labelUSD.setBounds(180,8,130,30);



        button1 = new JButton("Convert");
        button1.setBounds(45,50,130,20);


        textEuro = new JTextField();
        textEuro.setBounds(45, 90, 130, 25);

        labelEuro = new JLabel("Euro",SwingConstants.CENTER);
        labelEuro.setBounds(180,88,130,30);




        panel = new JPanel(null);
        panel.add(labelUSD);
        panel.add(labelEuro);
        panel.add(button1);
        panel.add(textUSD);
        panel.add(textEuro);

        add(panel);

    }




    public static void main(String[] args)
    {
        USD app = new USD();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300,170);
        app.setVisible(true);
    }
}
