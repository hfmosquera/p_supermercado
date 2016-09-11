
public class Supermercado
{
	// Número máximo de empleados
	public static final int MaxEmpleados = 10;
	
	// Cantidad actual de cuentas
	private int noEmpleados = 0;
	
	// Arreglo para almacenar los detalles de la cuenta
	static Empleado myEmpleados[] = new Empleado[MaxEmpleados];
	

	public Empleado findEmpleado(int NumEmpleado) {		
		// revisa cada cuenta
		for(int i=0; i<noEmpleados;i++) {
			Empleado empleado = myEmpleados[i];
			// si coincide el número de la cuenta
			if (empleado.getnumEmpleado() == NumEmpleado) {
				return empleado;
			}
		}
		return null;
	}

	public int getPosition(int NumEmpleado) {		
		for(int i=0; i<noEmpleados;i++) {
			if (myEmpleados[i].getnumEmpleado() == NumEmpleado){
				return i;
			}
		}
		return -1;
	}
	
	public void add(Empleado empleado) {
		if (noEmpleados < MaxEmpleados) {
			myEmpleados[noEmpleados] = empleado;			
			noEmpleados++;
		}		
	}
	
	public void del(Empleado empleado) {
		int numEmpleado = empleado.getnumEmpleado();
		int posicion = getPosition(numEmpleado);
		
		if (posicion != -1) {
			for(int i=posicion; i<noEmpleados;i++) {
				if (i+1 < MaxEmpleados) {
					myEmpleados[i] = null;
				} else {
					myEmpleados[i] = myEmpleados[i+1];
				}
			}
		}
	}
	
	public void showData() {
		System.out.println("== Listado de Empleados ==");
		for(int i=0; i<noEmpleados;i++) {
			Empleado empleado = myEmpleados[i];
			empleado.showData();
			System.out.println();
		}
	}
}
