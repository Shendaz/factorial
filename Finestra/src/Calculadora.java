import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculadora {

    private JFrame frame;
    private JTextField txt;
    // sum rest mul div són els primers números
    // sum2 rest2 mul2 div2 són els números que van després de premer suma, resta, multiplicació o divisió
    // opr es la variable que ens indica quina operació estem fent
    String sum, sum2, rest, rest2, mult, mult2, divi, divi2;
    float result;
    boolean suma, resta, divisio, multiplicacio = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Calculadora window = new Calculadora();
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
    public Calculadora() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	txt = new JTextField();
	txt.setEnabled(false);
	txt.setBackground(Color.BLACK);
	txt.setBounds(31, 11, 362, 44);
	frame.getContentPane().add(txt);
	txt.setColumns(10);

	JButton button_7 = new JButton("7");
	button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_7.setForeground(Color.BLACK);
	button_7.setBackground(Color.LIGHT_GRAY);
	button_7.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "7");
		}
	    }
	});
	button_7.setBounds(29, 66, 40, 39);
	frame.getContentPane().add(button_7);

	JButton button_8 = new JButton("8");
	button_8.setForeground(Color.BLACK);
	button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_8.setBackground(Color.LIGHT_GRAY);
	button_8.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "8");
		}
	    }
	});
	button_8.setBounds(98, 66, 40, 39);
	frame.getContentPane().add(button_8);

	JButton button_9 = new JButton("9");
	button_9.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "9");
		}
	    }
	});
	button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_9.setForeground(Color.BLACK);
	button_9.setBackground(Color.LIGHT_GRAY);
	button_9.setBounds(166, 66, 40, 39);
	frame.getContentPane().add(button_9);

	JButton button_4 = new JButton("4");
	button_4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "4");
		}
	    }
	});
	button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_4.setForeground(Color.BLACK);
	button_4.setBackground(Color.LIGHT_GRAY);
	button_4.setBounds(29, 116, 40, 39);
	frame.getContentPane().add(button_4);

	JButton button_5 = new JButton("5");
	button_5.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "5");
		}
	    }
	});
	button_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_5.setForeground(Color.BLACK);
	button_5.setBackground(Color.LIGHT_GRAY);
	button_5.setBounds(98, 116, 40, 39);
	frame.getContentPane().add(button_5);

	JButton button_6 = new JButton("6");
	button_6.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "6");
		}
	    }
	});
	button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_6.setForeground(Color.BLACK);
	button_6.setBackground(Color.LIGHT_GRAY);
	button_6.setBounds(166, 116, 40, 39);
	frame.getContentPane().add(button_6);

	JButton button_1 = new JButton("1");
	button_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "1");
		}
	    }
	});
	button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_1.setForeground(Color.BLACK);
	button_1.setBackground(Color.LIGHT_GRAY);
	button_1.setBounds(29, 166, 40, 39);
	frame.getContentPane().add(button_1);

	JButton button_2 = new JButton("2");
	button_2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "2");
		}
	    }
	});
	button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_2.setForeground(Color.BLACK);
	button_2.setBackground(Color.LIGHT_GRAY);
	button_2.setBounds(98, 166, 40, 39);
	frame.getContentPane().add(button_2);

	JButton button_3 = new JButton("3");
	button_3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "3");
		}
	    }
	});
	button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_3.setForeground(Color.BLACK);
	button_3.setBackground(Color.LIGHT_GRAY);
	button_3.setBounds(166, 166, 40, 39);
	frame.getContentPane().add(button_3);

	JButton button_0 = new JButton("0");
	button_0.setFont(new Font("Tahoma", Font.PLAIN, 10));
	button_0.setForeground(Color.BLACK);
	button_0.setBackground(Color.LIGHT_GRAY);
	button_0.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		// Si la pantalla conté més de 8 números no deixará ficar cap més
		if (txt.getText().length() < 8) {
		    txt.setText(txt.getText() + "0");
		}
	    }
	});
	button_0.setBounds(29, 216, 40, 39);
	frame.getContentPane().add(button_0);

	JButton button_plus = new JButton("+");
	button_plus.setFont(new Font("Tahoma", Font.PLAIN, 16));
	button_plus.setBackground(Color.LIGHT_GRAY);
	button_plus.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		/*
		 * Si l'usuari prem el botó de suma guarda el número del textfield i borrem tot el contingut del
		 * textfield
		 */

		suma = true;
		if (txt.getText().equals("")) {
		    txt.setText("No has introduït el primer número.");
		} else {
		    sum = txt.getText();
		    txt.setText("");
		}
	    }
	});
	button_plus.setBounds(281, 66, 130, 39);
	frame.getContentPane().add(button_plus);

	JButton button_minus = new JButton("-");
	button_minus.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		/*
		 * Si l'usuari prem el botó de resta guarda el número del textfield i borrem tot el contingut del
		 * textfield
		 */
		resta = true;
		if (txt.getText().equals("")) {
		    txt.setText("No has introduït el primer número.");
		} else {
		    rest = txt.getText();
		    txt.setText("");
		}

	    }
	});
	button_minus.setFont(new Font("Tahoma", Font.PLAIN, 16));
	button_minus.setBackground(Color.LIGHT_GRAY);
	button_minus.setBounds(281, 116, 130, 39);
	frame.getContentPane().add(button_minus);

	JButton button_for = new JButton("*");
	button_for.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		/*
		 * Si l'usuari prem el botó de multiplicació guarda el número del textfield i borrem tot el contingut
		 * del textfield
		 */
		multiplicacio = true;
		if (txt.getText().equals("")) {
		    txt.setText("No has introduït el primer número.");
		} else {
		    mult = txt.getText();
		    txt.setText("");
		}
	    }
	});
	button_for.setFont(new Font("Tahoma", Font.PLAIN, 16));
	button_for.setBackground(Color.LIGHT_GRAY);
	button_for.setBounds(281, 166, 130, 39);
	frame.getContentPane().add(button_for);

	JButton button_div = new JButton("/");
	button_div.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		/*
		 * Si l'usuari prem el botó de divisió guarda el número del textfield i borrem tot el contingut del
		 * textfield
		 */
		divisio = true;
		if (txt.getText().equals("")) {
		    txt.setText("No has introduït el primer número.");
		} else {
		    divi = txt.getText();
		    txt.setText("");
		}
	    }
	});
	button_div.setFont(new Font("Tahoma", Font.PLAIN, 16));
	button_div.setBackground(Color.LIGHT_GRAY);
	button_div.setBounds(281, 216, 130, 39);
	frame.getContentPane().add(button_div);

	JButton button_res = new JButton("=");
	button_res.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		/*
		 * Si es prem el boto d'igual comprovem quina operació s'ha realitzat llavors obtenim els números de la
		 * pantalla, calculem el resultat i el mostrem
		 */
		if (suma) {
		    sum2 = txt.getText();
		    if (txt.getText().equals("")) {
			txt.setText("No has introduït el segon número.");
		    } else {
			result = Float.parseFloat(sum) + Float.parseFloat(sum2);
			txt.setText(String.valueOf(result));
		    }

		} else if (resta) {
		    rest2 = txt.getText();
		    if (txt.getText().equals("")) {
			txt.setText("No has introduït el segon número.");
		    } else {
			result = Float.parseFloat(rest) - Float.parseFloat(rest2);
			txt.setText(String.valueOf(result));
		    }

		} else if (multiplicacio) {
		    mult2 = txt.getText();
		    if (txt.getText().equals("")) {
			txt.setText("No has introduït el segon número.");
		    } else {
			result = Float.parseFloat(mult) * Float.parseFloat(mult2);
			txt.setText(String.valueOf(result));
		    }
		} else if (divisio) {
		    divi2 = txt.getText();
		    if (txt.getText().equals("")) {
			txt.setText("No has introduït el segon número.");
		    } else {
			// Si dividim per 0 sortira error
			if (Float.parseFloat(divi2) == 0) {
			    txt.setText("No es pot dividir per 0");

			} else {
			    result = Float.parseFloat(divi) / Float.parseFloat(divi2);
			    txt.setText(String.valueOf(result));
			}
		    }
		}
	    }
	});
	button_res.setFont(new Font("Tahoma", Font.PLAIN, 8));
	button_res.setForeground(Color.BLACK);
	button_res.setBackground(Color.LIGHT_GRAY);
	button_res.setBounds(98, 216, 40, 39);
	frame.getContentPane().add(button_res);

	JButton btnC = new JButton("C");
	btnC.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		// Netejem la pantalla si premem C
		txt.setText("");
	    }
	});
	btnC.setFont(new Font("Tahoma", Font.PLAIN, 8));
	btnC.setForeground(Color.BLACK);
	btnC.setBackground(Color.LIGHT_GRAY);
	btnC.setBounds(166, 216, 40, 39);
	frame.getContentPane().add(btnC);

	JButton btncoma = new JButton(",");
	btncoma.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	btncoma.setBackground(Color.LIGHT_GRAY);
	btncoma.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent arg0) {
		// Si no hi cap número o ja n'hi ha una coma o l'últim valor és una coma
		if (!txt.getText().equals("") && txt.getText().length() < 7 && !txt.getText().contains(".")) {
		    txt.setText(txt.getText() + ".");
		}
	    }
	});
	btncoma.setBounds(221, 146, 50, 23);
	frame.getContentPane().add(btncoma);
    }
}
