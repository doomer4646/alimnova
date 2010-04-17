import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Fondo extends JPanel{
	
	private ImageIcon imgfondo;
	
	public Fondo(){
		preInit("PROPIEDADES/prueba.png");
	}
	
	
	public ImageIcon getImgfondo() {
		return imgfondo;
	}


	public void setImgfondo(String fileName) {
		this.imgfondo = new ImageIcon(fileName);
	}


	public Fondo(String FileName){
		preInit(FileName);
		
	}
	
	private void preInit(String FileName){
		imgfondo=new ImageIcon(FileName);
		
	}
	
	protected void paintComponent(Graphics g){
		g.drawImage(imgfondo.getImage(), 0, 0, null);
	}

}
