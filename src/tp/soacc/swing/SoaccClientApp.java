package tp.soacc.swing;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.xml.rpc.ServiceException;

import tp.soacc.wsdl2.Eleve;
import tp.soacc.wsdl2.ElevePortType;
import tp.soacc.wsdl.EleveLocator;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;

public class SoaccClientApp extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 872157627256032188L;


	public SoaccClientApp() {
		super ("Application cliente SOAP - TP SOACC");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,100);
		this.setLocationRelativeTo(null);
		JPanel contentPane = (JPanel) this.getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JTextField("600402"));
		JButton button = new JButton("Chercher moyenne !");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(button);
		
		  final JTextArea textArea = new JTextArea();
	        this.getContentPane().add(BorderLayout.CENTER, textArea);
		
		button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
                Eleve elev =new Eleve();
                textArea.append("La moyenne de l'élève est :.\n");
                try {
					ElevePortType si = elev.getEleveHttpSoap11Endpoint();
					int moyen = si.getMoyen("600402");
					System.out.println(moyen);
					  textArea.append(moyen+"");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
             }
        });
		
	}

	
	public static void main (String[] args) throws UnsupportedLookAndFeelException {
		
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		SoaccClientApp wind = new SoaccClientApp();
		
	} 

}
