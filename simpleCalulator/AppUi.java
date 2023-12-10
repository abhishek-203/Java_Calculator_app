package simpleCalulator;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AppUi implements ActionListener {

    private final JFrame frame;

    private final JPanel panel;
    private final JPanel panelSub1;
    private final JPanel panelSub2;
    private final JPanel panelSub3;
    private final JPanel panelSub4;
    private final JPanel panelSub5;
    private final JPanel panelSub6;
    private final JPanel panelSub7;
    private final JPanel panelSub8;

    private final JTextArea text;

    private final JButton btn[], btnAdd, btnMinis, btnMultiply, btnDivide, btnEqual, btnCancel,btnClear, btnSquareRoot,
            btnSquare, btnOneDividedBy, btnCos, btnSin, btnTan, btnXpowerOfy, btnlog, btnRate, btnAbs, btnBinary, btnln;

    private final Calculator calc;

    private final String[] btnValue = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

    private final Font font;
    private final Font texFont;
    private ImageIcon image;
    private BufferedImageCustom imageReturn;

    public AppUi() throws IOException {
        frame = new JFrame("Calculator App");

        imageReturn = new BufferedImageCustom();
        image = new ImageIcon(imageReturn.imageReturn());

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panelSub1 = new JPanel(new FlowLayout());
        panelSub2 = new JPanel(new FlowLayout());
        panelSub3 = new JPanel(new FlowLayout());
        panelSub4 = new JPanel(new FlowLayout());
        panelSub5 = new JPanel(new FlowLayout());
        panelSub6 = new JPanel(new FlowLayout());
        panelSub7 = new JPanel(new FlowLayout());
        panelSub8 = new JPanel(new FlowLayout());

        font = new Font("Consolas", Font.PLAIN, 18);
        text = new JTextArea(1, 30);
        texFont = new Font("Consolas", Font.BOLD, 24);
        btn = new JButton[10];
        for (int i = 0; i < 10; i++) {
            btn[i] = new JButton(String.valueOf(i));
        }
        btnAdd = new JButton("+");
        btnMinis = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnEqual = new JButton(" = ");
        btnClear = new JButton("x");
        btnSquareRoot = new JButton("sqrt");
        btnSquare = new JButton("x^2");
        btnOneDividedBy = new JButton("1/x");
        btnCos = new JButton("Cos");
        btnSin = new JButton("Sin");
        btnTan = new JButton("Tan");
        btnln = new JButton("ln");
        btnXpowerOfy = new JButton("x^y");
        btnlog = new JButton("log10(x)");
        btnRate = new JButton("x%");
        btnAbs = new JButton("abs(x)");
        btnCancel = new JButton("C");
        btnBinary = new JButton("Bin");

        calc = new Calculator();

    }

    public void init() {
        frame.setSize(450, 450);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());

        text.setFont(texFont);
        text.setEditable(false);

        for (int i = 0; i < 10; i++) {
            btn[i].setFont(font);
        }
        btnAdd.setFont(font);
        btnMinis.setFont(font);
        btnMultiply.setFont(font);
        btnDivide.setFont(font);
        btnEqual.setFont(font);
        btnSquareRoot.setFont(font);
        btnSquare.setFont(font);
        btnOneDividedBy.setFont(font);
        btnCos.setFont(font);
        btnSin.setFont(font);
        btnTan.setFont(font);
        btnln.setFont(font);
        btnXpowerOfy.setFont(font);
        btnlog.setFont(font);
        btnRate.setFont(font);
        btnAbs.setFont(font);
        btnClear.setFont(font);
        btnCancel.setFont(font);
        btnBinary.setFont(font);

        // btnEqual.setSize(100, 200);

        panel.add(Box.createHorizontalStrut(100));
        panelSub1.add(text);
        panel.add(panelSub1);

        panelSub2.add(btn[7]);
        panelSub2.add(btn[8]);
        panelSub2.add(btn[9]);
        panelSub2.add(Box.createHorizontalStrut(30));
        panelSub2.add(btnAdd);
        panelSub2.add(btnMinis); 
        panel.add(panelSub2);

        panelSub3.add(btn[4]);
        panelSub3.add(btn[5]);
        panelSub3.add(btn[6]);
        panelSub3.add(Box.createHorizontalStrut(30));
        panelSub3.add(btnMultiply);
        panelSub3.add(btnDivide);
        panel.add(panelSub3);

        panelSub4.add(btn[1]);
        panelSub4.add(btn[2]);
        panelSub4.add(btn[3]);
        panelSub4.add(Box.createHorizontalStrut(15));
        panelSub4.add(btnCancel);
        panelSub4.add(btnEqual);
        panel.add(panelSub4);

        // panelSub5.add(Box.createHorizontalStrut(20));
        panelSub5.add(btn[0]);
        panelSub5.add(Box.createHorizontalStrut(2));
        panelSub5.add(btnCos);
        panelSub5.add(btnSin);
        panelSub5.add(btnTan);
        panel.add(panelSub5);
        
        panelSub6.add(btnln);
        panelSub6.add(btnSquare);
        panelSub6.add(btnSquareRoot);
        panelSub6.add(btnOneDividedBy);
        panelSub6.add(btnXpowerOfy);
        panel.add(panelSub6);

        panelSub7.add(btnlog);
        panelSub7.add(btnRate);
        panelSub5.add(Box.createHorizontalStrut(5));
        panel.add(panelSub7);
        
        panelSub7.add(btnAbs);
        panelSub7.add(btnBinary);
        // panel.add(panelSub8);

        for (int i = 0; i < 10; i++) {
            btn[i].addActionListener(this);
        }
        btnAdd.addActionListener(this);
        btnMinis.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnSquare.addActionListener(this);
        btnSquareRoot.addActionListener(this);
        btnOneDividedBy.addActionListener(this);
        btnCos.addActionListener(this);
        btnSin.addActionListener(this);
        btnTan.addActionListener(this);
        btnln.addActionListener(this);
        btnXpowerOfy.addActionListener(this);
        btnlog.addActionListener(this);
        btnRate.addActionListener(this);
        btnAbs.addActionListener(this);
        btnBinary.addActionListener(this);
        // btnClear.addActionListener(this);
        btnEqual.addActionListener(this);
        btnCancel.addActionListener(this);

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();
        Double checkNum = null;

        for (int i = 0; i < 10; i++) {
            if (source == btn[i]) {
                text.replaceSelection(btnValue[i]);
                return;
            }
        }

        try {
            checkNum = Double.parseDouble(text.getText());
        } catch (NumberFormatException k) {

        }

        if (checkNum != null || source == btnCancel) {
            if (source == btnAdd) {
                writer(calc.calculateBi(Calculator.BiOperatorModes.add, reader()));
                text.replaceSelection(btnAdd.getText());
            }

            if (source == btnMinis) {
                writer(calc.calculateBi(Calculator.BiOperatorModes.minus, reader()));
                text.replaceSelection(btnMinis.getText());
            }

            if (source == btnMultiply) {
                writer(calc.calculateBi(Calculator.BiOperatorModes.multiply, reader()));
                text.replaceSelection(btnMultiply.getText());
            }

            if (source == btnDivide) {
                writer(calc.calculateBi(Calculator.BiOperatorModes.divide, reader()));
                text.replaceSelection(btnDivide.getText());
            }

            if (source == btnXpowerOfy) {
                writer(calc.calculateBi(Calculator.BiOperatorModes.xpowerofy, reader()));
            }

            if (source == btnSquare) {
                writer(calc.calculateMono(Calculator.MonoOperatorModes.square, reader()));
            }

            if (source == btnSquareRoot)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.squareRoot, reader()));

            if (source == btnOneDividedBy)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, reader()));

            if (source == btnCos)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.cos, reader()));

            if (source == btnSin)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.sin, reader()));

            if (source == btnTan)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.tan, reader()));

            if (source == btnlog)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.log, reader()));
 
            if (source == btnln)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.ln, reader()));

            if (source == btnRate)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.rate, reader()));

            if (source == btnAbs)
                writer(calc.calculateMono(Calculator.MonoOperatorModes.abs, reader()));

            if (source == btnEqual)
                writer(calc.calculateEqual(reader()));

                // if (source == btnClear) {
                //     writer(checkNum);
                // }
            if (source == btnCancel)
                writer(calc.reset());

            if (source == btnBinary)
                parsetoBinary();
        }

        text.selectAll();
    }

    private void parsetoBinary() {
        try {
            text.setText("" + Long.toBinaryString(Long.parseLong(text.getText())));
        } catch (NumberFormatException ex) {
            System.err.println("Error while parse to binary." + ex.toString());
        }
    }

    public Double reader() {
        Double num;
        String str;
        str = text.getText();
        num = Double.valueOf(str);

        return num;
    }

    public void writer(final Double num) {
        if (Double.isNaN(num)) {
            text.setText("");
        } else {
            text.setText(Double.toString(num));
        }
    }
}
