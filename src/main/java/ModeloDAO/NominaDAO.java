package ModeloDAO;

import java.util.ArrayList;
import java.util.List;

import ModeloDTO.Nomina;

public class NominaDAO {
	public static List<Nomina> nominas = new ArrayList<>();
	
	public void guardar(Nomina n){
        nominas.add(n);
    }

    public List<Nomina> listar(){
        return nominas;
    }
    
    public void eliminar(Nomina n) {
        nominas.removeIf(x -> x.getEmp().getId() == n.getEmp().getId());
    }
}
