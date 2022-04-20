package ar.edu.unlam.pb2;

public class Cliente {

	private String nombre;
	private Integer idCliente;

	public Cliente(Integer idCliente, String nombre) {
		this.idCliente = idCliente;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

}
