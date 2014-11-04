import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Factorial {

    private JFrame frame;
    private JTextField txt;
    int num;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Factorial window = new Factorial();
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
    // Funció recursiva per calcular el factorial
    public int ffactorial(int num) {
	if (num == 0) {
	    return 1;
	} else {
	    return num * ffactorial(num - 1);
	}
    }

    public Factorial() {
	initialize();

    }

    // Funció opcional per calcular el factorial mitjançant un for
    /*
     * public int factorial(int num) { int resultat = 1; int i; if (num == 0) { return 1; } else { for (i = num; i >= 1;
     * i--) { resultat = resultat * ( i); } } return resultat; }
     */

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	JButton btn_1 = new JButton("1");
	btn_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "1");
		}
	    }
	});
	btn_1.setBounds(34, 98, 41, 35);
	frame.getContentPane().add(btn_1);

	JButton btn_2 = new JButton("2");
	btn_2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "2");
		}
	    }
	});
	btn_2.setBounds(111, 98, 41, 35);
	frame.getContentPane().add(btn_2);

	JButton btn_3 = new JButton("3");
	btn_3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "3");
		}
	    }
	});
	btn_3.setBounds(189, 98, 41, 35);
	frame.getContentPane().add(btn_3);

	JButton btn_4 = new JButton("4");
	btn_4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "4");
		}
	    }
	});
	btn_4.setBounds(34, 157, 41, 35);
	frame.getContentPane().add(btn_4);

	JButton btn_5 = new JButton("5");
	btn_5.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "5");
		}
	    }
	});
	btn_5.setBounds(111, 157, 41, 35);
	frame.getContentPane().add(btn_5);

	JButton btn_6 = new JButton("6");
	btn_6.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "6");
		}
	    }
	});
	btn_6.setBounds(189, 157, 41, 35);
	frame.getContentPane().add(btn_6);

	JButton btn_7 = new JButton("7");
	btn_7.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "7");
		}
	    }
	});
	btn_7.setBounds(34, 215, 41, 35);
	frame.getContentPane().add(btn_7);

	JButton btn_8 = new JButton("8");
	btn_8.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "8");
		}
	    }
	});
	btn_8.setBounds(111, 215, 41, 35);
	frame.getContentPane().add(btn_8);

	JButton btn_9 = new JButton("9");
	btn_9.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    txt.setText(txt.getText() + "9");
		}
	    }
	});
	btn_9.setBounds(189, 215, 41, 35);
	frame.getContentPane().add(btn_9);

	JButton btn_factorial = new JButton("n!");
	btn_factorial.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		// Agafem el número del quadre de text i el passem com a paràmetre de la funció ffactorial()
		num = Integer.parseInt(txt.getText());
		// Passem el resultat a String i el mostrem
		txt.setText(Integer.toString(ffactorial(num)));

	    }
	});
	btn_factorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btn_factorial.setBounds(349, 98, 64, 152);
	frame.getContentPane().add(btn_factorial);

	txt = new JTextField();
	txt.setBounds(10, 11, 403, 54);
	frame.getContentPane().add(txt);
	txt.setColumns(10);

	JButton btn_0 = new JButton("0");
	btn_0.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		if (txt.getText().length() < 4) {
		    if (txt.getText().equals("")) {
		    } else {
			txt.setText(txt.getText() + "0");
		    }
		}
	    }
	});
	btn_0.setBounds(253, 215, 52, 35);
	frame.getContentPane().add(btn_0);

	JButton btn_C = new JButton("C");
	btn_C.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btn_C.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		txt.setText("");
	    }
	});
	btn_C.setBounds(253, 98, 52, 94);
	frame.getContentPane().add(btn_C);
    }
}
