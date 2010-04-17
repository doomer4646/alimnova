import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

//VS4E -- DO NOT REMOVE THIS LINE!
public class Hipoteca extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JLabel jLabel0;
	private JLabel jLabel1;
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
	private JLabel jLabel2;
	private JLabel jLabel16;
	private JLabel jLabel17;
	private JLabel jLabel18;
	private JLabel jLabel19;
	private JLabel jLabel20;
	private JLabel jLabel21;
	private JButton jButton0;
	private JLabel jLabel22;
	private JLabel jLabel23;
	private JLabel jLabel24;
	private JLabel jLabel25;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JLabel jLabel28;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Hipoteca() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJButton0(), new Constraints(new Leading(198, 10, 10), new Leading(349, 10, 10)));
		add(getJPanel0(), new Constraints(new Leading(9, 154, 10, 10), new Leading(10, 396, 10, 10)));
		add(getJLabel28(), new Constraints(new Leading(172, 132, 12, 12), new Leading(10, 220, 12, 12)));
		setSize(330, 480);
	}

	private JLabel getJLabel28() {
		if (jLabel28 == null) {
			jLabel28 = new JLabel();
			
			jLabel28.setText(" ");
			jLabel28.setBorder(new LineBorder(Color.green, 1, false));
		}
		return jLabel28;
	}

	private JLabel getJLabel27() {
		if (jLabel27 == null) {
			jLabel27 = new JLabel();
			jLabel27.setBorder(new LineBorder(Color.white, 1, false));
			jLabel27.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel27MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel27;
	}

	private JLabel getJLabel26() {
		if (jLabel26 == null) {
			jLabel26 = new JLabel();
			jLabel26.setBorder(new LineBorder(Color.white, 1, false));
			jLabel26.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel26MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel26;
	}

	private JLabel getJLabel25() {
		if (jLabel25 == null) {
			jLabel25 = new JLabel();
			jLabel25.setBorder(new LineBorder(Color.white, 1, false));
			jLabel25.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel25MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel25;
	}

	private JLabel getJLabel24() {
		if (jLabel24 == null) {
			jLabel24 = new JLabel();
			jLabel24.setBorder(new LineBorder(Color.white, 1, false));
			jLabel24.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel24MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel24;
	}

	private JLabel getJLabel23() {
		if (jLabel23 == null) {
			jLabel23 = new JLabel();
			jLabel23.setBorder(new LineBorder(Color.white, 1, false));
			jLabel23.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel23MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel23;
	}

	private JLabel getJLabel22() {
		if (jLabel22 == null) {
			jLabel22 = new JLabel();
			jLabel22.setBorder(new LineBorder(new Color(255, 255, 255), 1, false));
			jLabel22.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel22MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel22;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setBackground(Color.white);
			jButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton0.setText("Aceptar");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel21() {
		if (jLabel21 == null) {
			jLabel21 = new JLabel();
			jLabel21.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
			jLabel21.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel21MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel21;
	}

	private JLabel getJLabel20() {
		if (jLabel20 == null) {
			jLabel20 = new JLabel();
			jLabel20.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
			jLabel20.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel20MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel20;
	}

	private JLabel getJLabel19() {
		if (jLabel19 == null) {
			jLabel19 = new JLabel();
			jLabel19.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
			jLabel19.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel19MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel19;
	}

	private JLabel getJLabel18() {
		if (jLabel18 == null) {
			jLabel18 = new JLabel();
			jLabel18.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
			jLabel18.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel18MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel18;
	}

	private JLabel getJLabel17() {
		if (jLabel17 == null) {
			jLabel17 = new JLabel();
			jLabel17.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
			jLabel17.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel17MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel17;
	}

	private JLabel getJLabel16() {
		if (jLabel16 == null) {
			jLabel16 = new JLabel();
			jLabel16.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel16.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel16MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel16;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel2.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel2MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel2;
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setBorder(new LineBorder(new Color(255, 255, 0), 1, false));
			jLabel15.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel15MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
			
		}
		return jLabel15;
	}

	private JLabel getJLabel14() {
		if (jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setBorder(new LineBorder(Color.red, 1, false));
			jLabel14.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
				public void mouseEntered(MouseEvent event) {
					jLabel14MouseMouseEntered(event);
				}
			});
		}
		return jLabel14;
	}

	private JLabel getJLabel13() {
		if (jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setBorder(new LineBorder(Color.red, 1, false));
			jLabel13.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel13MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel13;
	}

	private JLabel getJLabel12() {
		if (jLabel12 == null) {
			jLabel12 = new JLabel();
			jLabel12.setBorder(new LineBorder(Color.red, 1, false));
			jLabel12.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel12MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel12;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel11.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel11MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel11;
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel10.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel10MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel10;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel9.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel9MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel9;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel8.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel8MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel7.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel7MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel7;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel6.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel6MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel5.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel5MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel5;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel4.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel4MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel3.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event){
					jLabel3MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel3;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setBorder(new LineBorder(Color.magenta, 1, false));
			jLabel1.addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent event){
					jLabel1MouseMouseEntered(event);
				}
					public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setBorder(new LineBorder(Color.magenta, 1, false));
			jLabel0.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent event) {
					jLabel0MouseMouseEntered(event);
				}
				public void mouseExited(MouseEvent event){
					jLabelMouseMouseExited(event);
				}
			});
		}
		return jLabel0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.green, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJLabel0(), new Constraints(new Leading(12, 20, 10, 10), new Leading(21, 18, 10, 10)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(48, 20, 10, 10), new Leading(21, 18, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(12, 20, 12, 12), new Leading(57, 20, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(48, 20, 12, 12), new Leading(59, 20, 10, 10)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(86, 20, 12, 12), new Leading(57, 20, 12, 12)));
			jPanel0.add(getJLabel6(), new Constraints(new Leading(12, 20, 12, 12), new Leading(93, 20, 10, 10)));
			jPanel0.add(getJLabel7(), new Constraints(new Leading(48, 20, 12, 12), new Leading(93, 20, 12, 12)));
			jPanel0.add(getJLabel8(), new Constraints(new Leading(84, 20, 12, 12), new Leading(93, 20, 12, 12)));
			jPanel0.add(getJLabel9(), new Constraints(new Leading(12, 20, 12, 12), new Leading(131, 20, 12, 12)));
			jPanel0.add(getJLabel10(), new Constraints(new Leading(48, 20, 12, 12), new Leading(131, 20, 12, 12)));
			jPanel0.add(getJLabel11(), new Constraints(new Leading(84, 20, 12, 12), new Leading(131, 20, 12, 12)));
			jPanel0.add(getJLabel12(), new Constraints(new Leading(12, 20, 12, 12), new Leading(167, 20, 10, 10)));
			jPanel0.add(getJLabel13(), new Constraints(new Leading(48, 20, 12, 12), new Leading(167, 20, 12, 12)));
			jPanel0.add(getJLabel14(), new Constraints(new Leading(84, 20, 12, 12), new Leading(167, 20, 12, 12)));
			jPanel0.add(getJLabel15(), new Constraints(new Leading(12, 20, 12, 12), new Leading(205, 20, 12, 12)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(48, 20, 12, 12), new Leading(205, 20, 12, 12)));
			jPanel0.add(getJLabel16(), new Constraints(new Leading(84, 20, 12, 12), new Leading(203, 20, 10, 10)));
			jPanel0.add(getJLabel17(), new Constraints(new Leading(12, 20, 12, 12), new Leading(241, 20, 12, 12)));
			jPanel0.add(getJLabel18(), new Constraints(new Leading(48, 20, 12, 12), new Leading(241, 20, 12, 12)));
			jPanel0.add(getJLabel19(), new Constraints(new Leading(84, 20, 12, 12), new Leading(241, 20, 12, 12)));
			jPanel0.add(getJLabel20(), new Constraints(new Leading(12, 20, 12, 12), new Leading(279, 20, 12, 12)));
			jPanel0.add(getJLabel21(), new Constraints(new Leading(48, 20, 12, 12), new Leading(279, 20, 12, 12)));
			jPanel0.add(getJLabel22(), new Constraints(new Leading(12, 20, 12, 12), new Leading(317, 20, 12, 12)));
			jPanel0.add(getJLabel23(), new Constraints(new Leading(48, 20, 12, 12), new Leading(317, 20, 12, 12)));
			jPanel0.add(getJLabel24(), new Constraints(new Leading(84, 20, 12, 12), new Leading(317, 20, 12, 12)));
			jPanel0.add(getJLabel25(), new Constraints(new Leading(119, 20, 10, 10), new Leading(317, 20, 12, 12)));
			jPanel0.add(getJLabel26(), new Constraints(new Leading(12, 20, 12, 12), new Leading(355, 20, 12, 12)));
			jPanel0.add(getJLabel27(), new Constraints(new Leading(48, 20, 12, 12), new Leading(353, 20, 10, 10)));
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


	private void jLabel0MouseMouseEntered(MouseEvent event) {
		
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/1A.png"));
		
	}
	
	private void jLabel1MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/3A.png"));
	}
	
	private void jLabel3MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/6A.png"));
	}
	
	private void jLabel4MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/8A.png"));
	}
	
	private void jLabel5MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/9A.png"));
	}
	
	private void jLabel6MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/11A.PNG"));
	}
	
	private void jLabel7MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/13A.png"));
	}
	
	private void jLabel8MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/14A.png"));
	}
	
	private void jLabel9MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/16A.png"));
	}
	
	private void jLabel10MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/18A.png"));
	}
	
	private void jLabel11MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/19A.png"));
	}
	
	private void jLabel12MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/21A.png"));
	}
	
	private void jLabel13MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/23A.png"));
	}
	
	private void jLabel14MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/24A.png"));
	}
	
	private void jLabel15MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/26A.png"));
	}
	
	private void jLabel2MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/27A.png"));
	}
	
	private void jLabel16MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/29A.png"));
	}
	
	private void jLabel17MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/31A.png"));
	}
	
	private void jLabel18MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/32A.png"));
	}
	
	private void jLabel19MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/34A.png"));
	}
	
	private void jLabel20MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/37A.png"));
	}
	
	private void jLabel21MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/39A.png"));
	}
	
	private void jLabel22MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/5A.png"));
	}
	
	private void jLabel23MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/15A.png"));
	}
	
	private void jLabel24MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/25A.png"));
	}
	
	private void jLabel25MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/35A.png"));
	}
	
	private void jLabel26MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/12A.png"));
	}
	
	private void jLabel27MouseMouseEntered(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("PROPIEDADES/28A.png"));
	}
	
	private void jLabelMouseMouseExited(MouseEvent event){
		jLabel28.setIcon(new ImageIcon("vacio"));
	}

	private void jButton0MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
	}

	
	
	

}
