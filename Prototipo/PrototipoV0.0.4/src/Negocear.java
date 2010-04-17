import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


//VS4E -- DO NOT REMOVE THIS LINE!
public class Negocear extends JFrame {

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
	private JLabel jLabel23;
	private JLabel jLabel24;
	private JLabel jLabel25;
	private JLabel jLabel26;
	private JLabel jLabel27;
	private JPanel jPanel1;
	private JLabel jLabel28;
	private JLabel jLabel29;
	private JLabel jLabel30;
	private JLabel jLabel31;
	private JLabel jLabel32;
	private JLabel jLabel33;
	private JLabel jLabel34;
	private JLabel jLabel35;
	private JLabel jLabel36;
	private JLabel jLabel37;
	private JLabel jLabel38;
	private JLabel jLabel39;
	private JLabel jLabel40;
	private JLabel jLabel41;
	private JLabel jLabel42;
	private JLabel jLabel43;
	private JLabel jLabel44;
	private JLabel jLabel45;
	private JLabel jLabel46;
	private JLabel jLabel47;
	private JLabel jLabel48;
	private JLabel jLabel49;
	private JLabel jLabel50;
	private JLabel jLabel51;
	private JLabel jLabel52;
	private JLabel jLabel53;
	private JLabel jLabel54;
	private JLabel jLabel55;
	private JPanel jPanel2;
	private JSpinner jSpinner0;
	private JLabel jLabel56;
	private JPanel jPanel3;
	private JLabel jLabel57;
	private JSpinner jSpinner1;
	private JPanel jPanel4;
	private JButton jButton0;
	private JButton jButton1;
	private JLabel jLabelPropiedad;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Negocear() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(9, 154, 10, 15), new Leading(10, 395, 10, 10)));
		add(getJPanel1(), new Constraints(new Leading(343, 154, 10, 10), new Leading(12, 395, 12, 12)));
		add(getJPanel2(), new Constraints(new Leading(37, 102, 10, 10), new Leading(417, 12, 12)));
		add(getJPanel3(), new Constraints(new Leading(370, 100, 12, 12), new Leading(417, 66, 12, 12)));
		add(getJPanel4(), new Constraints(new Leading(181, 144, 12, 12), new Leading(10, 397, 12, 12)));
		setSize(514, 529);
	}

	private JLabel getJLabelPropiedad() {
		if (jLabelPropiedad == null) {
			jLabelPropiedad = new JLabel();
			jLabelPropiedad.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabelPropiedad.setHorizontalAlignment(SwingConstants.CENTER);
			jLabelPropiedad.setText("InfoPropiedad");
		}
		return jLabelPropiedad;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
			jButton1.setText("CANCELAR");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton0.setText("OFRECER");
		}
		return jButton0;
	}

	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(new GroupLayout());
			jPanel4.add(getJButton0(), new Constraints(new Leading(32, 12, 12), new Leading(275, 10, 10)));
			jPanel4.add(getJButton1(), new Constraints(new Leading(27, 100, 12, 12), new Leading(331, 10, 10)));
			jPanel4.add(getJLabelPropiedad(), new Constraints(new Leading(6, 132, 10, 10), new Leading(7, 220, 10, 10)));
		}
		return jPanel4;
	}

	private JSpinner getJSpinner1() {
		if (jSpinner1 == null) {
			jSpinner1 = new JSpinner();
		}
		return jSpinner1;
	}

	private JLabel getJLabel57() {
		if (jLabel57 == null) {
			jLabel57 = new JLabel();
			jLabel57.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel57.setText("Monto de dinero");
		}
		return jLabel57;
	}

	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jPanel3 = new JPanel();
			jPanel3.setBorder(new LineBorder(Color.green, 1, false));
			jPanel3.setLayout(new GroupLayout());
			jPanel3.add(getJLabel57(), new Constraints(new Leading(2, 94, 10, 10), new Leading(8, 10, 10)));
			jPanel3.add(getJSpinner1(), new Constraints(new Leading(22, 54, 12, 12), new Leading(32, 12, 12)));
		}
		return jPanel3;
	}

	private JLabel getJLabel56() {
		if (jLabel56 == null) {
			jLabel56 = new JLabel();
			jLabel56.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabel56.setText("Monto de dinero");
		}
		return jLabel56;
	}

	private JSpinner getJSpinner0() {
		if (jSpinner0 == null) {
			jSpinner0 = new JSpinner();
		}
		return jSpinner0;
	}

	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setBorder(new LineBorder(Color.green, 1, false));
			jPanel2.setLayout(new GroupLayout());
			jPanel2.add(getJLabel56(), new Constraints(new Leading(3, 10, 10), new Leading(7, 10, 10)));
			jPanel2.add(getJSpinner0(), new Constraints(new Leading(24, 52, 12, 12), new Leading(34, 10, 10)));
		}
		return jPanel2;
	}

	private JLabel getJLabel55() {
		if (jLabel55 == null) {
			jLabel55 = new JLabel();
			jLabel55.setBorder(new LineBorder(Color.white, 1, false));
			jLabel55.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel55MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel55MouseMouseExited(event);
				}
			});
		}
		return jLabel55;
	}

	private JLabel getJLabel54() {
		if (jLabel54 == null) {
			jLabel54 = new JLabel();
			jLabel54.setBorder(new LineBorder(Color.white, 1, false));
			jLabel54.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel54MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel54MouseMouseExited(event);
				}
			});
		}
		return jLabel54;
	}

	private JLabel getJLabel53() {
		if (jLabel53 == null) {
			jLabel53 = new JLabel();
			jLabel53.setBorder(new LineBorder(Color.white, 1, false));
			jLabel53.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel53MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel53MouseMouseExited(event);
				}
			});
		}
		return jLabel53;
	}

	private JLabel getJLabel52() {
		if (jLabel52 == null) {
			jLabel52 = new JLabel();
			jLabel52.setBorder(new LineBorder(Color.white, 1, false));
			jLabel52.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel52MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel52MouseMouseExited(event);
				}
			});
		}
		return jLabel52;
	}

	private JLabel getJLabel51() {
		if (jLabel51 == null) {
			jLabel51 = new JLabel();
			jLabel51.setBorder(new LineBorder(Color.white, 1, false));
			jLabel51.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel51MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel51MouseMouseExited(event);
				}
			});
		}
		return jLabel51;
	}

	private JLabel getJLabel50() {
		if (jLabel50 == null) {
			jLabel50 = new JLabel();
			jLabel50.setBorder(new LineBorder(Color.white, 1, false));
			jLabel50.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel50MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel50MouseMouseExited(event);
				}
			});
		}
		return jLabel50;
	}

	private JLabel getJLabel49() {
		if (jLabel49 == null) {
			jLabel49 = new JLabel();
			jLabel49.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
			jLabel49.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel49MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel49MouseMouseExited(event);
				}
			});
		}
		return jLabel49;
	}

	private JLabel getJLabel48() {
		if (jLabel48 == null) {
			jLabel48 = new JLabel();
			jLabel48.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
			jLabel48.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel48MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel48MouseMouseExited(event);
				}
			});
		}
		return jLabel48;
	}

	private JLabel getJLabel47() {
		if (jLabel47 == null) {
			jLabel47 = new JLabel();
			jLabel47.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
			jLabel47.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel47MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel47MouseMouseExited(event);
				}
			});
		}
		return jLabel47;
	}

	private JLabel getJLabel46() {
		if (jLabel46 == null) {
			jLabel46 = new JLabel();
			jLabel46.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
			jLabel46.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel46MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel46MouseMouseExited(event);
				}
			});
		}
		return jLabel46;
	}

	private JLabel getJLabel45() {
		if (jLabel45 == null) {
			jLabel45 = new JLabel();
			jLabel45.setBorder(new LineBorder(new Color(0, 128, 0), 1, false));
			jLabel45.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel45MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel45MouseMouseExited(event);
				}
			});
		}
		return jLabel45;
	}

	private JLabel getJLabel44() {
		if (jLabel44 == null) {
			jLabel44 = new JLabel();
			jLabel44.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel44.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel44MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel44MouseMouseExited(event);
				}
			});
		}
		return jLabel44;
	}

	private JLabel getJLabel43() {
		if (jLabel43 == null) {
			jLabel43 = new JLabel();
			jLabel43.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel43.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel43MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel43MouseMouseExited(event);
				}
			});
		}
		return jLabel43;
	}

	private JLabel getJLabel42() {
		if (jLabel42 == null) {
			jLabel42 = new JLabel();
			jLabel42.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel42.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel42MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel42MouseMouseExited(event);
				}
			});
		}
		return jLabel42;
	}

	private JLabel getJLabel41() {
		if (jLabel41 == null) {
			jLabel41 = new JLabel();
			jLabel41.setBorder(new LineBorder(Color.red, 1, false));
			jLabel41.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel41MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel41MouseMouseExited(event);
				}
			});
		}
		return jLabel41;
	}

	private JLabel getJLabel40() {
		if (jLabel40 == null) {
			jLabel40 = new JLabel();
			jLabel40.setBorder(new LineBorder(Color.red, 1, false));
			jLabel40.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel40MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel40MouseMouseExited(event);
				}
			});
		}
		return jLabel40;
	}

	private JLabel getJLabel39() {
		if (jLabel39 == null) {
			jLabel39 = new JLabel();
			jLabel39.setBorder(new LineBorder(Color.red, 1, false));
			jLabel39.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel39MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel39MouseMouseExited(event);
				}
			});
		}
		return jLabel39;
	}

	private JLabel getJLabel38() {
		if (jLabel38 == null) {
			jLabel38 = new JLabel();
			jLabel38.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel38.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel38MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel38MouseMouseExited(event);
				}
			});
		}
		return jLabel38;
	}

	private JLabel getJLabel37() {
		if (jLabel37 == null) {
			jLabel37 = new JLabel();
			jLabel37.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel37.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel37MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel37MouseMouseExited(event);
				}
			});
		}
		return jLabel37;
	}

	private JLabel getJLabel36() {
		if (jLabel36 == null) {
			jLabel36 = new JLabel();
			jLabel36.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel36.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel36MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel36MouseMouseExited(event);
				}
			});
		}
		return jLabel36;
	}

	private JLabel getJLabel35() {
		if (jLabel35 == null) {
			jLabel35 = new JLabel();
			jLabel35.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel35.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel35MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel35MouseMouseExited(event);
				}
			});
		}
		return jLabel35;
	}

	private JLabel getJLabel34() {
		if (jLabel34 == null) {
			jLabel34 = new JLabel();
			jLabel34.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel34.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel34MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel34MouseMouseExited(event);
				}
			});
		}
		return jLabel34;
	}

	private JLabel getJLabel33() {
		if (jLabel33 == null) {
			jLabel33 = new JLabel();
			jLabel33.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel33.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel33MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel33MouseMouseExited(event);
				}
			});
		}
		return jLabel33;
	}

	private JLabel getJLabel32() {
		if (jLabel32 == null) {
			jLabel32 = new JLabel();
			jLabel32.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel32.addMouseListener(new MouseAdapter() {
	
				public void mouseEntered(MouseEvent event) {
					jLabel32MouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					jLabel32MouseMouseExited(event);
				}
			});
		}
		return jLabel32;
	}

	private JLabel getJLabel31() {
		if (jLabel31 == null) {
			jLabel31 = new JLabel();
			jLabel31.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel31.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel31MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel31MouseMouseEntered(event);
				}
			});
		}
		return jLabel31;
	}

	private JLabel getJLabel30() {
		if (jLabel30 == null) {
			jLabel30 = new JLabel();
			jLabel30.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel30.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel30MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel30MouseMouseEntered(event);
				}
			});
		}
		return jLabel30;
	}

	private JLabel getJLabel29() {
		if (jLabel29 == null) {
			jLabel29 = new JLabel();
			jLabel29.setBorder(new LineBorder(Color.magenta, 1, false));
			jLabel29.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel29MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel29MouseMouseEntered(event);
				}
			});
		}
		return jLabel29;
	}

	private JLabel getJLabel28() {
		if (jLabel28 == null) {
			jLabel28 = new JLabel();
			jLabel28.setBorder(new LineBorder(Color.magenta, 1, false));
			jLabel28.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel28MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel28MouseMouseEntered(event);
				}
			});
		}
		return jLabel28;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setBorder(new LineBorder(Color.green, 1, false));
			jPanel1.setLayout(new GroupLayout());
			jPanel1.add(getJLabel28(), new Constraints(new Leading(9, 19, 10, 10), new Leading(10, 21, 10, 10)));
			jPanel1.add(getJLabel29(), new Constraints(new Leading(42, 19, 10, 10), new Leading(10, 21, 26, 45)));
			jPanel1.add(getJLabel30(), new Constraints(new Leading(9, 19, 12, 12), new Leading(47, 21, 10, 10)));
			jPanel1.add(getJLabel31(), new Constraints(new Leading(42, 19, 12, 12), new Leading(47, 21, 26, 45)));
			jPanel1.add(getJLabel32(), new Constraints(new Leading(75, 19, 10, 10), new Leading(47, 21, 12, 12)));
			jPanel1.add(getJLabel33(), new Constraints(new Leading(9, 19, 12, 12), new Leading(86, 21, 12, 12)));
			jPanel1.add(getJLabel34(), new Constraints(new Leading(42, 19, 12, 12), new Leading(86, 21, 26, 45)));
			jPanel1.add(getJLabel35(), new Constraints(new Leading(73, 19, 12, 12), new Leading(86, 21, 12, 12)));
			jPanel1.add(getJLabel36(), new Constraints(new Leading(9, 19, 12, 12), new Leading(125, 21, 12, 12)));
			jPanel1.add(getJLabel37(), new Constraints(new Leading(42, 19, 12, 12), new Leading(125, 21, 26, 45)));
			jPanel1.add(getJLabel38(), new Constraints(new Leading(75, 19, 12, 12), new Leading(125, 21, 12, 12)));
			jPanel1.add(getJLabel39(), new Constraints(new Leading(9, 19, 12, 12), new Leading(164, 21, 12, 12)));
			jPanel1.add(getJLabel40(), new Constraints(new Leading(42, 19, 12, 12), new Leading(164, 21, 26, 45)));
			jPanel1.add(getJLabel41(), new Constraints(new Leading(75, 19, 12, 12), new Leading(164, 21, 12, 12)));
			jPanel1.add(getJLabel42(), new Constraints(new Leading(9, 19, 12, 12), new Leading(203, 21, 12, 12)));
			jPanel1.add(getJLabel43(), new Constraints(new Leading(42, 19, 12, 12), new Leading(203, 21, 26, 45)));
			jPanel1.add(getJLabel44(), new Constraints(new Leading(75, 19, 12, 12), new Leading(203, 21, 12, 12)));
			jPanel1.add(getJLabel45(), new Constraints(new Leading(9, 19, 12, 12), new Leading(242, 21, 12, 12)));
			jPanel1.add(getJLabel46(), new Constraints(new Leading(42, 19, 12, 12), new Leading(242, 21, 26, 45)));
			jPanel1.add(getJLabel47(), new Constraints(new Leading(75, 19, 12, 12), new Leading(242, 21, 12, 12)));
			jPanel1.add(getJLabel48(), new Constraints(new Leading(9, 19, 12, 12), new Leading(281, 21, 12, 12)));
			jPanel1.add(getJLabel49(), new Constraints(new Leading(42, 19, 12, 12), new Leading(281, 21, 26, 45)));
			jPanel1.add(getJLabel50(), new Constraints(new Leading(9, 19, 12, 12), new Leading(320, 21, 12, 12)));
			jPanel1.add(getJLabel51(), new Constraints(new Leading(42, 19, 12, 12), new Leading(320, 21, 26, 45)));
			jPanel1.add(getJLabel52(), new Constraints(new Leading(75, 19, 12, 12), new Leading(320, 21, 12, 12)));
			jPanel1.add(getJLabel53(), new Constraints(new Leading(112, 19, 12, 12), new Leading(320, 21, 12, 12)));
			jPanel1.add(getJLabel54(), new Constraints(new Leading(9, 19, 12, 12), new Leading(359, 21, 12, 12)));
			jPanel1.add(getJLabel55(), new Constraints(new Leading(42, 19, 12, 12), new Leading(359, 21, 26, 45)));
		}
		return jPanel1;
	}

	private JLabel getJLabel27() {
		if (jLabel27 == null) {
			jLabel27 = new JLabel();
			jLabel27.setBorder(new LineBorder(Color.white, 1, false));
			jLabel27.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel27MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel27MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabel26MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel26MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabel25MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel25MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabel24MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel24MouseMouseEntered(event);
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
	
				public void mouseExited(MouseEvent event) {
					jLabel23MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel23MouseMouseEntered(event);
				}
			});
		}
		return jLabel23;
	}

	private JLabel getJLabel22() {
		if (jLabel22 == null) {
			jLabel22 = new JLabel();
			jLabel22.setBorder(new LineBorder(Color.white, 1, false));
			jLabel22.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel22MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel22MouseMouseEntered(event);
				}
			});
		}
		return jLabel22;
	}

	private JLabel getJLabel21() {
		if (jLabel21 == null) {
			jLabel21 = new JLabel();
			jLabel21.setBorder(new LineBorder(new Color(128, 128, 255), 1, false));
			jLabel21.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel21MouseMouseExited(event);
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
					jLabel20MouseMouseExited(event);
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
					jLabel19MouseMouseExited(event);
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
					jLabel18MouseMouseExited(event);
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
					jLabel17MouseMouseExited(event);
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
					jLabel16MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel16MouseMouseEntered(event);
				}
			});
		}
		return jLabel16;
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel15.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel15MouseMouseExited(event);
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
			jLabel14.setBorder(new LineBorder(Color.yellow, 1, false));
			jLabel14.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel14MouseMouseExited(event);
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
					jLabel13MouseMouseExited(event);
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
					jLabel12MouseMouseExited(event);
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
			jLabel11.setBorder(new LineBorder(Color.red, 1, false));
			jLabel11.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel11MouseMouseExited(event);
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
					jLabel10MouseMouseExited(event);
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
					jLabel9MouseMouseExited(event);
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
			jLabel8.setBorder(new LineBorder(new Color(255, 128, 0), 1, false));
			jLabel8.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel8MouseMouseExited(event);
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
					jLabel7MouseMouseExited(event);
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
					jLabel6MouseMouseExited(event);
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
			jLabel5.setBorder(new LineBorder(new Color(128, 0, 255), 1, false));
			jLabel5.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel5MouseMouseExited(event);
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
					jLabel4MouseMouseExited(event);
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
					jLabel3MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel3MouseMouseEntered(event);
				}
			});
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setBorder(new LineBorder(Color.cyan, 1, false));
			jLabel2.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel2MouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					jLabel2MouseMouseEntered(event);
				}
			});
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setBorder(new LineBorder(Color.magenta, 1, false));
			jLabel1.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					jLabel1MouseMouseExited(event);
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
					jLabel0MouseMouseExited(event);
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
			jPanel0.add(getJLabel0(), new Constraints(new Leading(9, 19, 10, 10), new Leading(10, 21, 10, 10)));
			jPanel0.add(getJLabel2(), new Constraints(new Leading(9, 19, 12, 12), new Leading(47, 21, 10, 10)));
			jPanel0.add(getJLabel4(), new Constraints(new Leading(75, 19, 12, 12), new Leading(47, 21, 12, 12)));
			jPanel0.add(getJLabel1(), new Constraints(new Leading(42, 19, 10, 10), new Leading(10, 21, 12, 12)));
			jPanel0.add(getJLabel3(), new Constraints(new Leading(42, 19, 12, 12), new Leading(47, 21, 12, 12)));
			jPanel0.add(getJLabel5(), new Constraints(new Leading(9, 19, 12, 12), new Leading(86, 21, 12, 12)));
			jPanel0.add(getJLabel6(), new Constraints(new Leading(42, 19, 12, 12), new Leading(86, 21, 12, 12)));
			jPanel0.add(getJLabel7(), new Constraints(new Leading(73, 19, 12, 12), new Leading(86, 21, 12, 12)));
			jPanel0.add(getJLabel8(), new Constraints(new Leading(9, 19, 12, 12), new Leading(125, 21, 12, 12)));
			jPanel0.add(getJLabel9(), new Constraints(new Leading(42, 19, 12, 12), new Leading(125, 21, 12, 12)));
			jPanel0.add(getJLabel10(), new Constraints(new Leading(75, 19, 12, 12), new Leading(125, 21, 12, 12)));
			jPanel0.add(getJLabel11(), new Constraints(new Leading(9, 19, 12, 12), new Leading(164, 21, 12, 12)));
			jPanel0.add(getJLabel12(), new Constraints(new Leading(42, 19, 12, 12), new Leading(164, 21, 12, 12)));
			jPanel0.add(getJLabel13(), new Constraints(new Leading(75, 19, 12, 12), new Leading(164, 21, 12, 12)));
			jPanel0.add(getJLabel14(), new Constraints(new Leading(9, 19, 12, 12), new Leading(203, 21, 12, 12)));
			jPanel0.add(getJLabel15(), new Constraints(new Leading(42, 19, 12, 12), new Leading(203, 21, 12, 12)));
			jPanel0.add(getJLabel16(), new Constraints(new Leading(75, 19, 12, 12), new Leading(203, 21, 12, 12)));
			jPanel0.add(getJLabel17(), new Constraints(new Leading(9, 19, 12, 12), new Leading(242, 21, 12, 12)));
			jPanel0.add(getJLabel18(), new Constraints(new Leading(42, 19, 12, 12), new Leading(242, 21, 12, 12)));
			jPanel0.add(getJLabel19(), new Constraints(new Leading(75, 19, 12, 12), new Leading(242, 21, 12, 12)));
			jPanel0.add(getJLabel20(), new Constraints(new Leading(9, 19, 12, 12), new Leading(281, 21, 12, 12)));
			jPanel0.add(getJLabel21(), new Constraints(new Leading(42, 19, 12, 12), new Leading(281, 21, 12, 12)));
			jPanel0.add(getJLabel22(), new Constraints(new Leading(9, 19, 12, 12), new Leading(320, 21, 12, 12)));
			jPanel0.add(getJLabel23(), new Constraints(new Leading(42, 19, 12, 12), new Leading(320, 21, 12, 12)));
			jPanel0.add(getJLabel24(), new Constraints(new Leading(75, 19, 12, 12), new Leading(320, 21, 12, 12)));
			jPanel0.add(getJLabel25(), new Constraints(new Leading(110, 19, 10, 10), new Leading(320, 21, 12, 12)));
			jPanel0.add(getJLabel26(), new Constraints(new Leading(9, 19, 12, 12), new Leading(359, 21, 12, 12)));
			jPanel0.add(getJLabel27(), new Constraints(new Leading(42, 19, 12, 12), new Trailing(12, 21, 334, 353)));
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
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/1A.png"));
	}

	private void jLabel0MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel1MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/3A.png"));
	}

	private void jLabel1MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel2MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/6A.png"));
	}

	private void jLabel2MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel3MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/8A.png"));
	}

	private void jLabel3MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel4MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/9A.png"));
	}

	private void jLabel4MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel5MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/11A.png"));
	}

	private void jLabel5MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel6MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/13A.png"));
	}

	private void jLabel6MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel7MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/14A.png"));
	}

	private void jLabel7MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel8MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/16A.png"));
	}

	private void jLabel8MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel9MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/18A.png"));
	}

	private void jLabel9MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel10MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/19A.png"));
	}

	private void jLabel10MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel11MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/21A.png"));
	}

	private void jLabel11MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel12MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/23A.png"));
	}

	private void jLabel12MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel13MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/24A.png"));
	}

	private void jLabel13MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel14MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/26A.png"));
	}

	private void jLabel14MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel15MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/27A.png"));
	}

	private void jLabel15MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel16MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/29A.png"));
	}

	private void jLabel16MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel17MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/31A.png"));
	}

	private void jLabel17MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel18MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/32A.png"));
	}

	private void jLabel18MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel19MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/34A.png"));
	}

	private void jLabel19MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel20MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/37A.png"));
	}

	private void jLabel20MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel21MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/39A.png"));
	}

	private void jLabel21MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel22MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/5A.png"));
	}

	private void jLabel22MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel23MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/15A.png"));
	}

	private void jLabel23MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel24MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/25A.png"));
	}

	private void jLabel24MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel25MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/35A.png"));
	}

	private void jLabel25MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel26MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/12A.png"));
	}

	private void jLabel26MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel27MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/28A.png"));
	}

	private void jLabel27MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

	private void jLabel28MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/1A.png"));
	}
	
	private void jLabel28MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel29MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/3A.png"));
	}
	
	private void jLabel29MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel30MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/6A.png"));
	}
	
	private void jLabel30MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel31MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/8A.png"));
	}
	
	private void jLabel31MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel32MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/9A.png"));
	}
	
	private void jLabel32MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel33MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/11A.png"));
	}
	
	private void jLabel33MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel34MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/13A.png"));
	}
	
	private void jLabel34MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel35MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/14A.png"));
	}
	
	private void jLabel35MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel36MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/16A.png"));
	}
	
	private void jLabel36MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel37MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/18A.png"));
	}
	
	private void jLabel37MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel38MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/19A.png"));
	}
	
	private void jLabel38MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel39MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/21A.png"));
	}
	
	private void jLabel39MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel40MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/23A.png"));
	}
	
	private void jLabel40MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel41MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/24A.png"));
	}
	
	private void jLabel41MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel42MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/26A.png"));
	}
	
	private void jLabel42MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel43MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/27A.png"));
	}
	
	private void jLabel43MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel44MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/29A.png"));
	}
	
	private void jLabel44MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel45MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/31A.png"));
	}
	
	private void jLabel45MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel46MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/32A.png"));
	}
	
	private void jLabel46MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel47MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/34A.png"));
	}
	
	private void jLabel47MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel48MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/37A.png"));
	}
	
	private void jLabel48MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel49MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/39A.png"));
	}
	
	private void jLabel49MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel50MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/5A.png"));
	}
	
	private void jLabel50MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel51MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/15A.png"));
	}
	
	private void jLabel51MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel52MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/25A.png"));
	}
	
	private void jLabel52MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel53MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/35A.png"));
	}
	
	private void jLabel53MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel54MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/12A.png"));
	}
	
	private void jLabel54MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}
	
	private void jLabel55MouseMouseEntered(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("PROPIEDADES/28A.png"));
	}
	
	private void jLabel55MouseMouseExited(MouseEvent event) {
		jLabelPropiedad.setIcon(new ImageIcon("vacio"));
	}

}
