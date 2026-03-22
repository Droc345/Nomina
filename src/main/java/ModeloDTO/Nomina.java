package ModeloDTO;

public class Nomina {
	private int dias;
	private Empleado emp;
	
	public Nomina() {
		super();
		this.dias = 0;
		this.emp = new Empleado();
	}
	
	public Nomina(int dias, Empleado emp) {
		super();
		this.dias = dias;
		this.emp = emp;
	}


	public int getDias() {
		return dias;
	}


	public void setDias(int dias) {
		this.dias = dias;
	}


	public Empleado getEmp() {
		return emp;
	}


	public void setEmp(Empleado emp) {
		this.emp = emp;
	}
	
	
}
