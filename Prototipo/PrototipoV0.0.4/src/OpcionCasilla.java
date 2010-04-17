import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


//VS4E -- DO NOT REMOVE THIS LINE!
public class OpcionCasilla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel1;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JLabel jLabel2;
	private JLabel jLabel4;
	private JButton jButton0;
	private JButton jButton1;
	private String FileName;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public OpcionCasilla(String FileName) {
		initComponents();
		this.FileName=FileName;
		jLabel4.setIcon(new ImageIcon(FileName));
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(0, 320, 12, 12), new Leading(0, 399, 12, 12)));
		setSize(320, 399);
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton1.setText("SUBASTAR");
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
			jButton0.setText("COMPRAR");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
		}
		return jLabel4;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
		}
		return jLabel2;
	}

	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setBorder(new LineBorder(Color.green, 1, false));
			jPanel3.setLayout(new GroupLayout());
			jPanel3.add(getJButton0(), new Constraints(new Leading(9, 10, 10), new Trailing(12, 12, 12)));
			jPanel3.add(getJButton1(), new Constraints(new Leading(120, 12, 12), new Leading(12, 12, 12)));
		}
		return jPanel3;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
			jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
			jLabel0.setText("Precio Venta");
		}
		return jLabel0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJPanel1(), new Constraints(new Leading(36, 244, 10, 10), new Leading(12, 67, 10, 10)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(138, 12, 12), new Leading(118, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(92, 132, 12, 12), new Leading(97, 220, 12, 12)));
			jPanel0.add(getJPanel3(), new Constraints(new Leading(43, 230, 12, 12), new Leading(335, 55, 10, 10)));
		}
		return jPanel0;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(new LineBorder(Color.green, 1, false));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel1(), new Constraints(new Leading(27, 191, 10, 10), new Leading(31, 26, 12, 12)));
			jPanel1.add(getJLabel0(), new Constraints(new Leading(80, 12, 12), new Leading(4, 12, 12)));
		}
		return jPanel1;
	}

	private static void installLnF() {
		try {
			UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
		Subasta frame = new Subasta(this.FileName);
		frame.setTitle("Subasta");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
	}



}
