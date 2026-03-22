package ModeloDAO;

import java.util.ArrayList;
import java.util.List;

import ModeloDTO.Nomina;

public class NominaDAO {
	public static List<Nomina> listaAspirantes = new ArrayList<>();
	
	public void guardar(Nomina n){
        listaAspirantes.add(n);
    }

    public List<Nomina> listar(){
        return listaAspirantes;
    }
}
