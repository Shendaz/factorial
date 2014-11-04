import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Provauf1 {

    private JFrame frame;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JTextField txtResultat;
    //Creem les variables v1, v2 i res de tipus float
    float v1,v2,res;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    Provauf1 window = new Provauf1();
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
    public Provauf1() {
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
	
	JLabel lblTitol = new JLabel("C\u00E0lcul del IMC");
	lblTitol.setBounds(0, 25, 434, 29);
	lblTitol.setHorizontalAlignment(SwingConstants.CENTER);
	lblTitol.setFont(new Font("Tahoma", Font.PLAIN, 30));
	frame.getContentPane().add(lblTitol);
	
	JButton btnCalcula = new JButton("Calcular");
	btnCalcula.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    //Controlem que si no han introduit el pes o l'altura, al resultat printi 0
		    if (txtValor1.getText().equals("") || txtValor2.getText().equals("")){
			txtResultat.setText("No hi ha dades");
		    }else if(txtValor1.getText().equals("0") || txtValor2.getText().equals("0")) {
			txtResultat.setText("0");
		    }
		    else{
			//v1 i v2 guarden els valors que continguin les caixes i el passen a integer
			v1 = Integer.parseInt(txtValor1.getText());
			v2 = Integer.parseInt(txtValor2.getText());
			//res fa el calcul del imc
			res = (v1/(v2*v2));
			//Mostrem a la caixa de resultat el valor de res passat a float
			txtResultat.setText(String.valueOf(res));
			//txtResultat.setText(String.valueOf(Integer.parseInt(txtValor1.getText())/(Integer.parseInt(txtValor2.getText())*Integer.parseInt(txtValor2.getText()))));
		    }
		}
	});
	btnCalcula.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnCalcula.setBounds(98, 180, 89, 23);
	frame.getContentPane().add(btnCalcula);
	
	JButton btnEsborra = new JButton("Esborrar");
	btnEsborra.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    //Esborrem el contingut de totes les caixes de text
		    txtValor1.setText("");
		    txtValor2.setText("");
		    txtResultat.setText("");
		    
		}
	});
	btnEsborra.setFont(new Font("Tahoma", Font.PLAIN, 14));
	btnEsborra.setBounds(260, 180, 89, 23);
	frame.getContentPane().add(btnEsborra);
	
	txtValor1 = new JTextField();
	txtValor1.setBounds(81, 81, 86, 20);
	frame.getContentPane().add(txtValor1);
	txtValor1.setColumns(10);
	
	txtValor2 = new JTextField();
	txtValor2.setBounds(194, 81, 86, 20);
	frame.getContentPane().add(txtValor2);
	txtValor2.setColumns(10);
	
	txtResultat = new JTextField();
	txtResultat.setBounds(311, 81, 99, 20);
	frame.getContentPane().add(txtResultat);
	txtResultat.setColumns(10);
	
	JLabel lblaltura = new JLabel("Altura");
	lblaltura.setBounds(91, 112, 46, 14);
	frame.getContentPane().add(lblaltura);
	
	JLabel lblpes = new JLabel("Pes");
	lblpes.setBounds(204, 112, 46, 14);
	frame.getContentPane().add(lblpes);
	
	JLabel lblcm = new JLabel("cm");
	lblcm.setBounds(174, 84, 46, 14);
	frame.getContentPane().add(lblcm);
	
	JLabel lblkg = new JLabel("kg");
	lblkg.setBounds(287, 84, 46, 14);
	frame.getContentPane().add(lblkg);
	
	JLabel lblImc = new JLabel("IMC");
	lblImc.setBounds(321, 112, 46, 14);
	frame.getContentPane().add(lblImc);
    }
}
