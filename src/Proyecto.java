import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Proyecto extends JFrame{

	public static final int  ANCHO = 1800;
	public static final int  ALTO = 900;
	VentanaProyecto ventanaProyecto;
	Panelcontroles panelControles;
	
	private static final long serialVersionUID = 1L;

	public Proyecto() {
		
		super ("Proyecto");
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		this.setLocation(100, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaProyecto=new VentanaProyecto(this);
		this.add(ventanaProyecto);
		panelControles = new Panelcontroles(this);
		this.add(panelControles,BorderLayout.WEST); 
		this.pack();
		this.setSize(ANCHO, ALTO);
		this.setVisible(true);	
	}
	public static void main(String[] args) {
		Proyecto proyecto =new Proyecto();
		double x =Math.pow(2*2048, 1);
		System.out.println(x);
	}

}
