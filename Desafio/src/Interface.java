/*
 * 
 * @Franklin Vinícius
 * @ Flávia Regina
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.*;

public class Interface {

	private JFrame frame;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	double valor1, valor2;
	String sinal, resultado;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 346, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setText("0");
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt1.setFont(new Font("Tahoma", Font.BOLD, 35));
		txt1.setBounds(10, 20, 313, 74);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JButton btnZerar = new JButton("DELETE");
		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1.setText("0");	
			}
		});
		btnZerar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnZerar.setBounds(10, 104, 91, 42);
		frame.getContentPane().add(btnZerar);
		
		JButton btnMaisoumenos = new JButton("+/-");
		btnMaisoumenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double trocaDeSinal = Double.parseDouble(resultado);
				txt1.setText(String.valueOf(trocaDeSinal*(-1)));
			}
		});
		btnMaisoumenos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnMaisoumenos.setBounds(202, 105, 59, 42);
		frame.getContentPane().add(btnMaisoumenos);
		
		JButton btnPorcentagem = new JButton("%");
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txt1.getText());	
				if (sinal == "soma") {
					double soma = (((valor1 * valor2)/100)+(valor1));
			txt1.setText(String.valueOf(soma));	
				}
				if (sinal == "subtracao") {
					double sub = ((valor1-((valor1 * valor2)/100)));
					txt1.setText(String.valueOf(sub));	
				}
				if (sinal == "multiplicacao") {
					double mult = valor1 * ((valor2)/100);
					txt1.setText(String.valueOf(mult));
				}
				if (sinal == "divisao") {
					double div = ((valor1*100)/valor2);
					txt1.setText(String.valueOf(div));
				}	
			}
		});
		btnPorcentagem.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPorcentagem.setBounds(265, 104, 59, 42);
		frame.getContentPane().add(btnPorcentagem);
		
		JButton btnRaizQua = new JButton("RAIZ");
		btnRaizQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txt1.getText());
				double raiz = Math.sqrt(a);
				txt1.setText(String.valueOf(raiz));
			}
		});
		btnRaizQua.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRaizQua.setBounds(111, 104, 81, 42);
		frame.getContentPane().add(btnRaizQua);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("9");
				} else {
					txt1.setText(txt1.getText() + "9");
				}
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(10, 162, 59, 40);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("8");
				} else {
					txt1.setText(txt1.getText() + "8");
				}
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(82, 162, 59, 40);
		frame.getContentPane().add(btn8);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txt1.getText());
				
				if (sinal == "soma") {
					double soma = valor1 + valor2;
			txt1.setText(String.valueOf(soma));
					
				}
				if (sinal == "subtracao") {
					double sub = valor1 - valor2;
					txt1.setText(String.valueOf(sub));	
				}
				if (sinal == "multiplicacao") {
					double mult = valor1 * valor2;
					txt1.setText(String.valueOf(mult));
				}
				if (sinal == "divisao") {
					double div = valor1 / valor2;
					txt1.setText(String.valueOf(div));
				}
				resultado = txt1.getText();			
			}
		});
		btnResultado.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnResultado.setBounds(151, 312, 59, 40);
		frame.getContentPane().add(btnResultado);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("7");
				} else {
					txt1.setText(txt1.getText() + "7");
				}
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.setBounds(151, 162, 59, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("6");
				} else {
					txt1.setText(txt1.getText() + "6");
				}
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(10, 212, 59, 40);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("5");
				} else {
					txt1.setText(txt1.getText() + "5");
				}
			}
		});
		
	
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(79, 212, 59, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("4");
				} else {
					txt1.setText(txt1.getText() + "4");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(151, 212, 59, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("3");
				} else {
					txt1.setText(txt1.getText() + "3");
				}
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(10, 262, 59, 40);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("2");
				} else {
					txt1.setText(txt1.getText() + "2");
				}
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(82, 262, 59, 40);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("1");
				} else {
					txt1.setText(txt1.getText() + "1");
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(151, 262, 59, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = txt1.getText();
				if (texto.equals("0")) {
					txt1.setText("0");
				} else {
					txt1.setText(txt1.getText() + "0");
				}
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(10, 312, 59, 40);
		frame.getContentPane().add(btn0);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt1.getText());
				txt1.setText("");
				sinal = "soma";
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSoma.setBounds(220, 163, 104, 40);
		frame.getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String texto = txt1.getText();	
				if (texto == ""){
			txt1.setText("-");
				}else {
			valor1 = Double.parseDouble(txt1.getText());
			txt1.setText("");
			sinal = "subtracao";
				}
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtracao.setBounds(220, 212, 104, 40);
		frame.getContentPane().add(btnSubtracao);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt1.getText());
				sinal = "multiplicacao";
				txt1.setText("");
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMult.setBounds(220, 262, 104, 40);
		frame.getContentPane().add(btnMult);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt1.getText());
				txt1.setText("");
				sinal = "divisao";
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivisao.setBounds(220, 312, 104, 40);
		frame.getContentPane().add(btnDivisao);
		
		JButton btnPonto = new JButton(",");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txt1.getText());
				txt1.setText(a + ".");
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPonto.setBounds(82, 312, 59, 40);
		frame.getContentPane().add(btnPonto);
	}
}
