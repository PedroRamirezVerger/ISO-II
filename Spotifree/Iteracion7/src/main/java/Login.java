
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;

public class Login {

	private JFrame frmSpotifree;
	private JPanel panel;
	private JTextField tfUsuario;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JLabel lblAviso;
	private JButton btnEntrar;
	private JPasswordField pwdfPassword;
	private final String password = "spotifree";
	private JLabel label;
	private JLabel lblolvidasteTuContrasea;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmSpotifree.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpotifree = new JFrame();
		frmSpotifree.setTitle("Spotifree");
		frmSpotifree.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\artur\\Downloads\\icon.png"));
		frmSpotifree.setBounds(100, 100, 563, 394);
		frmSpotifree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSpotifree.getContentPane().setLayout(null);
		{
			panel = new JPanel();

			panel.setBounds(0, 0, 647, 355);
			frmSpotifree.getContentPane().add(panel);
			panel.setLayout(null);
			{
				tfUsuario = new JTextField();

				tfUsuario.setBounds(306, 96, 200, 20);
				panel.add(tfUsuario);
				tfUsuario.setColumns(10);
			}
			{
				lblUsuario = new JLabel("Usuario:");
				lblUsuario.setBounds(81, 117, 86, 14);
				panel.add(lblUsuario);
			}
			{
				
				lblPassword = new JLabel("Contraseña:");
				lblPassword.setBounds(81, 161, 86, 14);
				panel.add(lblPassword);
			}
			{
				lblAviso = new JLabel("");
				lblAviso.setOpaque(true);
				lblAviso.setBounds(35, 277, 457, 55);
				panel.add(lblAviso);
			}
			{
				btnEntrar = new JButton("Entrar");
				btnEntrar.addActionListener(new BtnEntrarActionListener());

				btnEntrar.setEnabled(false);
				btnEntrar.setBounds(431, 223, 89, 23);
				panel.add(btnEntrar);
			}
			{
				pwdfPassword = new JPasswordField();
				pwdfPassword.addActionListener(new PwdfPasswordActionListener());
				pwdfPassword.addKeyListener(new PwdfPasswordKeyListener());
				pwdfPassword.setBounds(306, 158, 200, 20);
				panel.add(pwdfPassword);
			}
			{
				label = new JLabel("");
				label.setIcon(new ImageIcon("C:\\Users\\artur\\Downloads\\icon.png"));
				label.setBounds(173, 0, 333, 266);
				panel.add(label);
			}
			{
				lblolvidasteTuContrasea = new JLabel("¿Olvidaste tu contraseña?");
				lblolvidasteTuContrasea.setBounds(32, 224, 131, 20);
				panel.add(lblolvidasteTuContrasea);
			}
			{
				lblNewLabel = new JLabel("¿Todavia no estas registrado? Registrate!");
				lblNewLabel.setBounds(196, 227, 208, 14);
				panel.add(lblNewLabel);
			}
		}
	}
		private class PwdfPasswordActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {

			//obtenemos la contraseña introducida
			if (String.valueOf(pwdfPassword.getPassword()).equals(password))
			{
			lblAviso.setBackground(Color.GREEN);
			lblAviso.setText("Contraseña correcta. Puede entrar");
			lblAviso.setVisible(true);
			btnEntrar.setEnabled(true);

			
			} else {
			lblAviso.setBackground(Color.RED);
			lblAviso.setText("Contraseña incorrecta. Vuelva a intentarlo");
			lblAviso.setVisible(true);
			btnEntrar.setEnabled(false);
			}
			}
			}
		private class BtnEntrarActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
			//finaliza la ejecución de la aplicación
			//System.exit(0);
			//Se crea una instancia de la segunda ventana (JFrame)

			//se hace visible

			//se destruye la ventana actual (atributo a nivel de clase)
			frmSpotifree.dispose();

			}
			}

		private class PwdfPasswordKeyListener extends KeyAdapter {
			@Override
			public void keyTyped(KeyEvent arg0) {
			//mostramos el carácter de la tecla pulsada

			}
			}

			}





