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
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;

//VS4E -- DO NOT REMOVE THIS LINE!
public class DesHipoteca extends JFrame {

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
	private JLabel jLabelInfoPropiedad;
	private JButton jButton1;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public DesHipoteca() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(9, 130, 10, 10), new Leading(10, 317, 10, 10)));
		add(getJLabel22(), new Constraints(new Leading(151, 12, 12), new Leading(251, 10, 10)));
		add(getJLabel23(), new Constraints(new Leading(195, 88, 12, 12), new Leading(253, 20, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(185, 12, 12), new Leading(291, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(199, 10, 10), new Leading(330, 10, 10)));
		add(getInfoPropiedad(), new Constraints(new Leading(164, 132, 10, 10), new Leading(10, 220, 12, 12)));
		setSize(320, 368);
	}

	private JLabel getInfoPropiedad() {
		if (jLabelInfoPropiedad == null) {
			jLabelInfoPropiedad = new JLabel();
			jLabelInfoPropiedad.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelInfoPropiedad.setText("InfoPropiedad");
			
		}
		return jLabelInfoPropiedad;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
			jButton1.setText("CANCELAR");
		}
		return jButton1;
	}

	private JLabel getJLabel23() {
		if (jLabel23 == null) {
			jLabel23 = new JLabel();
			jLabel23.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel23.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return jLabel23;
	}

	private JLabel getJLabel22() {
		if (jLabel22 == null) {
			jLabel22 = new JLabel();
			jLabel22.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel22.setText("Valor:");
		}
		return jLabel22;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setBackground(Color.white);
			jButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
			jButton0.setText("Pagar Hipoteca");
		}
		return jButton0;
	}

	private JLabel getJLabel21() {
		if (jLabel21 == null) {
			jLabel21 = new JLabel();
			jLabel21.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
			jLabel21.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel21MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel20MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel19MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel18MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel17MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel16MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel2MouseMouseEntered(event);
				}
			});
		}
		return jLabel2;
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel15.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel15MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel13MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel12MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel11MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel10MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel9MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel8MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel7MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel6MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel5MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel4MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel3MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel1MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabelMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel0MouseMouseEntered(event);
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
			jPanel0.add(getJLabel17(), new Constraints(new Leading(12, 20, 12, 12), new Leading(241, 20, 12, 12)));
			jPanel0.add(getJLabel18(), new Constraints(new Leading(48, 20, 12, 12), new Leading(241, 20, 12, 12)));
			jPanel0.add(getJLabel19(), new Constraints(new Leading(84, 20, 12, 12), new Leading(241, 20, 12, 12)));
			jPanel0.add(getJLabel20(), new Constraints(new Leading(12, 20, 12, 12), new Leading(279, 20, 12, 12)));
			jPanel0.add(getJLabel21(), new Constraints(new Leading(48, 20, 12, 12), new Leading(279, 20, 12, 12)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(48, 20, 12, 12), new Leading(57, 20, 12, 12)));
			jPanel0.add(getJLabel16(), new Constraints(new Leading(86, 20, 12, 12), new Leading(205, 20, 12, 12)));
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



	private void jLabel0MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/1A.png"));
	}

	private void jLabel1MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/3A.png"));
	}

	private void jLabel3MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/6A.png"));
	}

	private void jLabel5MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/9A.png"));
	}

	private void jLabel6MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/11A.png"));
	}

	private void jLabel7MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/13A.png"));
	}

	private void jLabel8MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/14A.png"));
	}

	private void jLabel9MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/16A.png"));
	}

	private void jLabel10MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/18A.png"));
	}

	private void jLabel11MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/19A.png"));
	}

	private void jLabel12MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/21A.png"));
	}

	private void jLabel13MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/23A.png"));
	}

	private void jLabel14MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/24A.png"));
	}

	private void jLabel15MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/26A.png"));
	}

	private void jLabel2MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/27A.png"));
	}
	
	private void jLabel16MouseMouseEntered(MouseEvent event){
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/29A.png"));
	}

	private void jLabel17MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/31A.png"));
	}

	private void jLabel18MouseMouseEntered(MouseEvent event){
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/32A.png"));
	}

	private void jLabel19MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/34A.png"));
	}

	private void jLabel20MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/37A.png"));
	}

	private void jLabel21MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/39A.png"));
	}

	private void jLabel4MouseMouseEntered(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("PROPIEDADES/8A.png"));
	}

	private void jLabelMouseMouseExited(MouseEvent event) {
		jLabelInfoPropiedad.setIcon(new ImageIcon("vacio"));
	}

}
