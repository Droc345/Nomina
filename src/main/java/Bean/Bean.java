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
	private Nomina nom ;
    private NominaDAO dao;
    
    

    public Bean() {
		super();
		this.nom = new Nomina();
		this.dao  = new NominaDAO();
	}

	public void registrar(){
        dao.guardar(nom);
        nom = new Nomina();
    }

    public List<Nomina> getLista(){
        return dao.listar();
    }

	public Nomina getNom() {
		return nom;
	}

	public void setNom(Nomina nom) {
		this.nom = nom;
	}
	
	public void Limpiar() {
		dao.listar().clear();
	}
    
    
}