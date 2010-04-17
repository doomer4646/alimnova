import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;


// TODO: Auto-generated Javadoc
//VS4E -- DO NOT REMOVE THIS LINE!
/**
 * The Class Principal.
 */
public class Principal extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The j button0. */
	private JButton jButton0;
	
	/** The j button1. */
	private JButton jButton1;
	
	/** The j panel0. */
	private JPanel jPanel0;

	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";

	/**
	 * Instantiates a new principal.
	 */
	public Principal() {
		initComponents();
	}

	/**
	 * Inits the components.
	 */
	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Bilateral(0, 0, 0), new Bilateral(0, 0, 0)));
		setSize(486, 486);
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new Fondo("Iconos/ImagenTablero.jpg");
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJButton1(), new Constraints(new Leading(306, 10, 10), new Leading(402, 10, 10)));
			jPanel0.add(getJButton0(), new Constraints(new Leading(42, 10, 10), new Leading(402, 12, 12)));
		}
		return jPanel0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
			jButton1.setText("Unirse a Partida");
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
			jButton0.setText("Crear Partida");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					jButton0MouseMouseClicked(event);
				}
			});
		}
		return jButton0;
	}

	/**
	 * Install ln f.
	 */
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
		CreaPartida frame = new CreaPartida();
		frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
		 frame.setTitle("CreaPartida");
		 frame.getContentPane().setPreferredSize(frame.getSize());
		 frame.pack();
		 frame.setLocationRelativeTo(null);
		 frame.setVisible(true);
	}

	private void jButton1MouseMouseClicked(MouseEvent event) {
		this.setVisible(false);
		Tablero_Principal frame = new Tablero_Principal();
		frame.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
		frame.setTitle("T-Monopoly");
		frame.getContentPane().setPreferredSize(frame.getSize());
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	

}
