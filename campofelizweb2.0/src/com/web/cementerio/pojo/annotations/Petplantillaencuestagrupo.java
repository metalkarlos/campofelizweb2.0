package com.web.cementerio.pojo.annotations;

// Generated 05/03/2014 11:20:16 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Petplantillaencuestagrupo generated by hbm2java
 */
@Entity
@Table(name = "petplantillaencuestagrupo")
public class Petplantillaencuestagrupo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6731140265478011614L;
	private int idplantillaencuestagrupo;
	private Setestado setestado;
	private Petplantillaencuesta petplantillaencuesta;
	private Setusuario setusuario;
	private String grupo;
	private String descripcion;
	private String tag;
	private Date fecharegistro;
	private String iplog;
	private Set<?> petplantillaencuestadets = new HashSet<Object>(0);
	private Set<?> petplantillaencuestadetcasillas = new HashSet<Object>(0);

	public Petplantillaencuestagrupo() {
	}

	public Petplantillaencuestagrupo(int idplantillaencuestagrupo,
			Petplantillaencuesta petplantillaencuesta, Date fecharegistro) {
		this.idplantillaencuestagrupo = idplantillaencuestagrupo;
		this.petplantillaencuesta = petplantillaencuesta;
		this.fecharegistro = fecharegistro;
	}

	public Petplantillaencuestagrupo(int idplantillaencuestagrupo,
			Setestado setestado, Petplantillaencuesta petplantillaencuesta,
			Setusuario setusuario, String grupo, String descripcion,
			String tag, Date fecharegistro, String iplog,
			Set<?> petplantillaencuestadets, Set<?> petplantillaencuestadetcasillas) {
		this.idplantillaencuestagrupo = idplantillaencuestagrupo;
		this.setestado = setestado;
		this.petplantillaencuesta = petplantillaencuesta;
		this.setusuario = setusuario;
		this.grupo = grupo;
		this.descripcion = descripcion;
		this.tag = tag;
		this.fecharegistro = fecharegistro;
		this.iplog = iplog;
		this.petplantillaencuestadets = petplantillaencuestadets;
		this.petplantillaencuestadetcasillas = petplantillaencuestadetcasillas;
	}

	@Id
	@Column(name = "idplantillaencuestagrupo", unique = true, nullable = false)
	public int getIdplantillaencuestagrupo() {
		return this.idplantillaencuestagrupo;
	}

	public void setIdplantillaencuestagrupo(int idplantillaencuestagrupo) {
		this.idplantillaencuestagrupo = idplantillaencuestagrupo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idestado")
	public Setestado getSetestado() {
		return this.setestado;
	}

	public void setSetestado(Setestado setestado) {
		this.setestado = setestado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idplantillaencuesta", nullable = false)
	public Petplantillaencuesta getPetplantillaencuesta() {
		return this.petplantillaencuesta;
	}

	public void setPetplantillaencuesta(
			Petplantillaencuesta petplantillaencuesta) {
		this.petplantillaencuesta = petplantillaencuesta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idusuario")
	public Setusuario getSetusuario() {
		return this.setusuario;
	}

	public void setSetusuario(Setusuario setusuario) {
		this.setusuario = setusuario;
	}

	@Column(name = "grupo", length = 500)
	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Column(name = "descripcion", length = 600)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "tag", length = 200)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecharegistro", nullable = false, length = 29)
	public Date getFecharegistro() {
		return this.fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	@Column(name = "iplog", length = 20)
	public String getIplog() {
		return this.iplog;
	}

	public void setIplog(String iplog) {
		this.iplog = iplog;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "petplantillaencuestagrupo", targetEntity=Petplantillaencuestadet.class)
	public Set<?> getPetplantillaencuestadets() {
		return this.petplantillaencuestadets;
	}

	public void setPetplantillaencuestadets(Set<?> petplantillaencuestadets) {
		this.petplantillaencuestadets = petplantillaencuestadets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "petplantillaencuestagrupo", targetEntity=Petplantillaencuestadetcasilla.class)
	public Set<?> getPetplantillaencuestadetcasillas() {
		return this.petplantillaencuestadetcasillas;
	}

	public void setPetplantillaencuestadetcasillas(
			Set<?> petplantillaencuestadetcasillas) {
		this.petplantillaencuestadetcasillas = petplantillaencuestadetcasillas;
	}

}
