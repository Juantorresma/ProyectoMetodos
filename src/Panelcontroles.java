import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Panelcontroles extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	public Proyecto frame;
	public JRadioButton Escenario_1,
	Escenario_2,
	Escenario_3;
	private JLabel Esc1,Esc2,Esc3,X,Y,Res;
	private JTextField x,y,res;
	private JButton Calcular;

	public Panelcontroles(Proyecto frame) {
		this.frame=frame;
		this.setPreferredSize(new Dimension(250,600));
		this.Escenario_1 = new JRadioButton("Escenario 1");
		this.Escenario_2 = new JRadioButton("Escenario 2");
		this.Escenario_3 = new JRadioButton("Escenario 3");
		ButtonGroup bg = new ButtonGroup();
		bg.add(Escenario_1);
		bg.add(Escenario_2);
		bg.add(Escenario_3);
		Escenario_1.setSelected(true);
		this.add(this.Escenario_1);
		this.Esc1= new JLabel("<html>X=Capacidad <br> Restricciones: La base sera cuadrada<br>Resultado=medidas(ancho,largo,alto)</html>");
		this.add(Esc1);
		this.add(this.Escenario_2);
		this.Esc2= new JLabel("<html>X=Largo <br>Y=Ancho<br> Resultado=Lado cuadrado para max Volumen</html>");
		this.add(Esc2);
		this.add(this.Escenario_3);
		this.Esc3= new JLabel("<html>X=Radio Cilindro <br>Y=Lado cubo<br> Resultado=Profundidad desde cara superior<br></html>");
		this.add(Esc3);
		this.X=new JLabel("Valor de X");
		this.add(X);
		this.x= new JTextField(28);
		this.add(x);
		this.Y=new JLabel("Valor de Y");
		this.add(Y);
		this.y= new JTextField(28);
		y.setEditable(false);
		this.add(y);
		Escenario_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				y.setText("");
				y.setEditable(false);
				frame.repaint();

			}
		});
		Escenario_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				y.setEditable(true);
				frame.repaint();

			}
		});
		Escenario_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				y.setEditable(true);
				frame.repaint();

			}
		});
		this.Calcular= new JButton("Calcular");
		Calcular.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(Escenario_1.isSelected()) {
					double y =1;
					double valorx= Double.valueOf(x.getText());
					for (int i=0; i<1000;i++) {
						y=y-((3*Math.pow(y, 5)-2*y*valorx-4*valorx))/(15*Math.pow(y, 4)-2*valorx);
					}
					double z = valorx/Math.pow(y, 3);
					double x= Math.pow(y, 2);
					//System.out.println(x+"   "+y+"    "+z);
					double resultadox=Math.cbrt(2*valorx);
					double resultadoy=valorx/(resultadox*resultadox);
					res.setText("("+String.valueOf(x)+", "+String.valueOf(y) +", "+ String.valueOf(z)+")");
					//System.out.println("("+String.valueOf(resultadox)+", "+String.valueOf(resultadox) +", "+ String.valueOf(resultadoy)+")");
				}
				else if(Escenario_2.isSelected()) {
					double valorx= Double.valueOf(x.getText());
					double valory= Double.valueOf(y.getText());
					double resultadoa= Math.abs((-4*(valorx+valory)+Math.sqrt((4*valorx+4*valory)*(4*valorx+4*valory)-48*valorx*valory))/24);
					double resultadob= Math.abs((-4*(valorx+valory)-Math.sqrt((4*valorx+4*valory)*(4*valorx+4*valory)-48*valorx*valory))/24);
					res.setText("X1= "+String.valueOf(resultadoa)+", X2= "+resultadob);
					System.out.println("X1= "+String.valueOf(resultadoa)+", X2= "+resultadob);
				}else {
					double valorx= Double.valueOf(x.getText());
					double valory= Double.valueOf(y.getText());
					res.setText("3");
				}
			}

		});
		this.add(Calcular);
		JLabel espacio = new JLabel("                                                                                 ");
		this.add(espacio);
		this.Res=new JLabel("Resultado");
		this.add(Res);
		this.res= new JTextField(28);
		this.add(res);
		res.setEditable(false);


	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}







}
