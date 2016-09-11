
public class Empleado
{
    
    private String  name;
    private String  departamento;
    private String  cargo;
    private int     numEmpleado;
    private int     salario;
    
    public Empleado(String name, int numEmpleado, int Salario, String cargo, String departamento) {
        this.name       = name;
        this.numEmpleado = numEmpleado;
        this.salario    = salario;
        this.departamento = departamento;
        this.cargo = cargo;
    }


    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getnumEmpleado() {
        return numEmpleado;
    }
    
    public void setnumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    

    public int getSalario() {
        return salario;
    }
    

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
    public String getCargo() {
        return cargo;
    }
    

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public String getDepartamento() {
        return departamento;
    }
    

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Métodos para imprimir datos
    // ===========================
    /**
     * Muestra los datos de la cuenta en consola
     */
    public void showData() {
        System.out.println("Empleado codigo = " + getnumEmpleado());
        System.out.println("         Nombre = " + getName());
        System.out.println("          Cargo = " + getCargo());
        System.out.println("     partamento = " + getDepartamento());
		System.out.println("   Salario (US$) = " + getSalario());
		System.out.println();  // línea en blanco
	}

}
