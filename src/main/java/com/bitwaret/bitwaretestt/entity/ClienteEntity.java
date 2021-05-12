package com.bitwaret.bitwaretestt.entity;
import java.io.Serializable;
import java.util.Date;

public class ClienteEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id_cte;
	private String nombre_usuario;
	private String contrasenia;
	private String nombre;
	private String apellidos;
	private String correo_electronico;
	private int edad;
	private double estatura;
	private double peso;
	private double imc;
	private double geb;
	private double eta;
	private Date fecha_creacion;
	private Date fecha_actualizacion;
	
	public ClienteEntity() {};
	
	public ClienteEntity(Long id_cte, String nombre_usuario, String contrasenia, String nombre, String apellidos,
			String correo_electronico, int edad, double estatura, double peso, double imc, double geb, double eta,
			Date fecha_creacion, Date fecha_actualizacion) {
		super();
		this.id_cte = id_cte;
		this.nombre_usuario = nombre_usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo_electronico = correo_electronico;
		this.edad = edad;
		this.estatura = estatura;
		this.peso = peso;
		this.imc = imc;
		this.geb = geb;
		this.eta = eta;
		this.fecha_creacion = fecha_creacion;
		this.fecha_actualizacion = fecha_actualizacion;
	}
	public Long getId_cte() {
		return id_cte;
	}
	public void setId_cte(Long id_cte) {
		this.id_cte = id_cte;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getIMC() {
		return imc;
	}
	public void setIMC(double imc) {
		this.imc = imc;
	}
	public double getGEB() {
		return geb;
	}
	public void setGEB(double geb) {
		this.geb = geb;
	}
	public double getETA() {
		return eta;
	}
	public void setETA(double eta) {
		this.eta = eta;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public Date getFecha_actualizacion() {
		return fecha_actualizacion;
	}
	public void setFecha_actualizacion(Date fecha_actualizacion) {
		this.fecha_actualizacion = fecha_actualizacion;
	}

	@Override
	public String toString() {
		return "ClienteEntity [id_cte=" + id_cte + ", nombre_usuario=" + nombre_usuario + ", contrasenia=" + contrasenia
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", correo_electronico=" + correo_electronico
				+ ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", IMC=" + imc + ", GEB=" + geb
				+ ", ETA=" + eta + ", fecha_creacion=" + fecha_creacion + ", fecha_actualizacion=" + fecha_actualizacion
				+ "]";
	}
	
}
