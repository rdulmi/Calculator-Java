

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Component;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textResult;
	private double num1, num2, result;
	private String operation, ans;
	

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
	private Calculator() {
		initialize();
		startN();
	}

	/**
	 * Initialize the contents of the frame.
	 **/
	public void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int confirmed  = JOptionPane.showConfirmDialog(frmCalculator,
						"Are you sure want exit?","Exit", JOptionPane.YES_NO_OPTION);
						if(confirmed==JOptionPane.YES_OPTION) {
							frmCalculator.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);}
						else {
							frmCalculator.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);}
			}	
		});
		frmCalculator.setForeground(new Color(139, 0, 139));
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JavaClass\\Images\\icon.png"));
		frmCalculator.setResizable(false);
		frmCalculator.getContentPane().setBackground(new Color(0, 51, 102));
		frmCalculator.setBackground(new Color(0, 0, 128));
		frmCalculator.setFont(new Font("Dialog", Font.BOLD, 10));
		frmCalculator.setTitle("We_Cal");
		frmCalculator.setBounds(100, 100, 257, 397);
		frmCalculator.setLocationRelativeTo(null);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JTextField textResult = new JTextField();
		textResult.setHorizontalAlignment(SwingConstants.RIGHT);
		textResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		textResult.setBackground(UIManager.getColor("Button.background"));
		textResult.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textResult.setBounds(0, 24, 237, 46);
		frmCalculator.getContentPane().add(textResult);
		textResult.setColumns(10);
		
		JLabel lblCal = new JLabel("");
		lblCal.setForeground(Color.WHITE);
		lblCal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCal.setBounds(0, 0, 237, 23);
		frmCalculator.getContentPane().add(lblCal);
		

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn0.getText());
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn0.setBounds(67, 264, 51, 36);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn1.getText());
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn1.setBounds(10, 223, 51, 36);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn2.getText());
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn2.setBounds(67, 223, 51, 36);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn3.getText());
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn3.setBounds(124, 223, 51, 36);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn4.getText());
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn4.setBounds(10, 182, 51, 36);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn5.getText());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn5.setBounds(67, 182, 51, 36);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn6.getText());
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn6.setBounds(124, 182, 51, 36);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn7.getText());
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn7.setBounds(10, 141, 51, 36);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn8.getText());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn8.setBounds(67, 141, 51, 36);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btn9.getText());
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn9.setBounds(124, 141, 51, 36);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textResult.getText()+ btnDot.getText());
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBounds(10, 264, 51, 36);
		frmCalculator.getContentPane().add(btnDot);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textResult.getText());
				operation = "+";
				lblCal.setText(textResult.getText() + "+");
				textResult.setText("");
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnAdd.setBackground(new Color(255, 102, 102));
		btnAdd.setBounds(181, 223, 56, 36);
		frmCalculator.getContentPane().add(btnAdd);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textResult.getText());
				operation = "x";
				lblCal.setText(textResult.getText() + "x");
				textResult.setText("");
			}
		});
		btnMultiply.setBackground(new Color(255, 102, 102));
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMultiply.setBounds(181, 141, 56, 36);
		frmCalculator.getContentPane().add(btnMultiply);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textResult.getText());
				operation = "/";
				lblCal.setText(textResult.getText() + "/");
				textResult.setText("");
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnDiv.setBackground(new Color(255, 102, 102));
		btnDiv.setBounds(181, 264, 56, 36);
		frmCalculator.getContentPane().add(btnDiv);
		
		JButton btnSubstract = new JButton("-");
		btnSubstract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textResult.getText());
				operation = "-";
				lblCal.setText(textResult.getText() + "-");
				textResult.setText("");
			}
		});
		btnSubstract.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSubstract.setBackground(new Color(255, 102, 102));
		btnSubstract.setBounds(181, 182, 56, 36);
		frmCalculator.getContentPane().add(btnSubstract);
		
		JButton btnSquare = new JButton("^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textResult.getText());
				operation = "x^2";
				lblCal.setText(textResult.getText() + "x^2");
				textResult.setText("");
				if (operation=="x^2") { 
		        	 result= Math.pow(num1,2);
						ans=String.format("%.2f", result);
						textResult.setText(ans);}
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSquare.setBackground(new Color(255, 204, 102));
		btnSquare.setBounds(124, 101, 51, 30);
		frmCalculator.getContentPane().add(btnSquare);
		
		JButton btnSqrt = new JButton("Sq");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textResult.getText());
				operation = "x^1/2";
				lblCal.setText(textResult.getText() + "x^1/2");
				textResult.setText("");
				if (operation=="x^1/2") { 
		        	 result= Math.sqrt(num1);
						ans=String.format("%.2f", result);
						textResult.setText(ans);}
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSqrt.setBackground(new Color(204, 255, 102));
		btnSqrt.setBounds(181, 101, 56, 29);
		frmCalculator.getContentPane().add(btnSqrt);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textResult.getText());
				if(operation=="+") {
					result=num1+num2;
					ans=String.format("%.2f", result);
					textResult.setText(ans);
				}
				else if(operation=="-") {
					result=num1-num2;
					ans=String.format("%.2f", result);
					textResult.setText(ans);
				}
				else if(operation=="x") {
					result=num1*num2;
					ans=String.format("%.2f", result);
					textResult.setText(ans);
				}
				
				else if(operation=="/") {
					try {
						if(num2!=0) {
					result=num1/num2;
					ans=String.format("%.2f", result);
					textResult.setText(ans);}
						else {
							textResult.setText("");
							showError();}
						}
				
					catch(Exception ex) {
						
					}
					
				}
				lblCal.setText("");
				}
		});
		
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.setBounds(124, 264, 51, 36);
		frmCalculator.getContentPane().add(btnEqual);
		
		JButton btnDelete = new JButton("<");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showConfirmDialog(null,"Delete Input?","Delete", 0, 0);
				
				int length = textResult.getText().length();
				int number = textResult.getText().length()-1;
				String store;
				if (length>0) {
				StringBuilder sb = new StringBuilder(textResult.getText());
				sb.deleteCharAt(number);
				store = sb.toString();
				textResult.setText(store);
				}
			}
		});
		
		btnDelete.setBackground(new Color(255, 255, 102));
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.setBounds(10, 100, 51, 30);
		frmCalculator.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(frmCalculator,"Sure? You want to clear?",
				"Clear Calculation", 0);
				textResult.setText("");
				lblCal.setText("");}
				});
		btnClear.setBackground(new Color(50, 205, 50));
		btnClear.setBounds(67, 100, 51, 30);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btnBodmas = new JButton("BODMAS");
		btnBodmas.setBackground(new Color(255, 239, 213));
		btnBodmas.setIcon(null);
		btnBodmas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			displayBodmas();
			}
		});
		btnBodmas.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnBodmas.setBounds(10, 311, 227, 36);
		frmCalculator.getContentPane().add(btnBodmas);
			
	}
	
	private void startN() {
		JOptionPane.showMessageDialog(null,"Welcome To We_Cal My Calculator"+
				"\n " +
				"\n Let's Start..!", "We_Cal",JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void displayBodmas() {
		JOptionPane.showMessageDialog(null, 
				"Welcome to WE_Cal!" + 
						"\n This BODMAS is a mathematical rule indicates the" + 
						"\n Correct order of operations to be followed when you" + 
						"\n complete a mathematical number sentence question"+
						"\n with different operations." + 
						"\n"+
						"\n Fllow this order.." +
						"\n 1.) B : Brackets" +
						"\n 2.) O : Orders" +
						"\n 3.) D : Division" + 
						"\n 4.) M : Multiplication" + 
						"\n 5.) A : Addition" + 
						"\n 6.) S : Substraction" + 
						"\n" + 
						"\n It is sometimes known as BIDMAS with 'Indices' used" +
						"\n instead of 'Orders' or PEDMAS (in America) with" + 
						"\n 'Parenthesis' instead of 'Brackets' and 'Exponents'" + 
						"\n instead of 'Orders'",
						"Learn BODMAS", JOptionPane.INFORMATION_MESSAGE);
	}
	private void showError() {
		JOptionPane.showMessageDialog(frmCalculator, "Number can't be divided"+
				"\n by zero(0)! "+
				"\n [number/0] -- Unexpected","Syntax Error",
				JOptionPane.ERROR_MESSAGE);
	}
}
