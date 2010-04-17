import java.awt.Color;
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
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


//VS4E -- DO NOT REMOVE THIS LINE!
public class RegistroNvo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField jTextField0;
	private JPasswordField jPasswordField0;
	private JPasswordField jPasswordField1;
	private JButton jButton0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public RegistroNvo() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Bilateral(0, 0, 0), new Bilateral(0, 0, 0)));
		setSize(376, 240);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
			jButton1.setText("Cancelar");
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
			jButton0.setText("Registrarse");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JPasswordField getJPasswordField1() {
		if (jPasswordField1 == null) {
			jPasswordField1 = new JPasswordField();
			jPasswordField1.setHorizontalAlignment(SwingConstants.CENTER);
			jPasswordField1.setEchoChar('*');
		}
		return jPasswordField1;
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

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
			jLabel2.setText("Contrase–a (repita):");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel1.setText("Contrase–a:");
		}
		return jLabel1;
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
			jPanel0.setBorder(new LineBorder(Color.green, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel0(), new Constraints(new Leading(22, 10, 10), new Leading(92, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(22, 12, 12), new Leading(130, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(22, 12, 12), new Leading(168, 12, 12)));
			jPanel0.add(getJTextField0(), new Constraints(new Leading(127, 93, 12, 12), new Leading(94, 10, 10)));
			jPanel0.add(getJPasswordField0(), new Constraints(new Leading(127, 108, 12, 12), new Leading(132, 12, 12)));
			jPanel0.add(getJPasswordField1(), new Constraints(new Leading(127, 108, 12, 12), new Leading(164, 12, 12)));
			jPanel0.add(getJButton0(), new Constraints(new Bilateral(253, 12, 102), new Leading(164, 12, 12)));
			jPanel0.add(getJButton1(), new Constraints(new Bilateral(264, 24, 76), new Leading(204, 12, 12)));
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

	private void jButton0MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
		Inicio frame = new Inicio();
		frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
		frame.setTitle("Inicio");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
		Inicio frame = new Inicio();
		frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
		frame.setTitle("Inicio");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	

}
