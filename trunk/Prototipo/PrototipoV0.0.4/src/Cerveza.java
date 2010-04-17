import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


//VS4E -- DO NOT REMOVE THIS LINE!
public class Cerveza extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JLabel jLabel22;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel23;
	private JLabel jLabel24;
	private JLabel jLabel25;
	private JLabel jLabel28;
	private JPanel jPanel1;
	private JButton jButton0;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Cerveza() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(12, 154, 12, 12), new Leading(14, 376, 10, 10)));
		add(getJLabel28(), new Constraints(new Leading(182, 132, 10, 10), new Leading(29, 220, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(198, 116, 12, 12), new Leading(287, 100, 10, 10)));
		setSize(331, 428);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton1.setText("CANCELAR");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton0.setText("COMPRAR");
		}
		return jButton0;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(new LineBorder(Color.green, 1, false));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJButton0(), new Constraints(new Leading(12, 12, 12), new Leading(10, 10, 10)));
			jPanel1.add(getJButton1(), new Constraints(new Leading(9, 12, 12), new Leading(56, 12, 12)));
		}
		return jPanel1;
	}

	private JLabel getJLabel28() {
		if (jLabel28 == null) {
			jLabel28 = new JLabel();
		}
		return jLabel28;
	}

	private JLabel getJLabel25() {
		if (jLabel25 == null) {
			jLabel25 = new JLabel();
			jLabel25.setBorder(new LineBorder(Color.white, 1, false));
		}
		return jLabel25;
	}

	private JLabel getJLabel24() {
		if (jLabel24 == null) {
			jLabel24 = new JLabel();
			jLabel24.setBorder(new LineBorder(Color.white, 1, false));
		}
		return jLabel24;
	}

	private JLabel getJLabel23() {
		if (jLabel23 == null) {
			jLabel23 = new JLabel();
			jLabel23.setBorder(new LineBorder(Color.white, 1, false));
		}
		return jLabel23;
	}

	private JLabel getJLabel27() {
		if (jLabel27 == null) {
			jLabel27 = new JLabel();
			jLabel27.setBorder(new LineBorder(Color.white, 1, false));
		}
		return jLabel27;
	}

	private JLabel getJLabel26() {
		if (jLabel26 == null) {
			jLabel26 = new JLabel();
			jLabel26.setBorder(new LineBorder(Color.white, 1, false));
		}
		return jLabel26;
	}

	private JLabel getJLabel22() {
		if (jLabel22 == null) {
			jLabel22 = new JLabel();
			jLabel22.setBorder(new LineBorder(Color.white, 1, false));
		}
		return jLabel22;
	}

	private JLabel getJLabel21() {
		if (jLabel21 == null) {
			jLabel21 = new JLabel();
			jLabel21.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
		}
		return jLabel21;
	}

	private JLabel getJLabel20() {
		if (jLabel20 == null) {
			jLabel20 = new JLabel();
			jLabel20.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
		}
		return jLabel20;
	}

	private JLabel getJLabel19() {
		if (jLabel19 == null) {
			jLabel19 = new JLabel();
			jLabel19.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		}
		return jLabel19;
	}

	private JLabel getJLabel18() {
		if (jLabel18 == null) {
			jLabel18 = new JLabel();
			jLabel18.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		}
		return jLabel18;
	}

	private JLabel getJLabel17() {
		if (jLabel17 == null) {
			jLabel17 = new JLabel();
			jLabel17.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
		}
		return jLabel17;
	}

	private JLabel getJLabel16() {
		if (jLabel16 == null) {
			jLabel16 = new JLabel();
			jLabel16.setBorder(new LineBorder(Color.yellow, 1, false));
		}
		return jLabel16;
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setBorder(new LineBorder(Color.yellow, 1, false));
		}
		return jLabel15;
	}

	private JLabel getJLabel14() {
		if (jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setBorder(new LineBorder(new Color(255, 255, 0), 1, false));
		}
		return jLabel14;
	}

	private JLabel getJLabel13() {
		if (jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setBorder(new LineBorder(Color.red, 1, false));
		}
		return jLabel13;
	}

	private JLabel getJLabel12() {
		if (jLabel12 == null) {
			jLabel12 = new JLabel();
			jLabel12.setBorder(new LineBorder(Color.red, 1, false));
		}
		return jLabel12;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setBorder(new LineBorder(Color.red, 1, false));
		}
		return jLabel11;
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
		}
		return jLabel10;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
		}
		return jLabel9;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
		}
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
		}
		return jLabel7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setBorder(new LineBorder(Color.cyan, 1, false));
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setBorder(new LineBorder(Color.cyan, 1, false));
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setBorder(new LineBorder(Color.cyan, 1, false));
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setBorder(new LineBorder(Color.magenta, 1, false));
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setBorder(new LineBorder(Color.magenta, 1, false));
		}
		return jLabel0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.green, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel0(), new Constraints(new Leading(12, 19, 12, 12), new Leading(12, 21, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(43, 19, 12, 12), new Leading(12, 21, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(12, 19, 12, 12), new Leading(48, 21, 10, 10)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(43, 19, 12, 12), new Leading(48, 21, 12, 12)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(74, 19, 12, 12), new Leading(48, 21, 12, 12)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(12, 19, 12, 12), new Leading(79, 21, 10, 10)));
			jPanel0.add(getJLabel6(), new Constraints(new Leading(43, 19, 12, 12), new Leading(81, 21, 12, 12)));
			jPanel0.add(getJLabel7(), new Constraints(new Leading(74, 19, 12, 12), new Leading(79, 21, 12, 12)));
			jPanel0.add(getJLabel8(), new Constraints(new Leading(12, 19, 12, 12), new Leading(114, 21, 12, 12)));
			jPanel0.add(getJLabel9(), new Constraints(new Leading(43, 19, 12, 12), new Leading(114, 21, 12, 12)));
			jPanel0.add(getJLabel10(), new Constraints(new Leading(74, 19, 12, 12), new Leading(114, 21, 12, 12)));
			jPanel0.add(getJLabel11(), new Constraints(new Leading(12, 19, 12, 12), new Leading(147, 21, 12, 12)));
			jPanel0.add(getJLabel12(), new Constraints(new Leading(43, 19, 12, 12), new Leading(147, 21, 12, 12)));
			jPanel0.add(getJLabel13(), new Constraints(new Leading(74, 19, 12, 12), new Leading(147, 21, 12, 12)));
			jPanel0.add(getJLabel14(), new Constraints(new Leading(12, 19, 12, 12), new Leading(180, 21, 12, 12)));
			jPanel0.add(getJLabel15(), new Constraints(new Leading(43, 19, 12, 12), new Leading(180, 21, 12, 12)));
			jPanel0.add(getJLabel16(), new Constraints(new Leading(74, 19, 12, 12), new Leading(180, 21, 12, 12)));
			jPanel0.add(getJLabel18(), new Constraints(new Leading(43, 19, 12, 12), new Leading(213, 21, 12, 12)));
			jPanel0.add(getJLabel19(), new Constraints(new Leading(74, 19, 12, 12), new Leading(213, 21, 12, 12)));
			jPanel0.add(getJLabel26(), new Constraints(new Leading(12, 19, 12, 12), new Leading(328, 21, 10, 10)));
			jPanel0.add(getJLabel27(), new Constraints(new Leading(43, 19, 12, 12), new Leading(328, 21, 12, 12)));
			jPanel0.add(getJLabel22(), new Constraints(new Leading(12, 19, 12, 12), new Leading(289, 21, 12, 12)));
			jPanel0.add(getJLabel23(), new Constraints(new Leading(43, 19, 12, 12), new Leading(289, 21, 12, 12)));
			jPanel0.add(getJLabel24(), new Constraints(new Leading(74, 19, 12, 12), new Leading(289, 21, 12, 12)));
			jPanel0.add(getJLabel25(), new Constraints(new Leading(107, 19, 10, 10), new Leading(289, 21, 12, 12)));
			jPanel0.add(getJLabel20(), new Constraints(new Leading(12, 19, 12, 12), new Leading(252, 21, 12, 12)));
			jPanel0.add(getJLabel21(), new Constraints(new Leading(43, 19, 12, 12), new Leading(252, 21, 12, 12)));
			jPanel0.add(getJLabel17(), new Constraints(new Leading(12, 19, 12, 12), new Leading(213, 21, 12, 12)));
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
