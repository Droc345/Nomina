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
	
	
	public double getsalarioDesvengado() {
		double sd=0, saldia=0;
		saldia= emp.getSalario()/30;
		
		sd=Math.round(saldia*dias);
		return sd;
	}
	
	public double getDescuento(){
		double salud=0;
		
		salud=Math.round(getsalarioDesvengado()*0.04);
		
		return salud;
	}
	
	public String getAuxilio() {
		if(emp.getSalario()<=2000000) {
			return"250000 $";
		}else {
			return "No aplica";
		}
	}
	
	public double getNeto() {
		if(emp.getSalario()<=2000000) {
				return getsalarioDesvengado()-(getDescuento()*2)+250000;
			}else {
				return getsalarioDesvengado()-(getDescuento()*2);
			}
	}
}
