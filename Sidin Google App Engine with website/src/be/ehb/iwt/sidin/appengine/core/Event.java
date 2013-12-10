package be.ehb.iwt.sidin.appengine.core;


import java.io.Serializable;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2383629800536599520L;
	
	@Id private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Event(Long id, String name, int acadyear) {
		super();
		this.id = id;
		this.name = name;
		this.acadyear = acadyear;
	}
	private String name;
	private int acadyear;
	
	public Event(String name, int acadyear) {
		super();
		this.name = name;
		this.acadyear = acadyear;
	}
	public Event() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcadyear() {
		return acadyear;
	}
	
	public void setAcadyear(int acadyear) {
		this.acadyear = acadyear;
	}
	
	

}
