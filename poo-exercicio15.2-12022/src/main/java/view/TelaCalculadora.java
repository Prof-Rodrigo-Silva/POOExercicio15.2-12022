package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaCalculadora {
	
	//Não foram tratados os erros

	private JFrame frame;
	private final JTextField textDisplay = new JTextField();
	double primeiroNro;
	double segundoNro;
	char operacao;
	String resposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora window = new TelaCalculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaCalculadora() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 237, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculadora");
		frame.getContentPane().setLayout(null);
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		textDisplay.setBounds(10, 11, 220, 32);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		// Linha 1
		
		JButton btnVoltar = new JButton("<-");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String espaco = null;
				if(textDisplay.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(textDisplay.getText());
					sb.deleteCharAt(textDisplay.getText().length() - 1);
					espaco = sb.toString();
					textDisplay.setText(espaco);
					
				}
			}
		});
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 13));
		btnVoltar.setBounds(10, 60, 50, 50);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnZerar = new JButton("C");
		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnZerar.setFont(new Font("Dialog", Font.BOLD, 18));
		btnZerar.setBounds(66, 60, 50, 50);
		frame.getContentPane().add(btnZerar);
		
		JButton btnPorc = new JButton("%");
		btnPorc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNro = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = '%';
			}
		});
		btnPorc.setFont(new Font("Dialog", Font.BOLD, 16));
		btnPorc.setBounds(122, 60, 50, 50);
		frame.getContentPane().add(btnPorc);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNro = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = '+';
				
			}
		});
		btnSoma.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSoma.setBounds(178, 60, 50, 50);
		frame.getContentPane().add(btnSoma);
		
		// Linha 2
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn7.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setBounds(10, 120, 50, 50);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn8.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setBounds(66, 120, 50, 50);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn9.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setBounds(122, 120, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNro = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = '-';
			}
		});
		btnSub.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSub.setBounds(178, 120, 50, 50);
		frame.getContentPane().add(btnSub);
		
		// Linha 3
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn4.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setBounds(10, 180, 50, 50);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn5.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setBounds(66, 180, 50, 50);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn6.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setBounds(122, 180, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNro = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = '*';
			}
		});
		btnMult.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMult.setBounds(178, 180, 50, 50);
		frame.getContentPane().add(btnMult);
		
		// Linha 4

		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn1.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);

		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn2.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setBounds(66, 240, 50, 50);
		frame.getContentPane().add(btn2);

		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn3.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setBounds(122, 240, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primeiroNro = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operacao = '/';
			}
		});
		btnDiv.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDiv.setBounds(178, 240, 50, 50);
		frame.getContentPane().add(btnDiv);
		
		// Linha 5

		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btn0.getText();
				textDisplay.setText(nroEntrada);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 18));
		btn0.setBounds(10, 300, 50, 50);
		frame.getContentPane().add(btn0);

		final JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nroEntrada = textDisplay.getText() + btnPonto.getText();
				textDisplay.setText(nroEntrada);
				
			}
		});
		btnPonto.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPonto.setBounds(66, 300, 50, 50);
		frame.getContentPane().add(btnPonto);

		JButton btnInverterSinal = new JButton("+-");
		btnInverterSinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double troca = Double.parseDouble(textDisplay.getText());
				troca = troca *(-1);
				textDisplay.setText(String.valueOf(troca));
			}
		});
		btnInverterSinal.setFont(new Font("Dialog", Font.BOLD, 13));
		btnInverterSinal.setBounds(122, 300, 50, 50);
		frame.getContentPane().add(btnInverterSinal);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				segundoNro = Double.parseDouble(textDisplay.getText());
				switch (operacao) {
				case '+':
					resposta = String.format("%.2f", (primeiroNro + segundoNro));
					textDisplay.setText(resposta);
					break;
				case '-':
					resposta = String.format("%.2f", (primeiroNro - segundoNro));
					textDisplay.setText(resposta);
					break;
				case '*':
					resposta = String.format("%.2f", (primeiroNro * segundoNro));
					textDisplay.setText(resposta);
					break;
				case '/':
					resposta = String.format("%.2f", (primeiroNro / segundoNro));
					textDisplay.setText(resposta);
					break;
				case '%':
					resposta = String.format("%.2f", (primeiroNro/100 * segundoNro));
					textDisplay.setText(resposta);
					break;
				}
				
			}
		});
		btnIgual.setFont(new Font("Dialog", Font.BOLD, 18));
		btnIgual.setBounds(178, 300, 50, 50);
		frame.getContentPane().add(btnIgual);
	}
}
