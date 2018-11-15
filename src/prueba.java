
public class prueba {

	public static void main(String[] args) {
		double valorx= 1.5;
		double valory= 0.75;
		double resultadoa= (-4*(valorx+valory)+Math.sqrt((4*valorx+4*valory)*(4*valorx+4*valory)-48*valorx*valory))/24;
		double resultadob= (-4*(valorx+valory)-Math.sqrt((4*valorx+4*valory)*(4*valorx+4*valory)-48*valorx*valory))/24;
		double resultado=0;
		if (resultadoa>0) {
			resultado=resultadoa;
		}else {
			resultado=resultadob;
		}
		System.out.println(resultado);
	}

}
