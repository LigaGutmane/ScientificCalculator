import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnMinus;
    private JButton btnPlus;
    private JButton btnTangent;
    private JButton btnMultiplicativeInverse;
    private JButton btnX3;
    private JButton btnEX;
    private JButton btnSquareRoot;
    private JButton btnX2;
    private JButton btnEquals;
    private JButton btnZero;
    private JButton btnLogarithm;
    private JButton btnDegree;
    private JButton btnClear;
    private JButton btnSeven;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btnPoint;
    private JButton btnSine;
    private JButton btnBackspace;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnRemainder;
    private JButton btnCosine;
    private JButton btnX;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnThree;
    private JRadioButton ONRadioButton;
    private JRadioButton OFFRadioButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private void getOperator(String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public Calculator() {

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                } else if (textDisplay.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });

        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;
                    case '%':
                        total2 = total1 % Double.parseDouble(textDisplay.getText());
                        break;
                }

                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });

        btnBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if (textDisplay.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textDisplay.getText());
                    str.deleteCharAt(textDisplay.getText().length() - 1);
                    backspace = str.toString();
                    textDisplay.setText(backspace);
                }
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnRemainder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnRemainder.getText();
                getOperator(button_text);
            }
        });

        btnSine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Math.sin(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnCosine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Math.cos(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnTangent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Math.tan(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnLogarithm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Math.log(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnMultiplicativeInverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 1 / (Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textDisplay.getText());
                double fact = 1;
                while (a != 0) {
                    fact = fact * a;
                    a--;
                }
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + fact);
            }
        });

        btnX2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = (Double.parseDouble(textDisplay.getText()));
                total1 = total1 * total1;
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnX3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = (Double.parseDouble(textDisplay.getText()));
                total1 = total1 * total1 * total1;
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnSquareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Math.sqrt(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        btnEX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Math.exp(Double.parseDouble(textDisplay.getText()));
                textDisplay.setText("");
                textDisplay.setText(textDisplay.getText() + total1);
            }
        });

        OFFRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(null);
                btnOne.setEnabled(false);
                btnTwo.setEnabled(false);
                btnThree.setEnabled(false);
                btnFour.setEnabled(false);
                btnFive.setEnabled(false);
                btnSix.setEnabled(false);
                btnSeven.setEnabled(false);
                btnEight.setEnabled(false);
                btnNine.setEnabled(false);
                btnZero.setEnabled(false);
                btnEquals.setEnabled(false);
                btnX2.setEnabled(false);
                btnSquareRoot.setEnabled(false);
                btnEX.setEnabled(false);
                btnMultiplicativeInverse.setEnabled(false);
                btnX3.setEnabled(false);
                btnDegree.setEnabled(false);
                btnClear.setEnabled(false);
                btnLogarithm.setEnabled(false);
                btnSine.setEnabled(false);
                btnBackspace.setEnabled(false);
                btnRemainder.setEnabled(false);
                btnCosine.setEnabled(false);
                btnX.setEnabled(false);
                btnPoint.setEnabled(false);
                btnTangent.setEnabled(false);
                btnPlus.setEnabled(false);
                btnMinus.setEnabled(false);
                btnMultiply.setEnabled(false);
                btnDivide.setEnabled(false);
                textDisplay.setEnabled(false);
            }
        });

        ONRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnOne.setEnabled(true);
                btnTwo.setEnabled(true);
                btnThree.setEnabled(true);
                btnFour.setEnabled(true);
                btnFive.setEnabled(true);
                btnSix.setEnabled(true);
                btnSeven.setEnabled(true);
                btnEight.setEnabled(true);
                btnNine.setEnabled(true);
                btnZero.setEnabled(true);
                btnEquals.setEnabled(true);
                btnX2.setEnabled(true);
                btnSquareRoot.setEnabled(true);
                btnEX.setEnabled(true);
                btnMultiplicativeInverse.setEnabled(true);
                btnX3.setEnabled(true);
                btnDegree.setEnabled(true);
                btnClear.setEnabled(true);
                btnLogarithm.setEnabled(true);
                btnSine.setEnabled(true);
                btnBackspace.setEnabled(true);
                btnRemainder.setEnabled(true);
                btnCosine.setEnabled(true);
                btnX.setEnabled(true);
                btnPoint.setEnabled(true);
                btnTangent.setEnabled(true);
                btnPlus.setEnabled(true);
                btnMinus.setEnabled(true);
                btnMultiply.setEnabled(true);
                btnDivide.setEnabled(true);
                textDisplay.setEnabled(true);
            }
        });
    }
}
