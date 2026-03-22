package Bean;

import java.io.Serializable;
import java.util.List;

import ModeloDAO.NominaDAO;
import ModeloDTO.Nomina;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("cdt")
@SessionScoped

public class Bean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Nomina nom = new Nomina();
    private NominaDAO dao = new NominaDAO();

    public String registrar(){

        dao.guardar(nom);
        nom = new Nomina();
        

        return "Datos?faces-redirect=true";
    }

    public List<Nomina> getLista(){
        return dao.listar();
    }
}