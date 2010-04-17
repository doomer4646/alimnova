import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


//VS4E -- DO NOT REMOVE THIS LINE!
public class Tablero_Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel0;
	private JPanel jPanel1;
	private JPanel casilla33;
	private JPanel casilla35;
	private JPanel casilla34;
	private JPanel casilla36;
	private JPanel casilla37;
	private JPanel casilla38;
	private JPanel casilla39;
	private JPanel casilla40;
	private JPanel casilla32;
	private JPanel casilla20;
	private JPanel casilla22;
	private JPanel casilla23;
	private JPanel casilla24;
	private JPanel casilla25;
	private JPanel casilla26;
	private JPanel casilla27;
	private JPanel casilla28;
	private JPanel casilla29;
	private JPanel casilla30;
	private JPanel casilla3;
	private JPanel casilla4;
	private JPanel casilla5;
	private JPanel casilla6;
	private JPanel casilla7;
	private JPanel casilla8;
	private JPanel casilla9;
	private JPanel casilla10;
	private JPanel casilla19;
	private JPanel casilla18;
	private JPanel casilla17;
	private JPanel casilla16;
	private JPanel casilla15;
	private JPanel casilla14;
	private JPanel casilla13;
	private JPanel casilla12;
	private JPanel casilla31;
	private JPanel casilla21;
	private JPanel casilla1;
	private JPanel casilla11;
	private JPanel info;
	private JTabbedPane jTabbedPane0;
	private JPanel infoJugadores;
	private JTable jTable0;
	private JScrollPane jScrollPane0;
	private JPanel jPanel44;
	//private JPanel pestañaJ6;
	private JPanel jPanel48;
	private JPanel jPanel49;
	private JPanel jPanel50;
	private JPanel pestanaJ2;
	private JPanel pestanaJ1;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JPanel pestanaJ3;
	private JTextField jTextField3;
	private JPanel pestanaJ4;
	private JTextField jTextField4;
	private JPanel pestanaJ5;
	private JPanel jPanel54;
	private JTextField jTextField6;
	private JPanel jPanel55;
	private JTabbedPane jTabbedPane1;
	private JPanel casilla2;
	private JLabel jLabelCerveza;
	private JButton botonCerveza;
	private JLabel jLabelWhisky;
	private JButton botonWhisky;
	private JButton botonHipoteca;
	private JLabel jLabelHipoteca;
	private JButton botonNegociarP1;
	private JButton botonDesHipotecar;
	private JLabel jLabelDesHipotecar;
	private JLabel jLabelNegociar;
	private JButton Exit;
	private JButton botonNegociarP2;
	private JButton botonNegociarP3;
	private JButton botonNegociarP4;
	private JButton botonNegociarP5;
	//private JButton jButton0;
	public Tablero_Principal() {
		initComponents();
	}

	private void initComponents() {
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setForeground(Color.black);
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(0, 714, 10, 10), new Leading(0, 714, 10, 10)));
		add(getInfo(), new Constraints(new Trailing(0, 285, 683, 726), new Leading(0, 601, 10, 10)));
		add(getbotonCerveza(), new Constraints(new Leading(0, 93, 12, 12), new Leading(723, 67, 12, 12)));
		add(getBotonWhisky(), new Constraints(new Leading(105, 101, 12, 12), new Leading(726, 64, 12, 12)));
		add(getBotonHipoteca(), new Constraints(new Leading(218, 101, 12, 12), new Leading(725, 64, 12, 12)));
		add(getBotonDesHipotecar(), new Constraints(new Leading(331, 101, 12, 12), new Leading(725, 64, 12, 12)));
		add(getJLabelDesHipotecar(), new Constraints(new Leading(406, 91, 10, 10), new Leading(740, 12, 12)));
		add(getJLabelHipoteca(), new Constraints(new Leading(298, 59, 10, 10), new Leading(740, 12, 12)));
		add(getJLabelWhisky(), new Constraints(new Leading(186, 10, 10), new Leading(740, 12, 12)));
		add(getJLabelCerveza(), new Constraints(new Leading(62, 10, 10), new Leading(740, 12, 12)));
		add(getJButtonExit(), new Constraints(new Leading(612, 87, 10, 10), new Leading(738, 40, 10, 10)));
		setSize(1000, 800);
	}

	private JButton getJBotonNegociarP5() {
		if (botonNegociarP5 == null) {
			botonNegociarP5 = new JButton();
			botonNegociarP5.setText(" ");
			botonNegociarP5.setIcon(new ImageIcon("Iconos/hand.png"));
			botonNegociarP5.setBorderPainted(false);
			botonNegociarP5.setIconTextGap(0);
			botonNegociarP5.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonNegociarP5MouseMouseClicked(event);
				}
			});
		}
		return botonNegociarP5;
	}

	private JButton getJBotonNegociarP4() {
		if (botonNegociarP4 == null) {
			botonNegociarP4 = new JButton();
			botonNegociarP4.setText(" ");
			botonNegociarP4.setIcon(new ImageIcon("Iconos/hand.png"));
			botonNegociarP4.setBorderPainted(false);
			botonNegociarP4.setIconTextGap(0);
			botonNegociarP4.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonNegociarP4MouseMouseClicked(event);
				}
			});
		}
		return botonNegociarP4;
	}

	private JButton getBotonNegociarP3() {
		if (botonNegociarP3 == null) {
			botonNegociarP3 = new JButton();
			botonNegociarP3.setText(" ");
			botonNegociarP3.setIcon(new ImageIcon("Iconos/hand.png"));
			botonNegociarP3.setBorderPainted(false);
			botonNegociarP3.setIconTextGap(0);
			botonNegociarP3.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonNegociarP3MouseMouseClicked(event);
				}
			});
		}
		return botonNegociarP3;
	}

	private JButton getBotonNegociarP2() {
		if (botonNegociarP2 == null) {
			botonNegociarP2 = new JButton();
			botonNegociarP2.setText(" ");
			botonNegociarP2.setIcon(new ImageIcon("Iconos/hand.png"));
			botonNegociarP2.setBorderPainted(false);
			botonNegociarP2.setIconTextGap(0);
			botonNegociarP2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonNegociarP2MouseMouseClicked(event);
				}
			});
		}
		return botonNegociarP2;
	}

	private JButton getJButtonExit() {
		if (Exit == null) {
			Exit = new JButton();
			Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			Exit.setText("Salir");
			Exit.setBorder(BorderFactory.createCompoundBorder(null, null));
			Exit.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					ExitMouseMouseClicked(event);
				}
			});
		}
		return Exit;
	}

	private JLabel getJLabelNegociar() {
		if (jLabelNegociar == null) {
			jLabelNegociar = new JLabel();
			jLabelNegociar.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabelNegociar.setText("Negociar");
		}
		return jLabelNegociar;
	}

	private JLabel getJLabelDesHipotecar() {
		if (jLabelDesHipotecar == null) {
			jLabelDesHipotecar = new JLabel();
			jLabelDesHipotecar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
			jLabelDesHipotecar.setText("DesHipotecar");
		}
		return jLabelDesHipotecar;
	}

	private JButton getBotonDesHipotecar() {
		if (botonDesHipotecar == null) {
			botonDesHipotecar = new JButton();
			botonDesHipotecar.setText(" ");
			botonDesHipotecar.setIcon(new ImageIcon("Iconos/DesHipoteca.png"));
			botonDesHipotecar.setBorderPainted(false);
			botonDesHipotecar.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonDesHipotecarMouseMouseClicked(event);
				}
			});
		}
		return botonDesHipotecar;
	}

	private JButton getBotonNegociarP1() {
		if (botonNegociarP1 == null) {
			botonNegociarP1 = new JButton();
			botonNegociarP1.setText(" ");
			botonNegociarP1.setIcon(new ImageIcon("Iconos/hand.png"));
			botonNegociarP1.setBorderPainted(false);
			botonNegociarP1.setIconTextGap(0);
			botonNegociarP1.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonNegociarMouseMouseClicked(event);
				}
			});
		}
		return botonNegociarP1;
	}

	private JLabel getJLabelHipoteca() {
		if (jLabelHipoteca == null) {
			jLabelHipoteca = new JLabel();
			jLabelHipoteca.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabelHipoteca.setText("Hipoteca");
		}
		return jLabelHipoteca;
	}

	private JButton getBotonHipoteca() {
		if (botonHipoteca == null) {
			botonHipoteca = new JButton();
			botonHipoteca.setText(" ");
			botonHipoteca.setIcon(new ImageIcon("Iconos/hipoteca.png"));
			botonHipoteca.setBorderPainted(false);
			botonHipoteca.addMouseListener(new MouseAdapter() {
	
				public void mouseExited(MouseEvent event) {
					botonHipotecaMouseMouseExited(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					botonHipotecaMouseMouseEntered(event);
				}
	
				public void mouseClicked(MouseEvent event) {
					botonHipotecaMouseMouseClicked(event);
				}
			});
		}
		return botonHipoteca;
	}

	private JButton getBotonWhisky() {
		if (botonWhisky == null) {
			botonWhisky = new JButton();
			botonWhisky.setText(" ");
			botonWhisky.setIcon(new ImageIcon("Iconos/whiskey.png"));
			botonWhisky.setBorderPainted(false);
			botonWhisky.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonWhiskyMouseMouseClicked(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					botonWhiskyMouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					botonWhiskyMouseMouseExited(event);
				}
			});
		}
		return botonWhisky;
	}

	private JLabel getJLabelWhisky() {
		if (jLabelWhisky == null) {
			jLabelWhisky = new JLabel();
			jLabelWhisky.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabelWhisky.setText("Whisky");
		}
		return jLabelWhisky;
	}

	private JButton getbotonCerveza() {
		if (botonCerveza == null) {
			botonCerveza = new JButton();
			botonCerveza.setText(" ");
			botonCerveza.setIcon(new ImageIcon("Iconos/beer.png"));
			botonCerveza.setBorderPainted(false);
			botonCerveza.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					botonCervezaMouseMouseClicked(event);
				}
	
				public void mouseEntered(MouseEvent event) {
					botonCervezaMouseMouseEntered(event);
				}
	
				public void mouseExited(MouseEvent event) {
					botonCervezaMouseMouseExited(event);
				}
			});
		}
		return botonCerveza;
	}

	private JLabel getJLabelCerveza() {
		if (jLabelCerveza == null) {
			jLabelCerveza = new JLabel();
			jLabelCerveza.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jLabelCerveza.setText("Cerveza");
		}
		return jLabelCerveza;
	}

	private JPanel getCasilla2() {
		if (casilla2 == null) {
			casilla2 = new Fondo("PROPIEDADES/2.png");
			casilla2.setBorder(new LineBorder(Color.green, 1, false));
			casilla2.setLayout(new GroupLayout());
			casilla2.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					casilla2MouseMouseClicked(event);
				}
			});
		}
		return casilla2;
	}

	private JPanel getInfo() {
		if (info == null) {
			info = new JPanel();
			info.setBorder(new LineBorder(Color.green, 1, false));
			info.setLayout(new GroupLayout());
			info.add(getPanelInfoJu(), new Constraints(new Leading(6, 271, 10, 10), new Leading(4, 296, 12, 12)));
			info.add(getJPanel44(), new Constraints(new Leading(6, 271, 12, 12), new Leading(302, 293, 10, 10)));
		}
		return info;
	}

	private JTabbedPane getJTabbedPane1() {
		if (jTabbedPane1 == null) {
			jTabbedPane1 = new JTabbedPane();
			jTabbedPane1.addTab("HISTORIAL", getJPanel54());
			jTabbedPane1.addTab("Banco", getJPanel55());
		}
		return jTabbedPane1;
	}

	private JPanel getJPanel55() {
		if (jPanel55 == null) {
			jPanel55 = new JPanel();
			jPanel55.setLayout(new GroupLayout());
			jPanel55.add(getJTextField6(), new Constraints(new Leading(74, 94, 10, 10), new Leading(113, 10, 10)));
		}
		return jPanel55;
	}

	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
			jTextField6.setText("Banco");
		}
		return jTextField6;
	}

	private JPanel getJPanel54() {
		if (jPanel54 == null) {
			jPanel54 = new JPanel();
			jPanel54.setVisible(false);
			jPanel54.setLayout(new GroupLayout());
			jPanel54.add(getJScrollPane0(), new Constraints(new Leading(2, 249, 10, 10), new Leading(5, 246, 10, 10)));
		}
		return jPanel54;
	}

	private JPanel getPestanaJ5() {
		if (pestanaJ5 == null) {
			pestanaJ5 = new JPanel();
			pestanaJ5.setLayout(new GroupLayout());
			pestanaJ5.add(getJBotonNegociarP5(), new Constraints(new Leading(177, 105, 10, 10), new Trailing(0, 63, 12, 12)));
			pestanaJ5.add(getJTextField4(), new Constraints(new Leading(12, 94, 12, 12), new Leading(12, 12, 12)));
		}
		return pestanaJ5;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setText("Player5");
		}
		return jTextField4;
	}

	private JPanel getPestanaJ4() {
		if (pestanaJ4 == null) {
			pestanaJ4 = new JPanel();
			pestanaJ4.setVisible(false);
			pestanaJ4.setLayout(new GroupLayout());
			pestanaJ4.add(getJBotonNegociarP4(), new Constraints(new Leading(176, 105, 10, 10), new Trailing(0, 63, 12, 12)));
			pestanaJ4.add(getJTextField3(), new Constraints(new Leading(12, 94, 12, 12), new Leading(12, 12, 12)));
		}
		return pestanaJ4;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setText("Player4");
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("Player3");
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("Player1");
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("Player2");
		}
		return jTextField0;
	}

	private JPanel getPestanaJ1() {
		if (pestanaJ1 == null) {
			pestanaJ1 = new JPanel();
			pestanaJ1.setVisible(false);
			pestanaJ1.setLayout(new GroupLayout());
			pestanaJ1.add(getBotonNegociarP1(), new Constraints(new Leading(176, 105, 10, 10), new Trailing(0, 63, 174, 176)));
			pestanaJ1.add(getJLabelNegociar(), new Constraints(new Leading(202, 53, 12, 12), new Leading(158, 20, 10, 10)));
			pestanaJ1.add(getJTextField1(), new Constraints(new Leading(12, 94, 12, 12), new Leading(12, 12, 12)));
		}
		return pestanaJ1;
	}

	private JPanel getPestanaJ2() {
		if (pestanaJ2 == null) {
			pestanaJ2 = new JPanel();
			pestanaJ2.setVisible(false);
			pestanaJ2.setLayout(new GroupLayout());
			pestanaJ2.add(getBotonNegociarP2(), new Constraints(new Leading(175, 105, 10, 10), new Trailing(0, 63, 12, 12)));
			pestanaJ2.add(getJTextField0(), new Constraints(new Leading(12, 94, 12, 12), new Leading(12, 12, 12)));
		}
		return pestanaJ2;
	}

	private JPanel getJPanel50() {
		if (jPanel50 == null) {
			jPanel50 = new JPanel();
			jPanel50.setLayout(new GroupLayout());
		}
		return jPanel50;
	}

	private JPanel getJPanel49() {
		if (jPanel49 == null) {
			jPanel49 = new JPanel();
			jPanel49.setVisible(false);
			jPanel49.setLayout(new GroupLayout());
		}
		return jPanel49;
	}

	private JPanel getJPanel48() {
		if (jPanel48 == null) {
			jPanel48 = new JPanel();
			jPanel48.setVisible(false);
			jPanel48.setLayout(new GroupLayout());
		}
		return jPanel48;
	}

	private JPanel getPestanaJ3() {
		if (pestanaJ3 == null) {
			pestanaJ3 = new JPanel();
			pestanaJ3.setVisible(false);
			pestanaJ3.setLayout(new GroupLayout());
			pestanaJ3.add(getBotonNegociarP3(), new Constraints(new Leading(176, 105, 10, 10), new Trailing(0, 63, 12, 12)));
			pestanaJ3.add(getJTextField2(), new Constraints(new Leading(12, 94, 12, 12), new Leading(12, 12, 12)));
		}
		return pestanaJ3;
	}

	private JPanel getJPanel44() {
		if (jPanel44 == null) {
			jPanel44 = new JPanel();
			jPanel44.setBorder(new LineBorder(Color.green, 1, false));
			jPanel44.setLayout(new GroupLayout());
			jPanel44.add(getJTabbedPane1(), new Constraints(new Leading(5, 259, 10, 10), new Leading(3, 283, 10, 10)));
		}
		return jPanel44;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTable0());
		}
		return jScrollPane0;
	}

	private JTable getJTable0() {
		if (jTable0 == null) {
			jTable0 = new JTable();
			jTable0.setModel(new DefaultTableModel(new Object[][] { { "0x0", "0x1", }, { "1x0", "1x1", }, }, new String[] { "Title 0", "Title 1", }) {
				private static final long serialVersionUID = 1L;
				Class<?>[] types = new Class<?>[] { Object.class, Object.class, };
	
				public Class<?> getColumnClass(int columnIndex) {
					return types[columnIndex];
				}
			});
		}
		return jTable0;
	}

	private JPanel getPanelInfoJu() {
		if (infoJugadores == null) {
			infoJugadores = new JPanel();
			infoJugadores.setBorder(new LineBorder(Color.green, 1, false));
			infoJugadores.setLayout(new GroupLayout());
			infoJugadores.add(getJTabbedPane0(), new Constraints(new Leading(4, 261, 10, 10), new Leading(5, 286, 10, 10)));
		}
		return infoJugadores;
	}

	private JTabbedPane getJTabbedPane0() {
		if (jTabbedPane0 == null) {
			jTabbedPane0 = new JTabbedPane();
			jTabbedPane0.addTab("Player1", getPestanaJ1());
			jTabbedPane0.addTab("Player2", getPestanaJ2());
			jTabbedPane0.addTab("Player3", getPestanaJ3());
			jTabbedPane0.addTab("Player4", getPestanaJ4());
			jTabbedPane0.addTab("Player5", getPestanaJ5());
		}
		return jTabbedPane0;
	}

	private JPanel getPanelInfo() {
		if (info == null) {
			info = new JPanel();
			info.setBorder(new LineBorder(Color.green, 1, false));
			info.setLayout(new GroupLayout());
			info.add(getPanelInfoJu(), new Constraints(new Leading(6, 271, 10, 10), new Leading(4, 296, 12, 12)));
			info.add(getJPanel44(), new Constraints(new Leading(6, 271, 12, 12), new Leading(302, 293, 10, 10)));
		}
		return info;
	}

	private JPanel getCasilla11() {
		if (casilla11 == null) {
			casilla11 = new Fondo("PROPIEDADES/11.png");
			casilla11.setBorder(new LineBorder(Color.green, 1, false));
			casilla11.setLayout(new GroupLayout());
		}
		return casilla11;
	}

	private JPanel getCasilla1() {
		if (casilla1 == null) {
			casilla1 = new Fondo("PROPIEDADES/1.png");
			casilla1.setBorder(new LineBorder(Color.green, 1, false));
			casilla1.setLayout(new GroupLayout());
		}
		return casilla1;
	}

	private JPanel getCasilla21() {
		if (casilla21 == null) {
			casilla21 = new Fondo("PROPIEDADES/21.png");
			casilla21.setBorder(new LineBorder(Color.green, 1, false));
			casilla21.setLayout(new GroupLayout());
		}
		return casilla21;
	}

	private JPanel getCasilla31() {
		if (casilla31 == null) {
			casilla31 = new Fondo("PROPIEDADES/31.png");
			casilla31.setBorder(new LineBorder(Color.green, 1, false));
			casilla31.setLayout(new GroupLayout());
		}
		return casilla31;
	}

	private JPanel getCasilla12() {
		if (casilla12 == null) {
			casilla12 = new Fondo("PROPIEDADES/12.png");
			casilla12.setBorder(new LineBorder(Color.green, 1, false));
			casilla12.setLayout(new GroupLayout());
		}
		return casilla12;
	}

	private JPanel getCasilla13() {
		if (casilla13 == null) {
			casilla13 = new Fondo("PROPIEDADES/13.png");
			casilla13.setBorder(new LineBorder(Color.green, 1, false));
			casilla13.setLayout(new GroupLayout());
		}
		return casilla13;
	}

	private JPanel getCasilla14() {
		if (casilla14 == null) {
			casilla14 = new Fondo("PROPIEDADES/14.png");
			casilla14.setBorder(new LineBorder(Color.green, 1, false));
			casilla14.setLayout(new GroupLayout());
		}
		return casilla14;
	}

	private JPanel getCasilla15() {
		if (casilla15 == null) {
			casilla15 = new Fondo("PROPIEDADES/15.png");
			casilla15.setBorder(new LineBorder(Color.green, 1, false));
			casilla15.setLayout(new GroupLayout());
		}
		return casilla15;
	}

	private JPanel getCasilla16() {
		if (casilla16 == null) {
			casilla16 = new Fondo("PROPIEDADES/16.png");
			casilla16.setBorder(new LineBorder(Color.green, 1, false));
			casilla16.setLayout(new GroupLayout());
		}
		return casilla16;
	}

	private JPanel getCasilla17() {
		if (casilla17 == null) {
			casilla17 = new Fondo("PROPIEDADES/17.png");
			casilla17.setBorder(new LineBorder(Color.green, 1, false));
			casilla17.setLayout(new GroupLayout());
		}
		return casilla17;
	}

	private JPanel getCasilla18() {
		if (casilla18 == null) {
			casilla18 = new Fondo("PROPIEDADES/18.png");
			casilla18.setBorder(new LineBorder(Color.green, 1, false));
			casilla18.setLayout(new GroupLayout());
		}
		return casilla18;
	}

	private JPanel getCasilla19() {
		if (casilla19 == null) {
			casilla19 = new Fondo("PROPIEDADES/19.png");
			casilla19.setBorder(new LineBorder(Color.green, 1, false));
			casilla19.setLayout(new GroupLayout());
		}
		return casilla19;
	}

	private JPanel getCasilla10() {
		if (casilla10 == null) {
			casilla10 = new Fondo("PROPIEDADES/10.png");
			casilla10.setBorder(new LineBorder(Color.green, 1, false));
			casilla10.setLayout(new GroupLayout());
		}
		return casilla10;
	}

	private JPanel getCasilla9() {
		if (casilla9 == null) {
			casilla9 = new Fondo("PROPIEDADES/9.png");
			casilla9.setBorder(new LineBorder(Color.green, 1, false));
			casilla9.setLayout(new GroupLayout());
		}
		return casilla9;
	}

	private JPanel getCasilla8() {
		if (casilla8 == null) {
			casilla8 = new Fondo("PROPIEDADES/8.png");
			casilla8.setBorder(new LineBorder(Color.green, 1, false));
			casilla8.setLayout(new GroupLayout());
		}
		return casilla8;
	}

	private JPanel getCasilla7() {
		if (casilla7 == null) {
			casilla7 = new Fondo("PROPIEDADES/7.png");
			casilla7.setBorder(new LineBorder(Color.green, 1, false));
			casilla7.setLayout(new GroupLayout());
		}
		return casilla7;
	}

	private JPanel getCasilla6() {
		if (casilla6 == null) {
			casilla6 = new Fondo("PROPIEDADES/6.png");
			casilla6.setBorder(new LineBorder(Color.green, 1, false));
			casilla6.setLayout(new GroupLayout());
		}
		return casilla6;
	}

	private JPanel getCasilla5() {
		if (casilla5 == null) {
			casilla5 = new Fondo("PROPIEDADES/5.png");
			casilla5.setBorder(new LineBorder(Color.green, 1, false));
			casilla5.setLayout(new GroupLayout());
		}
		return casilla5;
	}

	private JPanel getCasilla4() {
		if (casilla4 == null) {
			casilla4 = new Fondo("PROPIEDADES/4.png");
			casilla4.setBorder(new LineBorder(Color.green, 1, false));
			casilla4.setLayout(new GroupLayout());
			casilla4.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					casilla4MouseMouseClicked(event);
				}
			});
		}
		return casilla4;
	}

	private JPanel getCasilla3() {
		if (casilla3 == null) {
			casilla3 = new Fondo("PROPIEDADES/3.png");
			casilla3.setBorder(new LineBorder(Color.green, 1, false));
			casilla3.setLayout(new GroupLayout());
		}
		return casilla3;
	}

	private JPanel getCasilla30() {
		if (casilla30 == null) {
			casilla30 = new Fondo("PROPIEDADES/30.png");
			casilla30.setBorder(new LineBorder(Color.green, 1, false));
			casilla30.setLayout(new GroupLayout());
		}
		return casilla30;
	}

	private JPanel getCasilla29() {
		if (casilla29 == null) {
			casilla29 = new Fondo("PROPIEDADES/29.png");
			casilla29.setBorder(new LineBorder(Color.green, 1, false));
			casilla29.setLayout(new GroupLayout());
		}
		return casilla29;
	}

	private JPanel getCasilla28() {
		if (casilla28 == null) {
			casilla28 = new Fondo("PROPIEDADES/28.png");
			casilla28.setBorder(new LineBorder(Color.green, 1, false));
			casilla28.setLayout(new GroupLayout());
		}
		return casilla28;
	}

	private JPanel getCasilla27() {
		if (casilla27 == null) {
			casilla27 = new Fondo("PROPIEDADES/27.png");
			casilla27.setBorder(new LineBorder(Color.green, 1, false));
			casilla27.setLayout(new GroupLayout());
		}
		return casilla27;
	}

	private JPanel getCasilla26() {
		if (casilla26 == null) {
			casilla26 = new Fondo("PROPIEDADES/26.png");
			casilla26.setBorder(new LineBorder(Color.green, 1, false));
			casilla26.setLayout(new GroupLayout());
		}
		return casilla26;
	}

	private JPanel getCasilla25() {
		if (casilla25 == null) {
			casilla25 = new Fondo("PROPIEDADES/25.png");
			casilla25.setBorder(new LineBorder(Color.green, 1, false));
			casilla25.setLayout(new GroupLayout());
		}
		return casilla25;
	}

	private JPanel getCasilla24() {
		if (casilla24 == null) {
			casilla24 = new Fondo("PROPIEDADES/24.png");
			casilla24.setBorder(new LineBorder(Color.green, 1, false));
			casilla24.setLayout(new GroupLayout());
		}
		return casilla24;
	}

	private JPanel getCasilla23() {
		if (casilla23 == null) {
			casilla23 = new Fondo("PROPIEDADES/23.png");
			casilla23.setBorder(new LineBorder(Color.green, 1, false));
			casilla23.setLayout(new GroupLayout());
		}
		return casilla23;
	}

	private JPanel getCasilla22() {
		if (casilla22 == null) {
			casilla22 = new Fondo("PROPIEDADES/22.png");
			casilla22.setBorder(new LineBorder(Color.green, 1, false));
			casilla22.setLayout(new GroupLayout());
		}
		return casilla22;
	}

	private JPanel getCasilla20() {
		if (casilla20 == null) {
			casilla20 = new Fondo("PROPIEDADES/20.png");
			casilla20.setBorder(new LineBorder(Color.green, 1, false));
			casilla20.setLayout(new GroupLayout());
		}
		return casilla20;
	}

	private JPanel getCasilla32() {
		if (casilla32 == null) {
			casilla32 = new Fondo("PROPIEDADES/32.png");
			casilla32.setBorder(new LineBorder(Color.green, 1, false));
			casilla32.setLayout(new GroupLayout());
		}
		return casilla32;
	}

	private JPanel getCasilla40() {
		if (casilla40 == null) {
			casilla40 = new Fondo("PROPIEDADES/40.png");
			casilla40.setBorder(new LineBorder(Color.green, 1, false));
			casilla40.setLayout(new GroupLayout());
		}
		return casilla40;
	}

	private JPanel getCasilla39() {
		if (casilla39 == null) {
			casilla39 = new Fondo("PROPIEDADES/39.png");
			casilla39.setBorder(new LineBorder(Color.green, 1, false));
			casilla39.setLayout(new GroupLayout());
		}
		return casilla39;
	}

	private JPanel getCasilla38() {
		if (casilla38 == null) {
			casilla38 = new Fondo("PROPIEDADES/38.png");
			casilla38.setBorder(new LineBorder(Color.green, 1, false));
			casilla38.setLayout(new GroupLayout());
		}
		return casilla38;
	}

	private JPanel getCasilla37() {
		if (casilla37 == null) {
			casilla37 = new Fondo("PROPIEDADES/37.png");
			casilla37.setBorder(new LineBorder(Color.green, 1, false));
			casilla37.setLayout(new GroupLayout());
		}
		return casilla37;
	}

	private JPanel getCasilla36() {
		if (casilla36 == null) {
			casilla36 = new Fondo("PROPIEDADES/36.png");
			casilla36.setBorder(new LineBorder(Color.green, 1, false));
			casilla36.setLayout(new GroupLayout());
		}
		return casilla36;
	}

	private JPanel getCasilla34() {
		if (casilla34 == null) {
			casilla34 = new Fondo("PROPIEDADES/34.png");
			casilla34.setBorder(new LineBorder(Color.green, 1, false));
			casilla34.setLayout(new GroupLayout());
		}
		return casilla34;
	}

	private JPanel getCasilla35() {
		if (casilla35 == null) {
			casilla35 = new Fondo("PROPIEDADES/35.png");
			casilla35.setBorder(new LineBorder(Color.green, 1, false));
			casilla35.setLayout(new GroupLayout());
		}
		return casilla35;
	}

	private JPanel getCasilla33() {
		if (casilla33 == null) {
			casilla33 = new Fondo("PROPIEDADES/33.png");
			casilla33.setBorder(new LineBorder(Color.green, 1, false));
			casilla33.setLayout(new GroupLayout());
		}
		return casilla33;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new Fondo("Iconos/ImagenTablero.jpg");
			jPanel1.setBorder(new LineBorder(Color.blue, 1, true));
			jPanel1.setLayout(new GroupLayout());
		}
		return jPanel1;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.black, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getCasilla40(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(545, 55, 12, 12)));
			jPanel0.add(getCasilla39(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(491, 55, 10, 10)));
			jPanel0.add(getCasilla38(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(437, 55, 10, 10)));
			jPanel0.add(getCasilla37(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(383, 55, 10, 10)));
			jPanel0.add(getCasilla36(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(329, 55, 12, 12)));
			jPanel0.add(getCasilla35(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(275, 55, 10, 10)));
			jPanel0.add(getCasilla34(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(221, 55, 10, 10)));
			jPanel0.add(getCasilla33(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(167, 55, 10, 10)));
			jPanel0.add(getCasilla32(), new Constraints(new Trailing(0, 112, 127, 646), new Leading(113, 55, 12, 12)));
			jPanel0.add(getCasilla22(), new Constraints(new Leading(113, 55, 12, 12), new Leading(0, 112, 10, 10)));
			jPanel0.add(getCasilla20(), new Constraints(new Leading(0, 112, 10, 10), new Leading(113, 55, 10, 10)));
			jPanel0.add(getCasilla23(), new Constraints(new Leading(167, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla24(), new Constraints(new Leading(221, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla25(), new Constraints(new Leading(275, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla26(), new Constraints(new Leading(329, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla27(), new Constraints(new Leading(383, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla28(), new Constraints(new Leading(437, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla30(), new Constraints(new Leading(545, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla29(), new Constraints(new Leading(491, 55, 10, 10), new Leading(0, 112, 12, 12)));
			jPanel0.add(getJPanel1(), new Constraints(new Leading(113, 486, 12, 12), new Leading(113, 486, 12, 12)));
			jPanel0.add(getCasilla3(), new Constraints(new Leading(491, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla4(), new Constraints(new Leading(437, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla5(), new Constraints(new Leading(383, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla6(), new Constraints(new Leading(329, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla7(), new Constraints(new Leading(275, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla8(), new Constraints(new Leading(221, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla9(), new Constraints(new Leading(167, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla10(), new Constraints(new Leading(113, 55, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla19(), new Constraints(new Leading(0, 112, 12, 124), new Leading(167, 55, 10, 10)));
			jPanel0.add(getCasilla18(), new Constraints(new Leading(0, 112, 12, 124), new Leading(221, 55, 12, 12)));
			jPanel0.add(getCasilla17(), new Constraints(new Leading(0, 112, 12, 124), new Leading(275, 55, 10, 10)));
			jPanel0.add(getCasilla16(), new Constraints(new Leading(0, 112, 10, 10), new Leading(329, 55, 10, 10)));
			jPanel0.add(getCasilla15(), new Constraints(new Leading(0, 112, 12, 124), new Leading(383, 55, 10, 10)));
			jPanel0.add(getCasilla14(), new Constraints(new Leading(0, 112, 12, 124), new Leading(437, 55, 10, 10)));
			jPanel0.add(getCasilla13(), new Constraints(new Leading(0, 112, 12, 124), new Leading(491, 55, 10, 10)));
			jPanel0.add(getCasilla12(), new Constraints(new Leading(0, 112, 12, 124), new Leading(545, 55, 12, 12)));
			jPanel0.add(getCasilla31(), new Constraints(new Trailing(0, 112, 557, 612), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla21(), new Constraints(new Leading(0, 112, 12, 124), new Leading(0, 112, 12, 12)));
			jPanel0.add(getCasilla1(), new Constraints(new Trailing(0, 112, 557, 612), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla11(), new Constraints(new Leading(0, 112, 10, 10), new Leading(600, 112, 12, 12)));
			jPanel0.add(getCasilla2(), new Constraints(new Leading(545, 55, 12, 124), new Leading(600, 112, 12, 12)));
		}
		return jPanel0;
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 *
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Tablero_Principal frame = new Tablero_Principal();
				frame.setDefaultCloseOperation(Tablero_Principal.EXIT_ON_CLOSE);
				frame.setTitle("T-Monopoly");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				
			
				frame.setVisible(true);
			}
		});
	}*/

	

	private void botonCervezaMouseMouseEntered(MouseEvent event) {
		jLabelCerveza.setVisible(true);
	}

	private void botonCervezaMouseMouseExited(MouseEvent event) {
		jLabelCerveza.setVisible(false);
	}

	private void botonWhiskyMouseMouseEntered(MouseEvent event) {
		jLabelWhisky.setVisible(true);
	}

	private void botonWhiskyMouseMouseExited(MouseEvent event) {
		jLabelWhisky.setVisible(false);
	}

	private void botonHipotecaMouseMouseEntered(MouseEvent event) {
		jLabelHipoteca.setVisible(true);
	}

	private void botonHipotecaMouseMouseExited(MouseEvent event) {
		jLabelHipoteca.setVisible(false);
	}

	private void botonHipotecaMouseMouseClicked(MouseEvent event) {
		Hipoteca h = new Hipoteca();
		h.setTitle("Hipotecar");
		h.getContentPane().setPreferredSize(h.getSize());
		h.pack();
		h.setLocationRelativeTo(null);
		h.setVisible(true);
	}

	private void botonWhiskyMouseMouseClicked(MouseEvent event) {
		Wiskey frame = new Wiskey();
		frame.setTitle("Wiskey");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void botonDesHipotecarMouseMouseClicked(MouseEvent event) {
		
		DesHipoteca frame = new DesHipoteca();
		frame.setTitle("DesHipotecar");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	private void botonCervezaMouseMouseClicked(MouseEvent event) {
		Cerveza frame = new Cerveza();
		frame.setTitle("Cerveza");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void botonNegociarMouseMouseClicked(MouseEvent event) {
		Negocear frame = new Negocear();
		frame.setTitle("Negociar");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void ExitMouseMouseClicked(MouseEvent event) {
		if(0==JOptionPane.showConfirmDialog(this, "Esta seguro que desea salir del juego?"))
			System.exit(0);
			
	}

	private void botonNegociarP2MouseMouseClicked(MouseEvent event) {
		Negocear frame = new Negocear();
		frame.setTitle("Negociar");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void botonNegociarP3MouseMouseClicked(MouseEvent event) {
		Negocear frame = new Negocear();
		frame.setTitle("Negociar");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void botonNegociarP4MouseMouseClicked(MouseEvent event) {
		Negocear frame = new Negocear();
		frame.setTitle("Negociar");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void botonNegociarP5MouseMouseClicked(MouseEvent event) {
		Negocear frame = new Negocear();
		frame.setTitle("Negociar");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void casilla2MouseMouseClicked(MouseEvent event) {
		OpcionCasilla frame = new OpcionCasilla("PROPIEDADES/1A.PNG");
		frame.setTitle("OpcionCasilla");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void casilla4MouseMouseClicked(MouseEvent event) {
		OpcionCasilla frame = new OpcionCasilla("PROPIEDADES/3A.PNG");
		frame.setTitle("OpcionCasilla");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	
	
}
