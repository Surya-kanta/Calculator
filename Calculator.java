package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	private JFrame frmCalculator;
	private JTextField textField;
	private JButton btnClear;
	private JButton btnEqual;
	private JButton btnPlus;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnNewSub;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMul;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDivide;
	private JButton btn0;
	private JButton btn00;
	private JButton btnDot;
	private JButton btnPercent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 304, 426);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 25));
		textField.setBounds(10, 37, 275, 56);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("<--");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Arial", Font.BOLD, 20));
		btnBackspace.setBackground(new Color(192, 192, 192));
		btnBackspace.setBounds(10, 103, 61, 50);
		frmCalculator.getContentPane().add(btnBackspace);
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Arial", Font.BOLD, 30));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(81, 103, 61, 50);
		frmCalculator.getContentPane().add(btnClear);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				first=result;
			}
		});
		btnEqual.setFont(new Font("Arial", Font.BOLD, 30));
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.setBounds(152, 103, 61, 50);
		frmCalculator.getContentPane().add(btnEqual);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Arial", Font.BOLD, 30));
		btnPlus.setBackground(Color.LIGHT_GRAY);
		btnPlus.setBounds(223, 103, 61, 50);
		frmCalculator.getContentPane().add(btnPlus);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 30));
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(10, 160, 61, 50);
		frmCalculator.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 30));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(81, 160, 61, 50);
		frmCalculator.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 30));
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(152, 160, 61, 50);
		frmCalculator.getContentPane().add(btn9);
		
		btnNewSub = new JButton("-");
		btnNewSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnNewSub.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewSub.setBackground(Color.LIGHT_GRAY);
		btnNewSub.setBounds(223, 160, 61, 50);
		frmCalculator.getContentPane().add(btnNewSub);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 30));
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(11, 217, 61, 50);
		frmCalculator.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 30));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(82, 217, 61, 50);
		frmCalculator.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 30));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(153, 217, 61, 50);
		frmCalculator.getContentPane().add(btn6);
		
		btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMul.setFont(new Font("Arial", Font.BOLD, 30));
		btnMul.setBackground(Color.LIGHT_GRAY);
		btnMul.setBounds(224, 217, 61, 50);
		frmCalculator.getContentPane().add(btnMul);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 30));
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(10, 275, 61, 50);
		frmCalculator.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 30));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(81, 275, 61, 50);
		frmCalculator.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 30));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(152, 275, 61, 50);
		frmCalculator.getContentPane().add(btn3);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Arial", Font.BOLD, 30));
		btnDivide.setBackground(Color.LIGHT_GRAY);
		btnDivide.setBounds(223, 275, 61, 50);
		frmCalculator.getContentPane().add(btnDivide);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 30));
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(10, 333, 61, 50);
		frmCalculator.getContentPane().add(btn0);
		
		btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Arial", Font.PLAIN, 25));
		btn00.setBackground(Color.LIGHT_GRAY);
		btn00.setBounds(81, 333, 61, 50);
		frmCalculator.getContentPane().add(btn00);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Arial", Font.BOLD, 30));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(152, 333, 61, 50);
		frmCalculator.getContentPane().add(btnDot);
		
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Arial", Font.BOLD, 30));
		btnPercent.setBackground(Color.LIGHT_GRAY);
		btnPercent.setBounds(223, 333, 61, 50);
		frmCalculator.getContentPane().add(btnPercent);
	}
}
