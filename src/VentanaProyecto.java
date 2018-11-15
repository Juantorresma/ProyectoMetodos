

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VentanaProyecto extends JPanel  {
	private static final long serialVersionUID = 1L;
	Proyecto proyecto;
	private Image 	fondo1,
					fondo2,
					fondo3;
	
	public VentanaProyecto(Proyecto proyecto) {
		super();
		this.setPreferredSize(new Dimension(1028,768));
		 this.proyecto=proyecto;
		 this.fondo1 = new ImageIcon("Imagen1.png").getImage();
		 this.fondo2 = new ImageIcon("imagen2.png").getImage();
		 this.fondo3 = new ImageIcon("imagen3.png").getImage();
	}

	public void paintComponent(Graphics g) {
		if(proyecto.panelControles.Escenario_1.isSelected()) {
			g.drawImage(this.fondo1,0,0,this.getWidth(),this.getHeight(),this);
		}
		if(proyecto.panelControles.Escenario_2.isSelected()) {
			g.drawImage(this.fondo2,0,0,this.getWidth(),this.getHeight(),this);
		}
		if(proyecto.panelControles.Escenario_3.isSelected()) {
			g.drawImage(this.fondo3,0,0,this.getWidth(),this.getHeight(),this);
		}
	}

}

