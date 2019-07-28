import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Kalkulator extends JFrame implements ActionListener
{
    JButton bNumber[] = new JButton[10], bDot, bPlus, bEqual, bMinus, bBack, bCe, bC, bPlmin, bDivision, bMultiplication;
    JButton bElement, bPercent, bOX;
    JTextField tWindow, tWindow1;
    float number1, number2;
    double sum;
    int last;

    public Kalkulator()
    {
        setSize(260, 320);
        setLayout(null);
        setTitle("Kalkulator");

        tWindow1 = new JTextField();
        tWindow1.setEditable(false);
        tWindow1.setBounds(10, 15, 225, 15);
        tWindow1.addActionListener(this);
        tWindow1.setBorder(null);
        add(tWindow1);

        tWindow = new JTextField();
        tWindow.setEditable(false);
        tWindow.setBounds(10, 45, 225, 50);
        tWindow.addActionListener(this);
        add(tWindow);

        bBack = new JButton("<");
        bBack.setBounds(10,105,41,30);
        bBack.addActionListener(this);
        add(bBack);

        bNumber[7] = new JButton("7");
        bNumber[7].setBounds(10,140,41,30);
        bNumber[7].addActionListener(this);
        add(bNumber[7]);

        bNumber[4] = new JButton("4");
        bNumber[4].setBounds(10,175,41,30);
        bNumber[4].addActionListener(this);
        add(bNumber[4]);

        bNumber[1] = new JButton("1");
        bNumber[1].setBounds(10,210,41,30);
        bNumber[1].addActionListener(this);
        add(bNumber[1]);

        bNumber[0] = new JButton("0");
        bNumber[0].setBounds(10,245,87,30);
        bNumber[0].addActionListener(this);
        add(bNumber[0]);

        bCe = new JButton("CE");
        bCe.setBounds(56,105,41,30);
        bCe.setMargin(new Insets(0,0,0,0));
        bCe.addActionListener(this);
        add(bCe);

        bNumber[8] = new JButton("8");
        bNumber[8].setBounds(56,140,41,30);
        bNumber[8].addActionListener(this);
        add(bNumber[8]);

        bNumber[5] = new JButton("5");
        bNumber[5].setBounds(56,175,41,30);
        bNumber[5].addActionListener(this);
        add(bNumber[5]);

        bNumber[2] = new JButton("2");
        bNumber[2].setBounds(56,210,41,30);
        bNumber[2].addActionListener(this);
        add(bNumber[2]);

        bC = new JButton("C");
        bC.setBounds(102,105,41,30);
        bC.setMargin(new Insets(0,0,0,0));
        bC.addActionListener(this);
        add(bC);

        bNumber[9] = new JButton("9");
        bNumber[9].setBounds(102,140,41,30);
        bNumber[9].addActionListener(this);
        add(bNumber[9]);

        bNumber[6] = new JButton("6");
        bNumber[6].setBounds(102,175,41,30);
        bNumber[6].addActionListener(this);
        add(bNumber[6]);

        bNumber[3] = new JButton("3");
        bNumber[3].setBounds(102,210,41,30);
        bNumber[3].addActionListener(this);
        add(bNumber[3]);

        bDot = new JButton(".");
        bDot.setBounds(102,245,41,30);
        bDot.addActionListener(this);
        add(bDot);

        bPlmin = new JButton("±");
        bPlmin.setBounds(148,105,41,30);
        bPlmin.addActionListener(this);
        add(bPlmin);

        bDivision = new JButton("/");
        bDivision.setBounds(148,140,41,30);
        bDivision.addActionListener(this);
        add(bDivision);

        bMultiplication = new JButton("*");
        bMultiplication.setBounds(148,175,41,30);
        bMultiplication.addActionListener(this);
        add(bMultiplication);

        bMinus = new JButton("-");
        bMinus.setBounds(148,210,41,30);
        bMinus.addActionListener(this);
        add(bMinus);

        bPlus = new JButton("+");
        bPlus.setBounds(148,245,41,30);
        bPlus.addActionListener(this);
        add(bPlus);

        bElement = new JButton("√");
        bElement.setBounds(194,105,41,30);
        bElement.setMargin(new Insets(0,0,0,0));
        bElement.addActionListener(this);
        add(bElement);

        bPercent = new JButton("%");
        bPercent.setBounds(194,140,41,30);
        bPercent.setMargin(new Insets(0,0,0,0));
        bPercent.addActionListener(this);
        add(bPercent);

        bOX = new JButton("^x");
        bOX.setBounds(194,175,41,30);
        bOX.setMargin(new Insets(0,0,0,0));
        bOX.addActionListener(this);
        add(bOX);

        bEqual = new JButton("=");
        bEqual.setBounds(194,210,41,65);
        bEqual.addActionListener(this);
        add(bEqual);
    }

    public static void main(String args[])
    {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.setVisible(true);
        kalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        DecimalFormat format = new DecimalFormat("0.##########");
        Object source = actionEvent.getSource();
        if (source==bC) {tWindow.setText("");tWindow1.setText("");}
        if (source==bNumber[0]) {tWindow.setText(tWindow.getText() + "0");}
        if (source==bNumber[1]) {tWindow.setText(tWindow.getText() + "1");}
        if (source==bNumber[2]) {tWindow.setText(tWindow.getText() + "2");}
        if (source==bNumber[3]) {tWindow.setText(tWindow.getText() + "3");}
        if (source==bNumber[4]) {tWindow.setText(tWindow.getText() + "4");}
        if (source==bNumber[5]) {tWindow.setText(tWindow.getText() + "5");}
        if (source==bNumber[6]) {tWindow.setText(tWindow.getText() + "6");}
        if (source==bNumber[7]) {tWindow.setText(tWindow.getText() + "7");}
        if (source==bNumber[8]) {tWindow.setText(tWindow.getText() + "8");}
        if (source==bNumber[9]) {tWindow.setText(tWindow.getText() + "9");}
        if (source==bDot) {tWindow.setText(tWindow.getText() + ".");}
        if (source==bEqual)
        {
            switch(last)
            {
                case 1:
                        number1 = Float.parseFloat(tWindow1.getText());
                        number2 = Float.parseFloat(tWindow.getText());
                        sum = number1 + number2;
                        tWindow.setText(String.valueOf(format.format(sum)));
                    break;
                case 2:
                    number1 = Float.parseFloat(tWindow1.getText());
                    number2 = Float.parseFloat(tWindow.getText());
                    sum = number1 - number2;
                    tWindow.setText(String.valueOf(format.format(sum)));
                    break;
                case 3:
                    number1 = Float.parseFloat(tWindow1.getText());
                    number2 = Float.parseFloat(tWindow.getText());
                    sum = number1 * number2;
                    tWindow.setText(String.valueOf(format.format(sum)));
                    break;
                case 4:
                    number1 = Float.parseFloat(tWindow1.getText());
                    number2 = Float.parseFloat(tWindow.getText());
                    sum = number1 / number2;
                    tWindow.setText(String.valueOf(format.format(sum)));
                    break;
                case 5:
                    number1 = Float.parseFloat(tWindow1.getText());
                    number2 = Float.parseFloat(tWindow.getText());
                    sum = Math.pow(number1, number2);
                    tWindow.setText(String.valueOf(format.format(sum)));
                    break;
            }
            tWindow1.setText("");
        }
        if (source==bPlus) {last = 1;tWindow1.setText(tWindow.getText()); tWindow.setText("");}
        if (source==bMinus) {last = 2; tWindow1.setText(tWindow.getText());tWindow.setText("");}
        if (source==bMultiplication) {last = 3;tWindow1.setText(tWindow.getText()); tWindow.setText("");}
        if (source==bDivision) {last = 4;tWindow1.setText(tWindow.getText()); tWindow.setText("");}
        if (source==bOX) {last = 5;tWindow1.setText(tWindow.getText()); tWindow.setText("");}
        if (source==bElement) {number1 = Float.parseFloat(tWindow.getText()); sum = Math.sqrt(number1);tWindow.setText(String.valueOf(format.format(sum)));}
    }
}
