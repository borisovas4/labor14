import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleCalc extends Frame{
    SimpleCalc() {
        setSize(400, 400);
        setLocation(500, 400);
        setLayout(null);
        Label labelA = new Label("a");
        labelA.setLocation(50, 50);
        labelA.setSize(25, 25);
        Label labelB = new Label("b");
        labelB.setLocation(50, 80);
        labelB.setSize(25, 25);
        Label labelSum = new Label("sum");
        labelSum.setLocation(50, 110);
        labelSum.setSize(30, 25);

        TextField textFieldA = new TextField();
        textFieldA.setBounds(100, 50, 50, 25);
        TextField textFieldB = new TextField();
        textFieldB.setBounds(100, 80, 50, 25);
        TextField textFieldSum = new TextField();
        textFieldSum.setBounds(100, 110, 50, 25);
        textFieldSum.setEditable(false);

        Button calc = new Button("Calculator");
        calc.setBounds(70, 140, 70, 30);
        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(textFieldA.getText());
                    int b = Integer.parseInt(textFieldB.getText());
                    int sum = a + b;
                    textFieldSum.setText(Integer.toString(sum));
                } catch (NumberFormatException ne) {
                    textFieldSum.setText("error");
                }
            }
        });
        Button clear = new Button("clear");
        clear.setBounds(70, 165, 70, 30);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldA.setText("");
                textFieldB.setText("");
                textFieldSum.setText("");
            }
        });

        add(labelA);
        add(textFieldA);
        add(labelB);
        add(textFieldB);
        add(labelSum);
        add(textFieldSum);
        add(calc);
        add(clear);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new SimpleCalc();
    }
}
