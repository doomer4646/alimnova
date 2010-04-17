import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

//VS4E -- DO NOT REMOVE THIS LINE!
public class Inicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JTextField jTextField0;
	private JPasswordField jPasswordField0;
	private JLabel jLabel1;
	private JButton jButton0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Inicio() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Bilateral(2, 0, 0), new Bilateral(0, 0, 0)));
		setSize(320, 240);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
			jButton1.setText("Crear Cuenta");
			jButton1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton1MouseMouseClicked(event);
				}
			});
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton0.setText("Registrar");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel1.setText("Contrase–a:");
		}
		return jLabel1;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setHorizontalAlignment(SwingConstants.CENTER);
			jPasswordField0.setEchoChar('*');
		}
		return jPasswordField0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			jTextField0.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jTextField0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel0.setText("Usuario:");
		}
		return jLabel0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel0(), new Constraints(new Leading(20, 10, 10), new Leading(105, 10, 10)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(95, 95, 12, 12), new Leading(101, 12, 12)));
			jPanel0.add(getJPasswordField0(), new Constraints(new Leading(95, 96, 12, 12), new Leading(132, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(20, 12, 12), new Leading(133, 12, 12)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(32, 10, 10), new Leading(170, 12, 12)));
			jPanel0.add(getJButton1(), new Constraints(new Leading(209, 10, 10), new Leading(213, 19, 10, 10)));
		}
		return jPanel0;
	}

	private static void installLnF() {
		try {
			UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Inicio frame = new Inicio();
				frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
				frame.setTitle("Inicio");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
		Principal frame = new Principal();
		frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
		frame.setTitle("Principal");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
		RegistroNvo frame = new RegistroNvo();
		frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
		frame.setTitle("RegistroNvo");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
