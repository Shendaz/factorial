import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class FinestraWindows {
	String str = new String();

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraWindows window = new FinestraWindows();
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
	public FinestraWindows() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(54, 26, 325, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBoto = new JButton("Esborrar");
		btnBoto.setBounds(29, 195, 179, 44);
		btnBoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				str = textField.getText();
				if (str.equals("")){
					textField.setText("No hi ha res scrit");
				}else{
				textField.setText("");
				}
			}
		});
		btnBoto.setBackground(Color.BLACK);
		btnBoto.setForeground(Color.RED);
		frame.getContentPane().add(btnBoto);
		
		JButton btnButton = new JButton("Mostrar");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(str);
			}
		});
		btnButton.setBounds(230, 195, 179, 44);
		btnButton.setForeground(Color.BLUE);
		frame.getContentPane().add(btnButton);
		
		
	}
}
