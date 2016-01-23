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
import javax.persistence.Transient;

/**
 * Petnoticia generated by hbm2java
 */
@Entity
@Table(name = "petnoticia")
public class Petnoticia implements java.io.Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 28485907092748267L;
	private int idnoticia;
	private Setestado setestado;
	private Setusuario setusuario;
	private String titulo;
	private String descripcion;
	private String tag;
	private Date fecharegistro;
	private String iplog;
	private String rutafoto;
	private Set<Petfotonoticia> petfotonoticias = new HashSet<Petfotonoticia>(0);
	private Date fechamodificacion;
	private Date fechapublicacion;
	private boolean principal;
	private int orden;

	public Petnoticia() {
	}

	public Petnoticia(int idnoticia, Date fecharegistro) {
		this.idnoticia = idnoticia;
		this.fecharegistro = fecharegistro;
	}

	public Petnoticia(int idnoticia, Setestado setestado,
			Setusuario setusuario, String titulo, String descripcion,
			String tag, Date fecharegistro, String iplog, String rutafoto, 
			Set<Petfotonoticia> petfotonoticias, Date fechamodificacion, Date fechapublicacion, boolean principal, int orden) {
		this.idnoticia = idnoticia;
		this.setestado = setestado;
		this.setusuario = setusuario;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.tag = tag;
		this.fecharegistro = fecharegistro;
		this.rutafoto = rutafoto;
		this.iplog = iplog;
		this.petfotonoticias = petfotonoticias;
		this.fechamodificacion = fechamodificacion;
		this.fechapublicacion = fechapublicacion;
		this.principal = principal;
		this.orden = orden;
	}

	@Id
	@Column(name = "idnoticia", unique = true, nullable = false)
	public int getIdnoticia() {
		return this.idnoticia;
	}

	public void setIdnoticia(int idnoticia) {
		this.idnoticia = idnoticia;
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
	@JoinColumn(name = "idusuario")
	public Setusuario getSetusuario() {
		return this.setusuario;
	}

	public void setSetusuario(Setusuario setusuario) {
		this.setusuario = setusuario;
	}

	@Column(name = "titulo", length = 1000)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "descripcion", length = 10000)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Transient
	public String getDescripcionNoTags() {
		return this.descripcion == null ? this.descripcion : this.descripcion.replaceAll("\\<.*?\\>", "");
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

	@Column(name = "rutafoto", length = 100)
	public String getRutafoto() {
		return rutafoto;
	}

	public void setRutafoto(String rutafoto) {
		this.rutafoto = rutafoto;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "petnoticia", targetEntity=Petfotonoticia.class)
	public Set<Petfotonoticia> getPetfotonoticias() {
		return this.petfotonoticias;
	}

	public void setPetfotonoticias(Set<Petfotonoticia> petfotonoticias) {
		this.petfotonoticias = petfotonoticias;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamodificacion", length = 29)
	public Date getFechamodificacion() {
		return fechamodificacion;
	}

	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechapublicacion", nullable = false, length = 29)
	public Date getFechapublicacion() {
		return fechapublicacion;
	}

	public void setFechapublicacion(Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}

	@Column(name = "principal")
	public boolean getPrincipal() {
		return principal;
	}

	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

	@Column(name = "orden")
	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Petnoticia petnoticia = (Petnoticia)super.clone();
		return petnoticia;
	}
	
	public Petnoticia clonar() throws Exception {
		return (Petnoticia)this.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime
				* result
				+ ((fechamodificacion == null) ? 0 : fechamodificacion
						.hashCode());
		result = prime
				* result
				+ ((fechapublicacion == null) ? 0 : fechapublicacion.hashCode());
		result = prime * result
				+ ((fecharegistro == null) ? 0 : fecharegistro.hashCode());
		result = prime * result + idnoticia;
		result = prime * result + ((iplog == null) ? 0 : iplog.hashCode());
		result = prime * result
				+ ((rutafoto == null) ? 0 : rutafoto.hashCode());
		result = prime * result
				+ ((setestado == null) ? 0 : setestado.getIdestado());
		result = prime * result
				+ ((setusuario == null) ? 0 : setusuario.getIdusuario());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + (principal ? 1231 : 1237);
		result = prime * result + orden;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Petnoticia other = (Petnoticia) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fechamodificacion == null) {
			if (other.fechamodificacion != null)
				return false;
		} else if (!fechamodificacion.equals(other.fechamodificacion))
			return false;
		if (fechapublicacion == null) {
			if (other.fechapublicacion != null)
				return false;
		} else if (!fechapublicacion.equals(other.fechapublicacion))
			return false;
		if (fecharegistro == null) {
			if (other.fecharegistro != null)
				return false;
		} else if (!fecharegistro.equals(other.fecharegistro))
			return false;
		if (idnoticia != other.idnoticia)
			return false;
		if (iplog == null) {
			if (other.iplog != null)
				return false;
		} else if (!iplog.equals(other.iplog))
			return false;
		if (rutafoto == null) {
			if (other.rutafoto != null)
				return false;
		} else if (!rutafoto.equals(other.rutafoto))
			return false;
		if (setestado == null) {
			if (other.setestado != null)
				return false;
		} else if (setestado.getIdestado() != other.setestado.getIdestado())
			return false;
		if (setusuario == null) {
			if (other.setusuario != null)
				return false;
		} else if (setusuario.getIdusuario() != other.setusuario.getIdusuario())
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		if (principal != other.principal)
			return false;
		if (orden != other.orden)
			return false;
		return true;
	}

}
