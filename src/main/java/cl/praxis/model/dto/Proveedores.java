package cl.praxis.model.dto;

public class Proveedores {
	private int id;
	private String nombre;
	private String rut;
	private String direccion;
	private String correo;
	private String telefono;
	private String contacto;
	private String fono_contacto;
	
	public Proveedores() {
		super();
	}

	public Proveedores(int id, String nombre, String rut, String direccion, String correo, String telefono,
			String contacto, String fono_contacto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.contacto = contacto;
		this.fono_contacto = fono_contacto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getFono_contacto() {
		return fono_contacto;
	}

	public void setFono_contacto(String fono_contacto) {
		this.fono_contacto = fono_contacto;
	}

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion
				+ ", correo=" + correo + ", telefono=" + telefono + ", contacto=" + contacto + ", fono_contacto="
				+ fono_contacto + "]";
	}
	

}
