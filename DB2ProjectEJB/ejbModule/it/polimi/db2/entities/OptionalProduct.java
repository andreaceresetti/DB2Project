package it.polimi.db2.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OptionalProduct
 *
 */
@Entity
@Table(name = "optionalProduct", schema = "db2project")
public class OptionalProduct implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private float monthlyFee;
	
	@ManyToMany(mappedBy="optionalProducts")
	private Collection<Order> orders;
	
	@ManyToMany(mappedBy="optionalProducts")
	private Collection<ServicePackage> servicePackages;

	public OptionalProduct() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMonthlyFee() {
		return monthlyFee;
	}


	public void setMonthlyFee(float monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
   
}