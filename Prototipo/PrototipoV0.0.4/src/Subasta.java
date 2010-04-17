import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

//VS4E -- DO NOT REMOVE THIS LINE!
public class Subasta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JPanel jPanel1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JSpinner jSpinner0;
	private JButton jButton0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Subasta(String FileName) {
		initComponents();
		jLabel0.setIcon(new ImageIcon(FileName));
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Bilateral(0, 0, 0), new Leading(0, 252, 10, 10)));
		add(getJPanel1(), new Constraints(new Bilateral(0, 0, 0), new Leading(270, 115, 10, 10)));
		setSize(320, 400);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton1.setText("RETIRO");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton0.setText("PUJAR");
		}
		return jButton0;
	}

	private JSpinner getJSpinner0() {
		if (jSpinner0 == null) {
			jSpinner0 = new JSpinner();
		}
		return jSpinner0;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
			jLabel3.setText("SUBASTA");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setBorder(new LineBorder(Color.black, 1, false));
		}
		return jLabel1;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(new LineBorder(Color.green, 1, false));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel1(), new Constraints(new Leading(12, 40, 12, 12), new Leading(12, 40, 10, 10)));
			jPanel1.add(getJLabel3(), new Constraints(new Bilateral(188, 12, 41), new Leading(7, 25, 12, 12)));
			jPanel1.add(getJSpinner0(), new Constraints(new Leading(53, 82, 10, 10), new Leading(73, 10, 10)));
			jPanel1.add(getJLabel2(), new Constraints(new Leading(66, 80, 10, 10), new Leading(22, 20, 12, 12)));
			jPanel1.add(getJButton1(), new Constraints(new Trailing(29, 97, 10, 10), new Leading(78, 12, 12)));
			jPanel1.add(getJButton0(), new Constraints(new Leading(200, 81, 12, 12), new Leading(38, 12, 12)));
		}
		return jPanel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
		}
		return jLabel0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.green, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel0(), new Constraints(new Leading(89, 132, 10, 10), new Leading(12, 220, 12, 12)));
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

	

}
